	.file "sampleCode/Factorial.java"
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
	sub ESP, 12
	mov EBX, 0
	mov DWORD PTR [ESP], EBX
	call _malloc
	mov DWORD PTR [EBP - 4], EAX
	mov EBX, 5
	mov DWORD PTR [EBP - 8], EBX
	push DWORD PTR [EBP - 8]
	push DWORD PTR [EBP - 4]
	call _temp723
	pop DWORD PTR [EBP - 4]
	pop DWORD PTR [EBP - 8]
	mov EBX, EAX
	mov DWORD PTR [EBP - 12], EBX
	mov EAX, DWORD PTR [EBP - 12]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 12
	popad
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp723:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 56
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 12]
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 8], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 12], EBX
	mov EAX, DWORD PTR [EBP - 8]
	mov EBX, DWORD PTR [EBP - 12]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 16], EAX
	je _label94
	mov EBX, 1
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 24], EBX
	jmp _label95
_label94:
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 28], EBX
	mov EDX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 36], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 40], EBX
	mov EAX, DWORD PTR [EBP - 36]
	mov EBX, DWORD PTR [EBP - 40]
	sub EAX, EBX
	mov DWORD PTR [EBP - 44], EAX
	push DWORD PTR [EBP - 44]
	push DWORD PTR [EBP - 32]
	call _temp723
	pop DWORD PTR [EBP - 32]
	pop DWORD PTR [EBP - 44]
	mov EBX, EAX
	mov DWORD PTR [EBP - 48], EBX
	mov EAX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 48]
	imul EAX, EBX
	mov DWORD PTR [EBP - 52], EAX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 24], EBX
_label95:
	mov EBX, DWORD PTR [EBP - 24]
	mov DWORD PTR [EBP - 56], EBX
	mov EBX, DWORD PTR [EBP - 56]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 56
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc


	.ident "Error 404: Compiler Not Found"
	.def _malloc; .scl 2; .type 32; .endef
	.def _printf; .scl 2; .type 32; .endef
