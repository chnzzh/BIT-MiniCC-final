# -*- coding: utf-8 -*-
"""
@author: Zheng Zhihan
@file: ASTNode.py
@time: 2021/06/03
@update: 2021/07/05
@description: 对树进行分析
"""

from SymbolTable import SymbolTable

proc_var = []
l4 = []
var_l4_dict = {}
err = []

func_list = {}  # type, name, l4
func_list['f0'] = {'type': None, 'table': None, 'sys_data':None, 'func_name': 'START'}

asm = []
asm_sys_data = []
asm_usr_data = []
asm_jp_flag = []


class ASTNode(object):
    pass


class ASTNode:
    def __init__(self, ast_type: str, father: ASTNode = None):
        self.atype = ast_type
        self.father = father
        self.child = []
        self.table = None
        self.current_func = None

        if ast_type == 'compoundStatement':
            self.table = SymbolTable()

        if ast_type == 'functionDefinition':

            self.current_func = f'f{len(func_list)}'
            func_list[self.current_func] = {}
        elif father is None:
            self.current_func = 'f1'
        else:
            self.current_func = father.current_func


    def getTableNode(self):
        if self.father is None:
            return None
        node = self.father
        while node.atype != 'compoundStatement':
            node = node.father
        return node

    def getTableDict(self):
        node = self.getTableNode()
        table = {}
        table.update(node.table.table)
        while node.getTableNode() is not None:
            node = node.getTableNode()
            table.update(node.table.table)
        return table


