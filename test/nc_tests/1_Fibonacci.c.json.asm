
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
u1 BYTE "This number's fibonacci value is :" ,0ah,0
.code
fibonacci PROC
LOCAL num:DWORD
LOCAL res:DWORD
LOCAL v0:DWORD
LOCAL v1:DWORD
LOCAL v2:DWORD
LOCAL v3:DWORD
LOCAL v4:DWORD
MOV num , EAX
MOV EBX , num
CMP EBX , 1
JNL J1
MOV res , 0
JMP J0
J1:
MOV EBX , num
CMP EBX , 2
JNLE J3
MOV res , 1
JMP J2
J3:
PUSH EAX
MOV EAX , num
SUB EAX , 1
MOV v1 , EAX
MOV EAX , v1
CALL fibonacci
MOV v0 , EAX
POP EAX
PUSH EAX
MOV EAX , num
SUB EAX , 2
MOV v3 , EAX
MOV EAX , v3
CALL fibonacci
MOV v2 , EAX
POP EAX
MOV EAX , v0
ADD EAX , v2
MOV v4 , EAX
MOV ECX , v4
MOV res , ECX
J2:
J0:
MOV EAX , res
RET
fibonacci ENDP
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
CALL fibonacci
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
