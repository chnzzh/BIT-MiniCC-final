# -*- coding: utf-8 -*-
"""
@author: Zheng Zhihan
@file: SymbolTable.py
@time: 2021/06/03
@description: 符号表
"""


class SymbolTable:

    def __init__(self):
        self.table = {}

    def add(self, type: str, name: str):
        if type is not None and name is not None:
            self.table[name] = type