def translate(node: ASTNode):
    if node.atype == 'typeSpecifier':
        return node.child[0][0]
    elif node.atype == 'initDeclarator':
        var_1 = translate(node.child[0])
        var_2 = translate(node.child[2])
        l4.append(['=', var_2, None, var_1])
        # print(f'(=, {var_2}, , {var_1})')

        if type(var_1) is str and var_1[-1] == ']':
            index = var_1.split('[')[-1][:-1]
            asm.append(['MOV', 'EDI', f'{index}'])
            var_1 = var_1.split('[')[0] + '[EDI*4]'

        if type(var_2) is str and var_2[-1] == ']':
            index = var_2.split('[')[-1][:-1]
            asm.append(['MOV', 'ESI', f'{index}'])
            var_2 = var_2.split('[')[0] + '[ESI*4]'

        if type(var_2) is int:
            asm.append(['MOV', f'{var_1}', var_2])
        else:
            asm.append(['MOV', 'EAX', f'{var_2}'])
            asm.append(['MOV', f'{var_1}', 'EAX'])

        return var_1
    elif node.atype == 'declarator':
        sign = node.child[-1]
        if sign[0] == 'Identifier':
            return sign[-1]
        elif sign[0] == 'RBRACK':   # 数组
            l_name = translate(node.child[0])
            l_length = translate(node.child[2])
            return f'{l_name}[{l_length}]'

    elif node.atype == 'initDeclaratorList':
        vl = [translate(node.child[0])]
        vl_ex = translate(node.child[-1])
        if type(vl_ex) is str:
            vl.append(vl_ex)
        else:
            vl.extend(vl_ex)
        return vl
    elif node.atype == 'declaration':  # 声明
        # 变量定义
        child_0 = translate(node.child[0])  # typeSpecifier type

        var = []
        child_1 = node.child[1]
        if node.child[1].atype == 'declarator':  # 单个变量定义
            var.append(translate(child_1))
        elif node.child[1].atype == 'initDeclaratorList':
            var.extend(translate(child_1))
        elif node.child[1].atype == 'initDeclarator':
            var.append(translate(child_1))

        for i in var:
            # 检查是否重复定义
            """if i in node.getTableDict():
                print(f'ERR: {i} Defined Again')
                err.append(f'ERR: {i} Defined Again')
            else:
                func_list[node.current_func]['table'].add(child_0, i)
                node.getTableNode().table.add(child_0, i)"""
            func_list[node.current_func]['table'].add(child_0, i)
            node.getTableNode().table.add(child_0, i)

    elif node.atype == 'primaryExpression':
        if len(node.child) == 1:
            if node.child[0][0] == 'Identifier':
                return node.child[0][-1]
            elif node.child[0][0] == 'IntegerConstant':
                return int(node.child[0][-1])
            elif node.child[0][0] == 'String':
                asm_usr_data.append((f'u{len(asm_usr_data)}', 'String', node.child[0][-1]))
                return f'offset u{len(asm_usr_data)-1}'

        else:
            return translate(node.child[1])  # 括号
    elif node.atype == 'unaryExpression':
        if type(node.child[-1]) is list:
            if node.child[-1][-1] in ['++', '--']:
                var = translate(node.child[0])
                op = node.child[-1][-1]
                if op == '++':
                    asm.append(['INC', f'{var}'])
                elif op == '--':
                    asm.append(['DEC', f'{var}'])

            elif node.child[-1][-1] == ']':     # 数组
                l_name = translate(node.child[0])

                current_func = node.current_func
                sys_data = func_list[current_func]['sys_data']
                var = f'v{len(sys_data)}'
                func_list[current_func]['sys_data'].append(var)
                l_index = translate(node.child[2])
                return f'{l_name}[{l_index}]'

            elif node.child[-1][-1] == ')':  # 函数返回值

                operator = '='
                current_func = node.current_func
                sys_data = func_list[current_func]['sys_data']
                var = f'v{len(sys_data)}'
                func_list[current_func]['sys_data'].append(var)
                func = translate(node.child[0])
                asm.append(['PUSH', 'EAX'])
                if type(node.child[2]) is not list:
                    para = translate(node.child[2])

                    if type(para) is str and para[-1] == ']':
                        index = para.split('[')[-1][:-1]
                        asm.append(['MOV', 'EDI', f'{index}'])
                        para = para.split('[')[0] + '[EDI*4]'

                    asm.append(['MOV', 'EAX', f'{para}'])
                asm.append(['CALL', f'{func}'])
                asm.append(['MOV', f'{var}', 'EAX'])
                asm.append(['POP', 'EAX'])
                l4.append([operator, var, None, func])
        else:
            operator = node.child[1][-1]
            var = translate(node.child[0])
            l4.append([operator, var, None, var])
        # print(f'({operator}, {var}, , {var})')
        return var

    elif node.atype in ['additiveExpression', 'multiplicativeExpression']:
        var_1 = translate(node.child[0])
        """if var_1 not in node.getTableDict() and type(var_1) is str and var_1[0] != '%':
            print(f'ERR: {var_1} is Not Defined')
            err.append(f'ERR: {var_1} is Not Defined')"""

        operator = node.child[1][-1]

        var_2 = translate(node.child[2])
        """if var_2 not in node.getTableDict() and type(var_2) is str and var_2[0] != '%':
            print(f'ERR: {var_2} is Not Defined')
            err.append(f'ERR: {var_2} is Not Defined')"""

        var_base = f'%{len(proc_var) + 1}'
        proc_var.append(var_base)
        l4.append([operator, var_1, var_2, var_base])
        var_l4_dict[var_base] = len(l4) - 1
        # print(f'({operator}, {var_1}, {var_2}, {var_base})')
        current_func= node.current_func
        sys_data = func_list[current_func]['sys_data']
        var = f'v{len(sys_data)}'
        func_list[current_func]['sys_data'].append(var)

        if type(var_1) is str and var_1[-1] == ']':
            index = var_1.split('[')[-1][:-1]
            asm.append(['MOV', 'EDI', f'{index}'])
            var_1 = var_1.split('[')[0] + '[EDI*4]'

        asm.append(['MOV', 'EAX', f'{var_1}'])
        if operator == '+':
            asm.append(['ADD', 'EAX', f'{var_2}'])
        elif operator == '-':
            asm.append(['SUB', 'EAX', f'{var_2}'])
        elif operator == '*':
            asm.append(['MUL', f'{var_2}'])
        elif operator == '/':
            asm.append(['DIV', f'{var_2}'])
        elif operator == '%':
            asm.append(['DIV', f'{var_2}'])
            asm.append(['MOV', 'EAX', 'EDX'])

        asm.append(['MOV', f'{var}', 'EAX'])

        return var
    elif node.atype == 'assignmentExpression':
        var_1 = translate(node.child[0])
        # 检查是否未定义
        """if var_1 not in node.getTableDict() and type(var_1) is str and var_1[0] != '%':
            print(f'ERR: {var_1} is Not Defined')
            err.append(f'ERR: {var_1} is Not Defined')"""

        operator = node.child[1].child[0][-1]
        var_2 = translate(node.child[2])
        # 检查是否未定义
        """if var_2 not in node.getTableDict() and type(var_2) is str and var_2[0] != '%':
            print(f'ERR: {var_2} is Not Defined')
            err.append(f'ERR: {var_2} is Not Defined')"""

        l4.append([operator, var_2, None, var_1])

        if operator == '=':
            if type(var_1) is str and var_1[-1] == ']':
                index = var_1.split('[')[-1][:-1]
                asm.append(['MOV', 'EDI', f'{index}'])
                var_1 = var_1.split('[')[0] + '[EDI*4]'
            if type(var_2) is str and var_2[-1] == ']':
                index = var_2.split('[')[-1][:-1]
                asm.append(['MOV', 'ESI', f'{index}'])
                var_2 = var_2.split('[')[0] + '[ESI*4]'

            if type(var_2) is int:
                asm.append(['MOV', f'{var_1}', var_2])
            else:
                asm.append(['MOV', 'ECX', f'{var_2}'])

                asm.append(['MOV', f'{var_1}', 'ECX'])

        # print(f'({operator}, {var_2}, , {var_1})')
        return var_1
    elif node.atype == 'relationalExpression':
        var_1 = translate(node.child[0])

        if type(var_1) is str and var_1[-1] == ']':
            index = var_1.split('[')[-1][:-1]
            asm.append(['MOV', 'EDI', f'{index}'])
            var_1 = var_1.split('[')[0] + '[EDI*4]'

        asm.append(['MOV', 'EBX', f'{var_1}'])
        var_2 = translate(node.child[2])
        operator = node.child[1][-1]

        if type(var_2) is str and var_2[-1] == ']':
            index = var_2.split('[')[-1][:-1]
            asm.append(['MOV', 'ESI', f'{index}'])
            var_2 = var_2.split('[')[0] + '[ESI*4]'

        asm.append(['CMP', 'EBX', f'{var_2}'])
        jcc = 'JMP'
        if operator == '<':
            jcc = 'JNL'
        elif operator == '>':
            jcc = 'JNG'
        elif operator == '<=':
            jcc = 'JNLE'
        elif operator == '>=':
            jcc = 'JNGE'
        elif operator == '==':
            jcc = 'JNZ'
        elif operator == '!=':
            jcc = 'JZ'

        asm.append([f'{jcc}', len(asm)+1])

        var_base = f'%{len(proc_var) + 1}'
        proc_var.append(var_base)
        l4.append([operator, var_1, var_2, var_base])
        var_l4_dict[var_base] = len(l4) - 1
        return var_base

    elif node.atype == 'jumpStatement':
        jump_type = node.child[0][0]
        loop_node = node.father
        if jump_type == 'BREAK':
            asm.append(['JMP', 'BREAK'])
            if loop_node.atype == 'compoundStatement':  # 加了大括号的循环
                loop_node = loop_node.father
            """if loop_node.atype != 'loopStatement':
                print(f'ERR: break Not in Loop')
                err.append(f'ERR: break Not in Loop')"""
        elif jump_type == 'RETURN':
            rt_var = translate(node.child[1])
            asm.append(['MOV', 'EAX', f'{rt_var}'])

    elif node.atype == 'loopStatement':
        loop_type = node.child[0][0]

        if loop_type == 'FOR':
            i = 2
            c = None
            s = None
            e = None
            back_c = None
            back_s = None
            back_e = None
            if type(node.child[i]) is not list:
                # 第一个expression
                translate(node.child[i])

                # back_c
                asm.append(['JMP', 'c'])
                back_c = len(asm) - 1

                i += 1
            i += 1  # ;
            jump_no = 0

            # 这里设置回调点s
            s = f'J{len(asm_jp_flag)}'
            asm_jp_flag.append(s)
            asm.append([f'{s}:'])

            if type(node.child[-3]) is not list:
                # 第三个expression
                translate(node.child[-3])

            # 这里设置回调点c
            c = f'J{len(asm_jp_flag)}'
            asm_jp_flag.append(c)
            asm.append([f'{c}:'])

            if type(node.child[i]) is not list:
                # 第二个expression
                rt1_var = translate(node.child[i])
                jump_no = var_l4_dict[rt1_var]
                i += 1
                # back_e
                back_e = len(asm)-1
            else:
                l4.append(['pass', None, None, None])
                jump_no = len(l4) - 1

            # 进入循环

            translate(node.child[-1])

            # back_s
            asm.append(['JMP', 's'])
            back_s = len(asm) - 1

            # 这里设置回调点e
            e = f'J{len(asm_jp_flag)}'
            asm_jp_flag.append(e)
            asm.append([f'{e}:'])

            if back_s is not None:
                asm[back_s][-1] = s
            if back_c is not None:
                asm[back_c][-1] = c
            if back_e is not None:
                asm[back_e][-1] = e

            for i in range(len(asm)):
                if asm[i][-1] == 'BREAK':
                    asm[i][-1] = e

    elif node.atype == 'selectionStatement':
        select_type = node.child[0][0]

        if select_type == 'IF':
            translate(node.child[2])

            jump_not_index = len(asm) - 1

            l4.append(['jt', None, None, len(l4) + 2])
            l4.append(['jf', None, None, 0])
            jf_no = len(l4) - 1

            translate(node.child[4])
            jend = f'J{len(asm_jp_flag)}'
            asm_jp_flag.append(jend)
            asm.append(['JMP', f'{jend}'])

            jf = f'J{len(asm_jp_flag)}'
            asm_jp_flag.append(jf)
            asm.append([f'{jf}:'])
            asm[jump_not_index][-1] = jf

            l4.append(['j', None, None, 0])
            j_no = len(l4) - 1
            l4[jf_no][-1] = len(l4)
            if len(node.child) == 7:
                translate(node.child[6])
            l4[j_no][-1] = len(l4)
            asm.append([f'{jend}:'])

    elif node.atype == 'programList':
        for i in node.child:
            translate(i)

    elif node.atype == 'functionDefinition':
        f = {'type': translate(node.child[0])}
        fname = translate(node.child[1].child[0])
        asm.append([f'{fname}', 'PROC'])

        f['table'] = SymbolTable()
        f['sys_data'] = []
        f['func_name'] = fname
        para = node.child[1].child[2]
        if type(para) is not list:
            # 有参数传递
            ptype = translate(para.child[0])
            pname = translate(para.child[1])
            f['table'].add(ptype, pname)
            asm.append(['MOV', f'{pname}', 'EAX'])

        current_func = node.current_func
        func_list[current_func] = f

        l4.append(['DEF', None, None, fname])

        translate(node.child[-1])

        asm.append(['RET'])
        asm.append([f'{fname}', 'ENDP'])

    elif node.atype == 'fordeclaration':

        ntype = translate(node.child[0])
        name = translate(node.child[-1].child[0])
        func_list[node.current_func]['table'].add(ntype, name)
        translate(node.child[-1])

    else:
        for i in node.child:
            if type(i) is not list:
                translate(i)
