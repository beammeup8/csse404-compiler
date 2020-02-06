	.file "sampleCode/BubbleSort.java"
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
	call _temp668
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

_temp668:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 52
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 12]
	mov EDX, DWORD PTR [EBP - 8]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 12], EBX
	push DWORD PTR [EBP - 12]
	push DWORD PTR [EBP - 8]
	call _temp671
	pop DWORD PTR [EBP - 8]
	pop DWORD PTR [EBP - 12]
	mov EBX, EAX
	mov DWORD PTR [EBP - 16], EBX
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 20], EBX
	mov EDX, DWORD PTR [EBP - 24]
	mov EDX, DWORD PTR [EBP + 8]
	push DWORD PTR [EBP - 24]
	call _temp670
	pop DWORD PTR [EBP - 24]
	mov EBX, EAX
	mov DWORD PTR [EBP - 28], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 99999
	mov DWORD PTR [EBP - 32], EBX
	mov EAX, DWORD PTR [EBP - 32]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EDX, DWORD PTR [EBP - 36]
	mov EDX, DWORD PTR [EBP + 8]
	push DWORD PTR [EBP - 36]
	call _temp669
	pop DWORD PTR [EBP - 36]
	mov EBX, EAX
	mov DWORD PTR [EBP - 40], EBX
	mov EBX, DWORD PTR [EBP - 40]
	mov DWORD PTR [EBP - 20], EBX
	mov EDX, DWORD PTR [EBP - 44]
	mov EDX, DWORD PTR [EBP + 8]
	push DWORD PTR [EBP - 44]
	call _temp670
	pop DWORD PTR [EBP - 44]
	mov EBX, EAX
	mov DWORD PTR [EBP - 48], EBX
	mov EBX, DWORD PTR [EBP - 48]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 52], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 52
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp669:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 256
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 8]
	mov EBX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBX + 4]
	mov EBX, 1
	mov DWORD PTR [EBP - 12], EBX
	mov EAX, DWORD PTR [EBP - 8]
	mov EBX, DWORD PTR [EBP - 12]
	sub EAX, EBX
	mov DWORD PTR [EBP - 16], EAX
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 24], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 28], EBX
	mov EAX, DWORD PTR [EBP - 24]
	mov EBX, DWORD PTR [EBP - 28]
	sub EAX, EBX
	mov DWORD PTR [EBP - 32], EAX
	mov EBX, DWORD PTR [EBP - 32]
	mov DWORD PTR [EBP - 36], EBX
_label86:
	mov EBX, DWORD PTR [EBP - 36]
	mov DWORD PTR [EBP - 40], EBX
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 44], EBX
	mov EAX, DWORD PTR [EBP - 40]
	mov EBX, DWORD PTR [EBP - 44]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 48], EAX
	je _label87
	mov EBX, 1
	mov DWORD PTR [EBP - 52], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 56], EBX
