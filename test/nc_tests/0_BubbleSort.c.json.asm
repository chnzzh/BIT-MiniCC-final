
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

u0 BYTE "please input ten int number for bubble sort:" ,0ah,0
u1 BYTE "before bubble sort:" ,0ah,0
u2 BYTE 0ah,0
u3 BYTE "after bubble sort:" ,0ah,0
.code
main PROC
LOCAL a[10]:DWORD
LOCAL i:DWORD
LOCAL j:DWORD
LOCAL tmp:DWORD
LOCAL v0:DWORD
LOCAL v1:DWORD
LOCAL v2:DWORD
LOCAL v3:DWORD
LOCAL v4:DWORD
LOCAL v5:DWORD
LOCAL v6:DWORD
LOCAL v7:DWORD
LOCAL v8:DWORD
LOCAL v9:DWORD
LOCAL v10:DWORD
LOCAL v11:DWORD
LOCAL v12:DWORD
LOCAL v13:DWORD
LOCAL v14:DWORD
LOCAL v15:DWORD
LOCAL v16:DWORD
LOCAL v17:DWORD
LOCAL v18:DWORD
LOCAL v19:DWORD
LOCAL v20:DWORD
PUSH EAX
MOV EAX , offset u0
invoke printf, offset pfstr, EAX
MOV v0 , EAX
POP EAX
MOV i , 0
JMP J1
J0:
INC i
J1:
MOV EBX , i
CMP EBX , 10
JNL J2
PUSH EAX
invoke scanf, offset sfint, offset sfbuf
MOV EAX, sfbuf
MOV v2 , EAX
POP EAX
MOV EDI , i
MOV ECX , v2
MOV a[EDI*4] , ECX
JMP J0
J2:
PUSH EAX
MOV EAX , offset u1
invoke printf, offset pfstr, EAX
MOV v3 , EAX
POP EAX
MOV i , 0
JMP J4
J3:
INC i
J4:
MOV EBX , i
CMP EBX , 10
JNL J5
PUSH EAX
MOV EDI , i
MOV EAX , a[EDI*4]
invoke printf, offset pfint, EAX
MOV v4 , EAX
POP EAX
JMP J3
J5:
PUSH EAX
MOV EAX , offset u2
invoke printf, offset pfstr, EAX
MOV v6 , EAX
POP EAX
MOV i , 0
JMP J7
J6:
INC i
J7:
MOV EBX , i
CMP EBX , 10
JNL J13
MOV j , 0
JMP J9
J8:
INC j
J9:
MOV EBX , j
MOV EAX , 10
SUB EAX , i
MOV v7 , EAX
MOV EAX , v7
SUB EAX , 1
MOV v8 , EAX
CMP EBX , v8
JNL J12
MOV EDI , j
MOV EBX , a[EDI*4]
MOV EAX , j
ADD EAX , 1
MOV v11 , EAX
MOV ESI , v11
CMP EBX , a[ESI*4]
JNG J11
MOV ESI , j
MOV EAX , a[ESI*4]
MOV tmp , EAX
MOV EAX , j
ADD EAX , 1
MOV v15 , EAX
MOV EDI , j
MOV ESI , v15
MOV ECX , a[ESI*4]
MOV a[EDI*4] , ECX
MOV EAX , j
ADD EAX , 1
MOV v17 , EAX
MOV EDI , v17
MOV ECX , tmp
MOV a[EDI*4] , ECX
JMP J10
J11:
J10:
JMP J8
J12:
JMP J6
J13:
PUSH EAX
MOV EAX , offset u3
invoke printf, offset pfstr, EAX
MOV v18 , EAX
POP EAX
MOV i , 0
JMP J15
J14:
INC i
J15:
MOV EBX , i
CMP EBX , 10
JNL J16
PUSH EAX
MOV EDI , i
MOV EAX , a[EDI*4]
invoke printf, offset pfint, EAX
MOV v19 , EAX
POP EAX
JMP J14
J16:
MOV EAX , 0
RET
main ENDP

start:
call main
ret
end start
