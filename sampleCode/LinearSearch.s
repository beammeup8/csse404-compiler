	.file "sampleCode/LinearSearch.java"
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
	mov EBX, 8
	mov DWORD PTR [ESP], EBX
	call _malloc
	mov DWORD PTR [EBP - 4], EAX
	mov EBX, 10
	mov DWORD PTR [EBP - 8], EBX
	push DWORD PTR [EBP - 8]
	push DWORD PTR [EBP - 4]
	call _temp817
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

_temp817:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 88
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 12]
	mov EDX, DWORD PTR [EBP - 8]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 12], EBX
	push DWORD PTR [EBP - 12]
	push DWORD PTR [EBP - 8]
	call _temp820
	pop DWORD PTR [EBP - 8]
	pop DWORD PTR [EBP - 12]
	mov EBX, EAX
	mov DWORD PTR [EBP - 16], EBX
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 20], EBX
	mov EDX, DWORD PTR [EBP - 24]
	mov EDX, DWORD PTR [EBP + 8]
	push DWORD PTR [EBP - 24]
	call _temp818
	pop DWORD PTR [EBP - 24]
	mov EBX, EAX
	mov DWORD PTR [EBP - 28], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 32], EBX
	mov EBX, 9999
	mov DWORD PTR [EBP - 36], EBX
	mov EAX, DWORD PTR [EBP - 36]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EDX, DWORD PTR [EBP - 40]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, 8
	mov DWORD PTR [EBP - 44], EBX
	push DWORD PTR [EBP - 44]
	push DWORD PTR [EBP - 40]
	call _temp819
	pop DWORD PTR [EBP - 40]
	pop DWORD PTR [EBP - 44]
	mov EBX, EAX
	mov DWORD PTR [EBP - 48], EBX
	mov EAX, DWORD PTR [EBP - 48]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EDX, DWORD PTR [EBP - 52]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, 12
	mov DWORD PTR [EBP - 56], EBX
	push DWORD PTR [EBP - 56]
	push DWORD PTR [EBP - 52]
	call _temp819
	pop DWORD PTR [EBP - 52]
	pop DWORD PTR [EBP - 56]
	mov EBX, EAX
	mov DWORD PTR [EBP - 60], EBX
	mov EAX, DWORD PTR [EBP - 60]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EDX, DWORD PTR [EBP - 64]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, 17
	mov DWORD PTR [EBP - 68], EBX
	push DWORD PTR [EBP - 68]
	push DWORD PTR [EBP - 64]
	call _temp819
	pop DWORD PTR [EBP - 64]
	pop DWORD PTR [EBP - 68]
	mov EBX, EAX
	mov DWORD PTR [EBP - 72], EBX
	mov EAX, DWORD PTR [EBP - 72]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EDX, DWORD PTR [EBP - 76]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, 50
	mov DWORD PTR [EBP - 80], EBX
	push DWORD PTR [EBP - 80]
	push DWORD PTR [EBP - 76]
	call _temp819
	pop DWORD PTR [EBP - 76]
	pop DWORD PTR [EBP - 80]
	mov EBX, EAX
	mov DWORD PTR [EBP - 84], EBX
	mov EAX, DWORD PTR [EBP - 84]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, 55
	mov DWORD PTR [EBP - 88], EBX
	mov EBX, DWORD PTR [EBP - 88]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 88
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp818:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 60
	mov EBX, 1
	mov DWORD PTR [EBP - 4], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 8], EBX
_label96:
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 12], EBX
	mov EDX, DWORD PTR [EBP - 16]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 20]
	mov EBX, DWORD PTR [EBP - 16]
	mov EDX, DWORD PTR [EBX + 4]
	mov EAX, DWORD PTR [EBP - 12]
	mov EBX, DWORD PTR [EBP - 20]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 24], EAX
	je _label97
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 32]
	mov EBX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 36], EBX
	mov EAX, DWORD PTR [EBP - 36]
	add EAX, 1
	mov DWORD PTR [EBP - 40], EAX
	mov EAX, DWORD PTR [EBP - 40]
	imul EAX, 4
	mov DWORD PTR [EBP - 40], EAX
	mov EDX, DWORD PTR [EBP - 44]
	mov EBX, DWORD PTR [EBP - 32]
	mov ECX, DWORD PTR [EBP - 40]
	mov EDX, DWORD PTR [EBX + ECX]
	mov EAX, DWORD PTR [EBP - 44]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 48], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 52], EBX
	mov EAX, DWORD PTR [EBP - 48]
	mov EBX, DWORD PTR [EBP - 52]
	add EAX, EBX
	mov DWORD PTR [EBP - 56], EAX
	mov EBX, DWORD PTR [EBP - 56]
	mov DWORD PTR [EBP - 8], EBX
	jmp _label96
