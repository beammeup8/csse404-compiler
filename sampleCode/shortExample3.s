	.file "sampleCode/shortExample3.java"
	.def ___main; .scl 2; .type 32; .endef
	.intel_syntax noprefix
	.section .rdata, "dr"
LC0:
	.ascii "%d\0"
	.text
	.globl _main
	.def _main; .scl 2; .type 32; .endef
_main:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	and esp, -16
	sub esp, 16
	call ___main
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 20
	mov EBX, 0
	mov DWORD PTR [ESP], EBX
	call _malloc
	mov DWORD PTR [EBP - 4], EAX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 8], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 12], EBX
	push DWORD PTR [EBP - 12]
	call _temp1351
	pop DWORD PTR [EBP - 12]
	mov EBX, EAX
	mov DWORD PTR [EBP - 16], EBX
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 20
	popad
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1351:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 4
	mov EBX, 26
	mov DWORD PTR [EBP - 4], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 4
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc


	.ident "Error 404: Compiler Not Found"
	.def _malloc; .scl 2; .type 32; .endef
	.def _printf; .scl 2; .type 32; .endef