_label88:
	mov EBX, DWORD PTR [EBP - 56]
	mov DWORD PTR [EBP - 60], EBX
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 64], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 68], EBX
	mov EAX, DWORD PTR [EBP - 64]
	mov EBX, DWORD PTR [EBP - 68]
	add EAX, EBX
	mov DWORD PTR [EBP - 72], EAX
	mov EAX, DWORD PTR [EBP - 60]
	mov EBX, DWORD PTR [EBP - 72]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 76], EAX
	je _label89
	mov EBX, DWORD PTR [EBP - 56]
	mov DWORD PTR [EBP - 80], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 84], EBX
	mov EAX, DWORD PTR [EBP - 80]
	mov EBX, DWORD PTR [EBP - 84]
	sub EAX, EBX
	mov DWORD PTR [EBP - 88], EAX
	mov EBX, DWORD PTR [EBP - 88]
	mov DWORD PTR [EBP - 92], EBX
	mov EDX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 100]
	mov EBX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 92]
	mov DWORD PTR [EBP - 104], EBX
	mov EAX, DWORD PTR [EBP - 104]
	add EAX, 1
	mov DWORD PTR [EBP - 108], EAX
	mov EAX, DWORD PTR [EBP - 108]
	imul EAX, 4
	mov DWORD PTR [EBP - 108], EAX
	mov EDX, DWORD PTR [EBP - 112]
	mov EBX, DWORD PTR [EBP - 100]
	mov ECX, DWORD PTR [EBP - 108]
	mov EDX, DWORD PTR [EBX + ECX]
	mov EBX, DWORD PTR [EBP - 112]
	mov DWORD PTR [EBP - 116], EBX
	mov EDX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 120]
	mov EBX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 56]
	mov DWORD PTR [EBP - 124], EBX
	mov EAX, DWORD PTR [EBP - 124]
	add EAX, 1
	mov DWORD PTR [EBP - 128], EAX
	mov EAX, DWORD PTR [EBP - 128]
	imul EAX, 4
	mov DWORD PTR [EBP - 128], EAX
	mov EDX, DWORD PTR [EBP - 132]
	mov EBX, DWORD PTR [EBP - 120]
	mov ECX, DWORD PTR [EBP - 128]
	mov EDX, DWORD PTR [EBX + ECX]
	mov EBX, DWORD PTR [EBP - 132]
	mov DWORD PTR [EBP - 136], EBX
	mov EBX, DWORD PTR [EBP - 136]
	mov DWORD PTR [EBP - 140], EBX
	mov EBX, DWORD PTR [EBP - 116]
	mov DWORD PTR [EBP - 144], EBX
	mov EAX, DWORD PTR [EBP - 140]
	mov EBX, DWORD PTR [EBP - 144]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 148], EAX
	je _label90
	mov EBX, DWORD PTR [EBP - 56]
	mov DWORD PTR [EBP - 152], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 156], EBX
	mov EAX, DWORD PTR [EBP - 152]
	mov EBX, DWORD PTR [EBP - 156]
	sub EAX, EBX
	mov DWORD PTR [EBP - 160], EAX
	mov EBX, DWORD PTR [EBP - 160]
	mov DWORD PTR [EBP - 164], EBX
	mov EDX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 168]
	mov EBX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 164]
	mov DWORD PTR [EBP - 172], EBX
	mov EAX, DWORD PTR [EBP - 172]
	add EAX, 1
	mov DWORD PTR [EBP - 176], EAX
	mov EAX, DWORD PTR [EBP - 176]
	imul EAX, 4
	mov DWORD PTR [EBP - 176], EAX
	mov EDX, DWORD PTR [EBP - 180]
	mov EBX, DWORD PTR [EBP - 168]
	mov ECX, DWORD PTR [EBP - 176]
	mov EDX, DWORD PTR [EBX + ECX]
	mov EBX, DWORD PTR [EBP - 180]
	mov DWORD PTR [EBP - 184], EBX
	mov EDX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 188]
	mov EBX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 56]
	mov DWORD PTR [EBP - 192], EBX
	mov EAX, DWORD PTR [EBP - 192]
	add EAX, 1
	mov DWORD PTR [EBP - 196], EAX
	mov EAX, DWORD PTR [EBP - 196]
	imul EAX, 4
	mov DWORD PTR [EBP - 196], EAX
	mov EDX, DWORD PTR [EBP - 200]
	mov EBX, DWORD PTR [EBP - 188]
	mov ECX, DWORD PTR [EBP - 196]
	mov EDX, DWORD PTR [EBX + ECX]
	mov EBX, DWORD PTR [EBP - 164]
	mov DWORD PTR [EBP - 204], EBX
	mov EAX, DWORD PTR [EBP - 204]
	add EAX, 1
	mov DWORD PTR [EBP - 208], EAX
	mov EAX, DWORD PTR [EBP - 208]
	imul EAX, 4
	mov DWORD PTR [EBP - 208], EAX
	mov EDX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 96]
	mov EBX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 200]
	mov EBX, DWORD PTR [EBP - 96]
	mov ECX, DWORD PTR [EBP - 208]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, DWORD PTR [EBP - 184]
	mov DWORD PTR [EBP - 212], EBX
	mov EBX, DWORD PTR [EBP - 56]
	mov DWORD PTR [EBP - 216], EBX
	mov EAX, DWORD PTR [EBP - 216]
	add EAX, 1
	mov DWORD PTR [EBP - 220], EAX
	mov EAX, DWORD PTR [EBP - 220]
	imul EAX, 4
	mov DWORD PTR [EBP - 220], EAX
	mov EDX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 96]
	mov EBX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 212]
	mov EBX, DWORD PTR [EBP - 96]
	mov ECX, DWORD PTR [EBP - 220]
	mov DWORD PTR [EBX + ECX], EDX
	jmp _label91