_label97:
	mov EBX, 0
	mov DWORD PTR [EBP - 60], EBX
	mov EBX, DWORD PTR [EBP - 60]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 60
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp819:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 152
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 12]
	mov EBX, 1
	mov DWORD PTR [EBP - 8], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 12], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 16], EBX
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 24], EBX
	mov EBX, DWORD PTR [EBP - 24]
	mov DWORD PTR [EBP - 28], EBX
_label98:
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBP - 32], EBX
	mov EDX, DWORD PTR [EBP - 36]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 40]
	mov EBX, DWORD PTR [EBP - 36]
	mov EDX, DWORD PTR [EBX + 4]
	mov EAX, DWORD PTR [EBP - 32]
	mov EBX, DWORD PTR [EBP - 40]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 44], EAX
	je _label99
	mov EDX, DWORD PTR [EBP - 48]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 52]
	mov EBX, DWORD PTR [EBP - 48]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBP - 56], EBX
	mov EAX, DWORD PTR [EBP - 56]
	add EAX, 1
	mov DWORD PTR [EBP - 60], EAX
	mov EAX, DWORD PTR [EBP - 60]
	imul EAX, 4
	mov DWORD PTR [EBP - 60], EAX
	mov EDX, DWORD PTR [EBP - 64]
	mov EBX, DWORD PTR [EBP - 52]
	mov ECX, DWORD PTR [EBP - 60]
	mov EDX, DWORD PTR [EBX + ECX]
	mov EBX, DWORD PTR [EBP - 64]
	mov DWORD PTR [EBP - 68], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 72], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 76], EBX
	mov EAX, DWORD PTR [EBP - 72]
	mov EBX, DWORD PTR [EBP - 76]
	add EAX, EBX
	mov DWORD PTR [EBP - 80], EAX
	mov EBX, DWORD PTR [EBP - 80]
	mov DWORD PTR [EBP - 84], EBX
	mov EBX, DWORD PTR [EBP - 68]
	mov DWORD PTR [EBP - 88], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 92], EBX
	mov EAX, DWORD PTR [EBP - 88]
	mov EBX, DWORD PTR [EBP - 92]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 96], EAX
	je _label100
	mov EBX, 0
	mov DWORD PTR [EBP - 100], EBX
	mov EBX, DWORD PTR [EBP - 100]
	mov DWORD PTR [EBP - 104], EBX
	jmp _label101
_label100:
	mov EBX, DWORD PTR [EBP - 68]
	mov DWORD PTR [EBP - 108], EBX
	mov EBX, DWORD PTR [EBP - 84]
	mov DWORD PTR [EBP - 112], EBX
	mov EAX, DWORD PTR [EBP - 108]
	mov EBX, DWORD PTR [EBP - 112]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 116], EAX
	mov EBX, DWORD PTR [EBP - 116]
	not EAX
	mov DWORD PTR [EBP - 120], EAX
	je _label102
	mov EBX, 0
	mov DWORD PTR [EBP - 124], EBX
	mov EBX, DWORD PTR [EBP - 124]
	mov DWORD PTR [EBP - 104], EBX
	jmp _label103
_label102:
	mov EBX, 1
	mov DWORD PTR [EBP - 128], EBX
	mov EBX, DWORD PTR [EBP - 128]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 132], EBX
	mov EBX, DWORD PTR [EBP - 132]
	mov DWORD PTR [EBP - 28], EBX
	mov EDX, DWORD PTR [EBP - 36]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 136]
	mov EBX, DWORD PTR [EBP - 36]
	mov EDX, DWORD PTR [EBX + 4]
	mov EBX, DWORD PTR [EBP - 136]
	mov DWORD PTR [EBP - 12], EBX
_label103:
_label101:
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBP - 140], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 144], EBX
	mov EAX, DWORD PTR [EBP - 140]
	mov EBX, DWORD PTR [EBP - 144]
	add EAX, EBX
	mov DWORD PTR [EBP - 148], EAX
	mov EBX, DWORD PTR [EBP - 148]
	mov DWORD PTR [EBP - 12], EBX
	jmp _label98
