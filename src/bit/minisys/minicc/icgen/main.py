# -*- coding: utf-8 -*-
"""
@author: Zheng Zhihan
@file: main.py
@time: 2021/06/02
@description: main
"""

import sys
import json
from ASTNode import ASTNode, translate, func_list, asm, asm_usr_data, asm_sys_data


def open_ast(path):
    with open(path, 'r') as f:
        try:
            dict_ast = json.load(f)
        except Exception:
            print('ERR: load json failed')
            return False
        else:
            return dict_ast


def node_view(dict_node: dict, father: ASTNode):

    if len(dict_node) == 1:
        # 不为终结符
        node_type = list(dict_node.items())[0][0]
        me = ASTNode(node_type, father)

        father.child.append(me)
        if me not in all_node:
            all_node.append(me)
        for child in list(dict_node.items())[0][1]:
            node_view(child, me)

    else:
        terminal = []
        for info in dict_node.values():
            terminal.append(info)
        father.child.append(terminal)


if __name__ == '__main__':

    ast_path = sys.argv[1]
    ast = open_ast(ast_path)
    if not ast:
        exit(0)

    all_node = []
    root = ASTNode('compoundStatement')
    node_view(ast, root)

    translate(root.child[0])

    f = open(f'{ast_path}.asm', 'w')

    head = """
.386
.model flat, stdcall
option casemap:none

includelib C:\masm32\lib\msvcrt.lib

scanf	proto	C:dword, :VARARG
printf	proto	C:dword, :VARARG

.data
sfint  byte	'%d', 0
pfstr  byte	'%s', 0
sfbuf	dd	?
pfint	 byte	'%d ', 0
"""
    print(head, file=f)

    for i in asm_usr_data:
        if i[1] == 'String':
            content = i[2].replace('\\n', '')
            if content != '\"\"':
                print(i[0], 'BYTE', f'{content}', ',0ah,0', file=f)
            else:
                print(i[0], 'BYTE', '0ah,0', file=f)
    print('.code', file=f)
    for i in asm:
        if len(i) == 1:
            print(i[0], file=f)
        elif len(i) == 2:
            if i[-1] == 'Mars_PrintStr':
                print('invoke printf, offset pfstr, EAX', file=f)
            elif i[-1] == 'Mars_PrintInt':
                print('invoke printf, offset pfint, EAX', file=f)
            elif i[-1] == 'Mars_GetInt':
                print('invoke scanf, offset sfint, offset sfbuf', file=f)
                print('MOV EAX, sfbuf', file=f)
            else:
                print(i[0], i[1], file=f)
        else:
            print(i[0], i[1], ',', i[2], file=f)

        if i[-1] == 'PROC':
            for j in func_list.values():
                if j['func_name'] == i[0]:
                    print(j['table'].table)
                    for k in j['table'].table.keys():
                        print(f'LOCAL {k}:DWORD', file=f)
                    break
            for j in func_list.values():
                if j['func_name'] == i[0]:
                    print(j)
                    for k in j['sys_data']:
                        print(f'LOCAL {k}:DWORD', file=f)
                    break
    end = """
start:
call main
ret
end start"""

    print(end, file=f)
    f.close()