_label90:
	mov EBX, 0
	mov DWORD PTR [EBP - 224], EBX
	mov EBX, DWORD PTR [EBP - 224]
	mov DWORD PTR [EBP - 228], EBX
_label91:
	mov EBX, DWORD PTR [EBP - 56]
	mov DWORD PTR [EBP - 232], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 236], EBX
	mov EAX, DWORD PTR [EBP - 232]
	mov EBX, DWORD PTR [EBP - 236]
	add EAX, EBX
	mov DWORD PTR [EBP - 240], EAX
	mov EBX, DWORD PTR [EBP - 240]
	mov DWORD PTR [EBP - 56], EBX
	jmp _label88
_label89:
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 244], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 248], EBX
	mov EAX, DWORD PTR [EBP - 244]
	mov EBX, DWORD PTR [EBP - 248]
	sub EAX, EBX
	mov DWORD PTR [EBP - 252], EAX
	mov EBX, DWORD PTR [EBP - 252]
	mov DWORD PTR [EBP - 20], EBX
	jmp _label86
_label87:
	mov EBX, 0
	mov DWORD PTR [EBP - 256], EBX
	mov EBX, DWORD PTR [EBP - 256]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 256
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp670:
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
	mov EBX, 0
	mov DWORD PTR [EBP - 4], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 8], EBX
_label92:
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
	je _label93
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
	jmp _label92
_label93:
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