_label99:
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 152], EBX
	mov EBX, DWORD PTR [EBP - 152]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 152
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp820:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 144
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 12]
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 8], EBX
	mov EDX, DWORD PTR [EBP - 12]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 8]
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBX + 4], EDX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 16], EBX
	mov EAX, DWORD PTR [EBP - 16]
	add EAX, 1
	mov DWORD PTR [EBP - 20], EAX
	mov EAX, DWORD PTR [EBP - 20]
	imul EAX, 4
	mov DWORD PTR [EBP - 20], EAX
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [ESP], EBX
	call _malloc
	mov DWORD PTR [EBP - 24], EAX
	mov EDX, DWORD PTR [EBP - 16]
	mov EBX, DWORD PTR [EBP - 24]
	mov DWORD PTR [EBX + 0], EDX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 24]
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBX + 0], EDX
	mov EBX, 1
	mov DWORD PTR [EBP - 32], EBX
	mov EBX, DWORD PTR [EBP - 32]
	mov DWORD PTR [EBP - 36], EBX
	mov EDX, DWORD PTR [EBP - 12]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 40]
	mov EBX, DWORD PTR [EBP - 12]
	mov EDX, DWORD PTR [EBX + 4]
	mov EBX, 1
	mov DWORD PTR [EBP - 44], EBX
	mov EAX, DWORD PTR [EBP - 40]
	mov EBX, DWORD PTR [EBP - 44]
	add EAX, EBX
	mov DWORD PTR [EBP - 48], EAX
	mov EBX, DWORD PTR [EBP - 48]
	mov DWORD PTR [EBP - 52], EBX
_label104:
	mov EBX, DWORD PTR [EBP - 36]
	mov DWORD PTR [EBP - 56], EBX
	mov EDX, DWORD PTR [EBP - 12]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 60]
	mov EBX, DWORD PTR [EBP - 12]
	mov EDX, DWORD PTR [EBX + 4]
	mov EAX, DWORD PTR [EBP - 56]
	mov EBX, DWORD PTR [EBP - 60]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 64], EAX
	je _label105
	mov EBX, 2
	mov DWORD PTR [EBP - 68], EBX
	mov EBX, DWORD PTR [EBP - 36]
	mov DWORD PTR [EBP - 72], EBX
	mov EAX, DWORD PTR [EBP - 68]
	mov EBX, DWORD PTR [EBP - 72]
	imul EAX, EBX
	mov DWORD PTR [EBP - 76], EAX
	mov EBX, DWORD PTR [EBP - 76]
	mov DWORD PTR [EBP - 80], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 84], EBX
	mov EBX, 3
	mov DWORD PTR [EBP - 88], EBX
	mov EAX, DWORD PTR [EBP - 84]
	mov EBX, DWORD PTR [EBP - 88]
	sub EAX, EBX
	mov DWORD PTR [EBP - 92], EAX
	mov EBX, DWORD PTR [EBP - 92]
	mov DWORD PTR [EBP - 96], EBX
	mov EBX, DWORD PTR [EBP - 80]
	mov DWORD PTR [EBP - 100], EBX
	mov EBX, DWORD PTR [EBP - 96]
	mov DWORD PTR [EBP - 104], EBX
	mov EAX, DWORD PTR [EBP - 100]
	mov EBX, DWORD PTR [EBP - 104]
	add EAX, EBX
	mov DWORD PTR [EBP - 108], EAX
	mov EBX, DWORD PTR [EBP - 36]
	mov DWORD PTR [EBP - 112], EBX
	mov EAX, DWORD PTR [EBP - 112]
	add EAX, 1
	mov DWORD PTR [EBP - 116], EAX
	mov EAX, DWORD PTR [EBP - 116]
	imul EAX, 4
	mov DWORD PTR [EBP - 116], EAX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 108]
	mov EBX, DWORD PTR [EBP - 28]
	mov ECX, DWORD PTR [EBP - 116]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, DWORD PTR [EBP - 36]
	mov DWORD PTR [EBP - 120], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 124], EBX
	mov EAX, DWORD PTR [EBP - 120]
	mov EBX, DWORD PTR [EBP - 124]
	add EAX, EBX
	mov DWORD PTR [EBP - 128], EAX
	mov EBX, DWORD PTR [EBP - 128]
	mov DWORD PTR [EBP - 36], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 132], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 136], EBX
	mov EAX, DWORD PTR [EBP - 132]
	mov EBX, DWORD PTR [EBP - 136]
	sub EAX, EBX
	mov DWORD PTR [EBP - 140], EAX
	mov EBX, DWORD PTR [EBP - 140]
	mov DWORD PTR [EBP - 52], EBX
	jmp _label104
_label105:
	mov EBX, 0
	mov DWORD PTR [EBP - 144], EBX
	mov EBX, DWORD PTR [EBP - 144]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 144
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc


	.ident "Error 404: Compiler Not Found"
	.def _malloc; .scl 2; .type 32; .endef
	.def _printf; .scl 2; .type 32; .endef
