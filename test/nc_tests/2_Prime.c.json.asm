
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

u0 BYTE "Please input a number:" ,0ah,0
u1 BYTE "The number of prime numbers within n is:" ,0ah,0
.code
prime PROC
LOCAL n:DWORD
LOCAL sum:DWORD
LOCAL i:DWORD
LOCAL j:DWORD
LOCAL flag:DWORD
LOCAL v0:DWORD
LOCAL v1:DWORD
LOCAL v2:DWORD
MOV n , EAX
MOV sum , 0
MOV flag , 1
MOV i , 2
JMP J1
J0:
INC i
J1:
MOV EBX , i
CMP EBX , n
JNLE J9
MOV flag , 1
MOV j , 2
JMP J3
J2:
INC j
J3:
MOV EAX , j
MUL j
MOV v0 , EAX
MOV EBX , v0
CMP EBX , i
JNLE J6
MOV EAX , i
DIV j
MOV EAX , EDX
MOV v1 , EAX
MOV EBX , v1
CMP EBX , 0
JNZ J5
MOV flag , 0
JMP J6
JMP J4
J5:
J4:
JMP J2
J6:
MOV EBX , flag
CMP EBX , 1
JNZ J8
INC sum
PUSH EAX
MOV EAX , i
invoke printf, offset pfint, EAX
MOV v2 , EAX
POP EAX
JMP J7
J8:
J7:
JMP J0
J9:
MOV EAX , sum
RET
prime ENDP
main PROC
LOCAL n:DWORD
LOCAL res:DWORD
LOCAL v0:DWORD
LOCAL v1:DWORD
LOCAL v2:DWORD
LOCAL v3:DWORD
LOCAL v4:DWORD
PUSH EAX
MOV EAX , offset u0
invoke printf, offset pfstr, EAX
MOV v0 , EAX
POP EAX
PUSH EAX
invoke scanf, offset sfint, offset sfbuf
MOV EAX, sfbuf
MOV v1 , EAX
POP EAX
MOV EAX , v1
MOV n , EAX
PUSH EAX
MOV EAX , n
CALL prime
MOV v2 , EAX
POP EAX
MOV EAX , v2
MOV res , EAX
PUSH EAX
MOV EAX , offset u1
invoke printf, offset pfstr, EAX
MOV v3 , EAX
POP EAX
PUSH EAX
MOV EAX , res
invoke printf, offset pfint, EAX
MOV v4 , EAX
POP EAX
MOV EAX , 0
RET
main ENDP

start:
call main
ret
end start