_temp671:
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
	mov EBX, 20
	mov DWORD PTR [EBP - 32], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 36], EBX
	mov EAX, DWORD PTR [EBP - 36]
	add EAX, 1
	mov DWORD PTR [EBP - 40], EAX
	mov EAX, DWORD PTR [EBP - 40]
	imul EAX, 4
	mov DWORD PTR [EBP - 40], EAX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 32]
	mov EBX, DWORD PTR [EBP - 28]
	mov ECX, DWORD PTR [EBP - 40]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, 7
	mov DWORD PTR [EBP - 44], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 48], EBX
	mov EAX, DWORD PTR [EBP - 48]
	add EAX, 1
	mov DWORD PTR [EBP - 52], EAX
	mov EAX, DWORD PTR [EBP - 52]
	imul EAX, 4
	mov DWORD PTR [EBP - 52], EAX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 44]
	mov EBX, DWORD PTR [EBP - 28]
	mov ECX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, 12
	mov DWORD PTR [EBP - 56], EBX
	mov EBX, 2
	mov DWORD PTR [EBP - 60], EBX
	mov EAX, DWORD PTR [EBP - 60]
	add EAX, 1
	mov DWORD PTR [EBP - 64], EAX
	mov EAX, DWORD PTR [EBP - 64]
	imul EAX, 4
	mov DWORD PTR [EBP - 64], EAX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 56]
	mov EBX, DWORD PTR [EBP - 28]
	mov ECX, DWORD PTR [EBP - 64]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, 18
	mov DWORD PTR [EBP - 68], EBX
	mov EBX, 3
	mov DWORD PTR [EBP - 72], EBX
	mov EAX, DWORD PTR [EBP - 72]
	add EAX, 1
	mov DWORD PTR [EBP - 76], EAX
	mov EAX, DWORD PTR [EBP - 76]
	imul EAX, 4
	mov DWORD PTR [EBP - 76], EAX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 68]
	mov EBX, DWORD PTR [EBP - 28]
	mov ECX, DWORD PTR [EBP - 76]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, 2
	mov DWORD PTR [EBP - 80], EBX
	mov EBX, 4
	mov DWORD PTR [EBP - 84], EBX
	mov EAX, DWORD PTR [EBP - 84]
	add EAX, 1
	mov DWORD PTR [EBP - 88], EAX
	mov EAX, DWORD PTR [EBP - 88]
	imul EAX, 4
	mov DWORD PTR [EBP - 88], EAX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 80]
	mov EBX, DWORD PTR [EBP - 28]
	mov ECX, DWORD PTR [EBP - 88]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, 11
	mov DWORD PTR [EBP - 92], EBX
	mov EBX, 5
	mov DWORD PTR [EBP - 96], EBX
	mov EAX, DWORD PTR [EBP - 96]
	add EAX, 1
	mov DWORD PTR [EBP - 100], EAX
	mov EAX, DWORD PTR [EBP - 100]
	imul EAX, 4
	mov DWORD PTR [EBP - 100], EAX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 92]
	mov EBX, DWORD PTR [EBP - 28]
	mov ECX, DWORD PTR [EBP - 100]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, 6
	mov DWORD PTR [EBP - 104], EBX
	mov EBX, 6
	mov DWORD PTR [EBP - 108], EBX
	mov EAX, DWORD PTR [EBP - 108]
	add EAX, 1
	mov DWORD PTR [EBP - 112], EAX
	mov EAX, DWORD PTR [EBP - 112]
	imul EAX, 4
	mov DWORD PTR [EBP - 112], EAX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 104]
	mov EBX, DWORD PTR [EBP - 28]
	mov ECX, DWORD PTR [EBP - 112]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, 9
	mov DWORD PTR [EBP - 116], EBX
	mov EBX, 7
	mov DWORD PTR [EBP - 120], EBX
	mov EAX, DWORD PTR [EBP - 120]
	add EAX, 1
	mov DWORD PTR [EBP - 124], EAX
	mov EAX, DWORD PTR [EBP - 124]
	imul EAX, 4
	mov DWORD PTR [EBP - 124], EAX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 116]
	mov EBX, DWORD PTR [EBP - 28]
	mov ECX, DWORD PTR [EBP - 124]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, 19
	mov DWORD PTR [EBP - 128], EBX
	mov EBX, 8
	mov DWORD PTR [EBP - 132], EBX
	mov EAX, DWORD PTR [EBP - 132]
	add EAX, 1
	mov DWORD PTR [EBP - 136], EAX
	mov EAX, DWORD PTR [EBP - 136]
	imul EAX, 4
	mov DWORD PTR [EBP - 136], EAX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 128]
	mov EBX, DWORD PTR [EBP - 28]
	mov ECX, DWORD PTR [EBP - 136]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, 5
	mov DWORD PTR [EBP - 140], EBX
	mov EBX, 9
	mov DWORD PTR [EBP - 144], EBX
	mov EAX, DWORD PTR [EBP - 144]
	add EAX, 1
	mov DWORD PTR [EBP - 148], EAX
	mov EAX, DWORD PTR [EBP - 148]
	imul EAX, 4
	mov DWORD PTR [EBP - 148], EAX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 140]
	mov EBX, DWORD PTR [EBP - 28]
	mov ECX, DWORD PTR [EBP - 148]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, 0
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


	.ident "Error 404: Compiler Not Found"
	.def _malloc; .scl 2; .type 32; .endef
	.def _printf; .scl 2; .type 32; .endef
