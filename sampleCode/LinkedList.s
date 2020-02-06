	.file "sampleCode/LinkedList.java"
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
	sub ESP, 8
	mov EBX, 0
	mov DWORD PTR [ESP], EBX
	call _malloc
	mov DWORD PTR [EBP - 4], EAX
	push DWORD PTR [EBP - 4]
	call _temp1099
	pop DWORD PTR [EBP - 4]
	mov EBX, EAX
	mov DWORD PTR [EBP - 8], EBX
	mov EAX, DWORD PTR [EBP - 8]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 8
	popad
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1077:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 40
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 20]
	mov EDX, DWORD PTR [EBP - 8]
	mov EDX, DWORD PTR [EBP + 16]
	mov EDX, DWORD PTR [EBP - 12]
	mov EDX, DWORD PTR [EBP + 12]
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 16], EBX
	mov EDX, DWORD PTR [EBP - 20]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 16]
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBX + 0], EDX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 24], EBX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 24]
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBX + 4], EDX
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBP - 32], EBX
	mov EDX, DWORD PTR [EBP - 36]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 32]
	mov EBX, DWORD PTR [EBP - 36]
	mov DWORD PTR [EBX + 8], EDX
	mov EBX, 1
	mov DWORD PTR [EBP - 40], EBX
	mov EBX, DWORD PTR [EBP - 40]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 40
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1078:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 8
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 8]
	mov EBX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 8]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 8
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1079:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 8
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 8]
	mov EBX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBX + 4]
	mov EBX, DWORD PTR [EBP - 8]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 8
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1080:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 8
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 8]
	mov EBX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBX + 8]
	mov EBX, DWORD PTR [EBP - 8]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 8
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1081:
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
	mov EBX, 1
	mov DWORD PTR [EBP - 8], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 12], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 16], EBX
	push DWORD PTR [EBP - 16]
	call _temp1078
	pop DWORD PTR [EBP - 16]
	mov EBX, EAX
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 24], EBX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 24]
	mov DWORD PTR [EBP - 32], EBX
	mov EDX, DWORD PTR [EBP - 36]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 40]
	mov EBX, DWORD PTR [EBP - 36]
	mov EDX, DWORD PTR [EBX + 0]
	push DWORD PTR [EBP - 40]
	push DWORD PTR [EBP - 32]
	push DWORD PTR [EBP - 28]
	call _temp1082
	pop DWORD PTR [EBP - 28]
	pop DWORD PTR [EBP - 32]
	pop DWORD PTR [EBP - 40]
	mov EBX, EAX
	mov DWORD PTR [EBP - 44], EBX
	mov EBX, DWORD PTR [EBP - 44]
	not EAX
	mov DWORD PTR [EBP - 48], EAX
	je _label106
	mov EBX, 0
	mov DWORD PTR [EBP - 52], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 12], EBX
	jmp _label107
_label106:
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 56], EBX
	push DWORD PTR [EBP - 56]
	call _temp1079
	pop DWORD PTR [EBP - 56]
	mov EBX, EAX
	mov DWORD PTR [EBP - 60], EBX
	mov EBX, DWORD PTR [EBP - 60]
	mov DWORD PTR [EBP - 64], EBX
	mov EDX, DWORD PTR [EBP - 68]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 64]
	mov DWORD PTR [EBP - 72], EBX
	mov EDX, DWORD PTR [EBP - 76]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 80]
	mov EBX, DWORD PTR [EBP - 76]
	mov EDX, DWORD PTR [EBX + 4]
	push DWORD PTR [EBP - 80]
	push DWORD PTR [EBP - 72]
	push DWORD PTR [EBP - 68]
	call _temp1082
	pop DWORD PTR [EBP - 68]
	pop DWORD PTR [EBP - 72]
	pop DWORD PTR [EBP - 80]
	mov EBX, EAX
	mov DWORD PTR [EBP - 84], EBX
	mov EBX, DWORD PTR [EBP - 84]
	not EAX
	mov DWORD PTR [EBP - 88], EAX
	je _label108
	mov EBX, 0
	mov DWORD PTR [EBP - 92], EBX
	mov EBX, DWORD PTR [EBP - 92]
	mov DWORD PTR [EBP - 12], EBX
	jmp _label109
_label108:
	mov EDX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 100]
	mov EBX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBX + 8]
	je _label110
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 104], EBX
	push DWORD PTR [EBP - 104]
	call _temp1080
	pop DWORD PTR [EBP - 104]
	mov EBX, EAX
	mov DWORD PTR [EBP - 108], EBX
	mov EBX, DWORD PTR [EBP - 108]
	not EAX
	mov DWORD PTR [EBP - 112], EAX
	je _label111
	mov EBX, 0
	mov DWORD PTR [EBP - 116], EBX
	mov EBX, DWORD PTR [EBP - 116]
	mov DWORD PTR [EBP - 12], EBX
	jmp _label112
_label111:
	mov EBX, 0
	mov DWORD PTR [EBP - 120], EBX
	mov EBX, DWORD PTR [EBP - 120]
	mov DWORD PTR [EBP - 124], EBX
_label112:
	jmp _label113
_label110:
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 128], EBX
	push DWORD PTR [EBP - 128]
	call _temp1080
	pop DWORD PTR [EBP - 128]
	mov EBX, EAX
	mov DWORD PTR [EBP - 132], EBX
	je _label114
	mov EBX, 0
	mov DWORD PTR [EBP - 136], EBX
	mov EBX, DWORD PTR [EBP - 136]
	mov DWORD PTR [EBP - 12], EBX
	jmp _label115
_label114:
	mov EBX, 0
	mov DWORD PTR [EBP - 140], EBX
	mov EBX, DWORD PTR [EBP - 140]
	mov DWORD PTR [EBP - 124], EBX
_label115:
_label113:
_label109:
_label107:
	mov EBX, DWORD PTR [EBP - 12]
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

_temp1082:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 76
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 16]
	mov EDX, DWORD PTR [EBP - 8]
	mov EDX, DWORD PTR [EBP + 12]
	mov EBX, 0
	mov DWORD PTR [EBP - 12], EBX
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBP - 16], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 24], EBX
	mov EAX, DWORD PTR [EBP - 20]
	mov EBX, DWORD PTR [EBP - 24]
	add EAX, EBX
	mov DWORD PTR [EBP - 28], EAX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 32], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 36], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 40], EBX
	mov EAX, DWORD PTR [EBP - 36]
	mov EBX, DWORD PTR [EBP - 40]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 44], EAX
	je _label116
	mov EBX, 0
	mov DWORD PTR [EBP - 48], EBX
	mov EBX, DWORD PTR [EBP - 48]
	mov DWORD PTR [EBP - 16], EBX
	jmp _label117
_label116:
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 52], EBX
	mov EBX, DWORD PTR [EBP - 32]
	mov DWORD PTR [EBP - 56], EBX
	mov EAX, DWORD PTR [EBP - 52]
	mov EBX, DWORD PTR [EBP - 56]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 60], EAX
	mov EBX, DWORD PTR [EBP - 60]
	not EAX
	mov DWORD PTR [EBP - 64], EAX
	je _label118
	mov EBX, 0
	mov DWORD PTR [EBP - 68], EBX
	mov EBX, DWORD PTR [EBP - 68]
	mov DWORD PTR [EBP - 16], EBX
	jmp _label119
_label118:
	mov EBX, 1
	mov DWORD PTR [EBP - 72], EBX
	mov EBX, DWORD PTR [EBP - 72]
	mov DWORD PTR [EBP - 16], EBX
_label119:
_label117:
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 76], EBX
	mov EBX, DWORD PTR [EBP - 76]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 76
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1086:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 12
	mov EBX, 1
	mov DWORD PTR [EBP - 4], EBX
	mov EDX, DWORD PTR [EBP - 8]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 4]
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBX + 8], EDX
	mov EBX, 1
	mov DWORD PTR [EBP - 12], EBX
	mov EBX, DWORD PTR [EBP - 12]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 12
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1087:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 40
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 20]
	mov EDX, DWORD PTR [EBP - 8]
	mov EDX, DWORD PTR [EBP + 16]
	mov EDX, DWORD PTR [EBP - 12]
	mov EDX, DWORD PTR [EBP + 12]
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBP - 16], EBX
	mov EDX, DWORD PTR [EBP - 20]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 16]
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBX + 8], EDX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 24], EBX
	mov EDX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 24]
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBX + 0], EDX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 32], EBX
	mov EDX, DWORD PTR [EBP - 36]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 32]
	mov EBX, DWORD PTR [EBP - 36]
	mov DWORD PTR [EBX + 4], EDX
	mov EBX, 1
	mov DWORD PTR [EBP - 40], EBX
	mov EBX, DWORD PTR [EBP - 40]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 40
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1088:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 48
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 12]
	mov EDX, DWORD PTR [EBP - 8]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 12], EBX
	mov EBX, 12
	mov DWORD PTR [ESP], EBX
	call _malloc
	mov DWORD PTR [EBP - 16], EAX
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 24], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 28], EBX
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBP - 32], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 36], EBX
	push DWORD PTR [EBP - 36]
	push DWORD PTR [EBP - 32]
	push DWORD PTR [EBP - 28]
	push DWORD PTR [EBP - 24]
	call _temp1087
	pop DWORD PTR [EBP - 24]
	pop DWORD PTR [EBP - 28]
	pop DWORD PTR [EBP - 32]
	pop DWORD PTR [EBP - 36]
	mov EBX, EAX
	mov DWORD PTR [EBP - 40], EBX
	mov EBX, DWORD PTR [EBP - 40]
	mov DWORD PTR [EBP - 44], EBX
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 48], EBX
	mov EBX, DWORD PTR [EBP - 48]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 48
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1089:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 16
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 12]
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 8], EBX
	mov EDX, DWORD PTR [EBP - 12]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 8]
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBX + 4], EDX
	mov EBX, 1
	mov DWORD PTR [EBP - 16], EBX
	mov EBX, DWORD PTR [EBP - 16]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 16
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1090:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 232
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 12]
	mov EDX, DWORD PTR [EBP - 8]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 12], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 16], EBX
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
	mov EDX, DWORD PTR [EBP - 40]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 40]
	mov DWORD PTR [EBP - 44], EBX
	mov EDX, DWORD PTR [EBP - 48]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 48]
	mov DWORD PTR [EBP - 52], EBX
	mov EDX, DWORD PTR [EBP - 56]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 60]
	mov EBX, DWORD PTR [EBP - 56]
	mov EDX, DWORD PTR [EBX + 8]
	mov EBX, DWORD PTR [EBP - 60]
	mov DWORD PTR [EBP - 64], EBX
	mov EDX, DWORD PTR [EBP - 68]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 72]
	mov EBX, DWORD PTR [EBP - 68]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 72]
	mov DWORD PTR [EBP - 76], EBX
_label120:
	mov EBX, DWORD PTR [EBP - 64]
	mov DWORD PTR [EBP - 80], EBX
	mov EBX, DWORD PTR [EBP - 80]
	not EAX
	mov DWORD PTR [EBP - 84], EAX
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 88], EBX
	mov EBX, DWORD PTR [EBP - 88]
	not EAX
	mov DWORD PTR [EBP - 92], EAX
	mov EAX, DWORD PTR [EBP - 84]
	mov EBX, DWORD PTR [EBP - 92]
	and EAX, EBX
	mov DWORD PTR [EBP - 96], EAX
	je _label121
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 100], EBX
	mov EBX, DWORD PTR [EBP - 76]
	mov DWORD PTR [EBP - 104], EBX
	push DWORD PTR [EBP - 104]
	push DWORD PTR [EBP - 100]
	call _temp1081
	pop DWORD PTR [EBP - 100]
	pop DWORD PTR [EBP - 104]
	mov EBX, EAX
	mov DWORD PTR [EBP - 108], EBX
	je _label122
	mov EBX, 1
	mov DWORD PTR [EBP - 112], EBX
	mov EBX, DWORD PTR [EBP - 112]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 36]
	mov DWORD PTR [EBP - 116], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 120], EBX
	mov EAX, DWORD PTR [EBP - 116]
	mov EBX, DWORD PTR [EBP - 120]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 124], EAX
	je _label123
	mov EBX, DWORD PTR [EBP - 44]
	mov DWORD PTR [EBP - 128], EBX
	push DWORD PTR [EBP - 128]
	call _temp1094
	pop DWORD PTR [EBP - 128]
	mov EBX, EAX
	mov DWORD PTR [EBP - 132], EBX
	mov EBX, DWORD PTR [EBP - 132]
	mov DWORD PTR [EBP - 12], EBX
	jmp _label124
_label123:
	mov EBX, 0
	mov DWORD PTR [EBP - 136], EBX
	mov EBX, 555
	mov DWORD PTR [EBP - 140], EBX
	mov EAX, DWORD PTR [EBP - 136]
	mov EBX, DWORD PTR [EBP - 140]
	sub EAX, EBX
	mov DWORD PTR [EBP - 144], EAX
	mov EAX, DWORD PTR [EBP - 144]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 148], EBX
	mov EBX, DWORD PTR [EBP - 44]
	mov DWORD PTR [EBP - 152], EBX
	push DWORD PTR [EBP - 152]
	call _temp1094
	pop DWORD PTR [EBP - 152]
	mov EBX, EAX
	mov DWORD PTR [EBP - 156], EBX
	push DWORD PTR [EBP - 156]
	push DWORD PTR [EBP - 148]
	call _temp1089
	pop DWORD PTR [EBP - 148]
	pop DWORD PTR [EBP - 156]
	mov EBX, EAX
	mov DWORD PTR [EBP - 160], EBX
	mov EBX, DWORD PTR [EBP - 160]
	mov DWORD PTR [EBP - 164], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 168], EBX
	mov EBX, 555
	mov DWORD PTR [EBP - 172], EBX
	mov EAX, DWORD PTR [EBP - 168]
	mov EBX, DWORD PTR [EBP - 172]
	sub EAX, EBX
	mov DWORD PTR [EBP - 176], EAX
	mov EAX, DWORD PTR [EBP - 176]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
_label124:
	jmp _label125
_label122:
	mov EBX, 0
	mov DWORD PTR [EBP - 180], EBX
	mov EBX, DWORD PTR [EBP - 180]
	mov DWORD PTR [EBP - 184], EBX
_label125:
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 188], EBX
	mov EBX, DWORD PTR [EBP - 188]
	not EAX
	mov DWORD PTR [EBP - 192], EAX
	je _label126
	mov EBX, DWORD PTR [EBP - 44]
	mov DWORD PTR [EBP - 196], EBX
	mov EBX, DWORD PTR [EBP - 196]
	mov DWORD PTR [EBP - 52], EBX
	mov EBX, DWORD PTR [EBP - 44]
	mov DWORD PTR [EBP - 200], EBX
	push DWORD PTR [EBP - 200]
	call _temp1094
	pop DWORD PTR [EBP - 200]
	mov EBX, EAX
	mov DWORD PTR [EBP - 204], EBX
	mov EBX, DWORD PTR [EBP - 204]
	mov DWORD PTR [EBP - 44], EBX
	mov EBX, DWORD PTR [EBP - 44]
	mov DWORD PTR [EBP - 208], EBX
	push DWORD PTR [EBP - 208]
	call _temp1092
	pop DWORD PTR [EBP - 208]
	mov EBX, EAX
	mov DWORD PTR [EBP - 212], EBX
	mov EBX, DWORD PTR [EBP - 212]
	mov DWORD PTR [EBP - 64], EBX
	mov EBX, DWORD PTR [EBP - 44]
	mov DWORD PTR [EBP - 216], EBX
	push DWORD PTR [EBP - 216]
	call _temp1093
	pop DWORD PTR [EBP - 216]
	mov EBX, EAX
	mov DWORD PTR [EBP - 220], EBX
	mov EBX, DWORD PTR [EBP - 220]
	mov DWORD PTR [EBP - 76], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 224], EBX
	mov EBX, DWORD PTR [EBP - 224]
	mov DWORD PTR [EBP - 36], EBX
	jmp _label127
_label126:
	mov EBX, 0
	mov DWORD PTR [EBP - 228], EBX
	mov EBX, DWORD PTR [EBP - 228]
	mov DWORD PTR [EBP - 184], EBX
_label127:
	jmp _label120
_label121:
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBP - 232], EBX
	mov EBX, DWORD PTR [EBP - 232]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 232
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1091:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 104
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 12]
	mov EBX, 0
	mov DWORD PTR [EBP - 8], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 12], EBX
	mov EDX, DWORD PTR [EBP - 16]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 20], EBX
	mov EDX, DWORD PTR [EBP - 24]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 24]
	mov EDX, DWORD PTR [EBX + 8]
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 32], EBX
	mov EDX, DWORD PTR [EBP - 36]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 40]
	mov EBX, DWORD PTR [EBP - 36]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 40]
	mov DWORD PTR [EBP - 44], EBX
_label128:
	mov EBX, DWORD PTR [EBP - 32]
	mov DWORD PTR [EBP - 48], EBX
	mov EBX, DWORD PTR [EBP - 48]
	not EAX
	mov DWORD PTR [EBP - 52], EAX
	je _label129
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 56], EBX
	mov EBX, DWORD PTR [EBP - 44]
	mov DWORD PTR [EBP - 60], EBX
	push DWORD PTR [EBP - 60]
	push DWORD PTR [EBP - 56]
	call _temp1081
	pop DWORD PTR [EBP - 56]
	pop DWORD PTR [EBP - 60]
	mov EBX, EAX
	mov DWORD PTR [EBP - 64], EBX
	je _label130
	mov EBX, 1
	mov DWORD PTR [EBP - 68], EBX
	mov EBX, DWORD PTR [EBP - 68]
	mov DWORD PTR [EBP - 12], EBX
	jmp _label131
_label130:
	mov EBX, 0
	mov DWORD PTR [EBP - 72], EBX
	mov EBX, DWORD PTR [EBP - 72]
	mov DWORD PTR [EBP - 76], EBX
_label131:
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 80], EBX
	push DWORD PTR [EBP - 80]
	call _temp1094
	pop DWORD PTR [EBP - 80]
	mov EBX, EAX
	mov DWORD PTR [EBP - 84], EBX
	mov EBX, DWORD PTR [EBP - 84]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 88], EBX
	push DWORD PTR [EBP - 88]
	call _temp1092
	pop DWORD PTR [EBP - 88]
	mov EBX, EAX
	mov DWORD PTR [EBP - 92], EBX
	mov EBX, DWORD PTR [EBP - 92]
	mov DWORD PTR [EBP - 32], EBX
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 96], EBX
	push DWORD PTR [EBP - 96]
	call _temp1093
	pop DWORD PTR [EBP - 96]
	mov EBX, EAX
	mov DWORD PTR [EBP - 100], EBX
	mov EBX, DWORD PTR [EBP - 100]
	mov DWORD PTR [EBP - 44], EBX
	jmp _label128
_label129:
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBP - 104], EBX
	mov EBX, DWORD PTR [EBP - 104]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 104
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1092:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 8
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 8]
	mov EBX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBX + 8]
	mov EBX, DWORD PTR [EBP - 8]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 8
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1093:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 8
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 8]
	mov EBX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 8]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 8
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1094:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 8
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 8]
	mov EBX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBX + 4]
	mov EBX, DWORD PTR [EBP - 8]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 8
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1095:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 76
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 8], EBX
	mov EDX, DWORD PTR [EBP - 12]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 16]
	mov EBX, DWORD PTR [EBP - 12]
	mov EDX, DWORD PTR [EBX + 8]
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 20], EBX
	mov EDX, DWORD PTR [EBP - 24]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 24]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 32], EBX
_label132:
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 36], EBX
	mov EBX, DWORD PTR [EBP - 36]
	not EAX
	mov DWORD PTR [EBP - 40], EAX
	je _label133
	mov EBX, DWORD PTR [EBP - 32]
	mov DWORD PTR [EBP - 44], EBX
	push DWORD PTR [EBP - 44]
	call _temp1078
	pop DWORD PTR [EBP - 44]
	mov EBX, EAX
	mov DWORD PTR [EBP - 48], EBX
	mov EAX, DWORD PTR [EBP - 48]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 52], EBX
	push DWORD PTR [EBP - 52]
	call _temp1094
	pop DWORD PTR [EBP - 52]
	mov EBX, EAX
	mov DWORD PTR [EBP - 56], EBX
	mov EBX, DWORD PTR [EBP - 56]
	mov DWORD PTR [EBP - 8], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 60], EBX
	push DWORD PTR [EBP - 60]
	call _temp1092
	pop DWORD PTR [EBP - 60]
	mov EBX, EAX
	mov DWORD PTR [EBP - 64], EBX
	mov EBX, DWORD PTR [EBP - 64]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 68], EBX
	push DWORD PTR [EBP - 68]
	call _temp1093
	pop DWORD PTR [EBP - 68]
	mov EBX, EAX
	mov DWORD PTR [EBP - 72], EBX
	mov EBX, DWORD PTR [EBP - 72]
	mov DWORD PTR [EBP - 32], EBX
	jmp _label132
_label133:
	mov EBX, 1
	mov DWORD PTR [EBP - 76], EBX
	mov EBX, DWORD PTR [EBP - 76]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 76
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1099:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 352
	mov EBX, 12
	mov DWORD PTR [ESP], EBX
	call _malloc
	mov DWORD PTR [EBP - 4], EAX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 8], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 12], EBX
	push DWORD PTR [EBP - 12]
	call _temp1086
	pop DWORD PTR [EBP - 12]
	mov EBX, EAX
	mov DWORD PTR [EBP - 16], EBX
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 24], EBX
	mov EBX, DWORD PTR [EBP - 24]
	mov DWORD PTR [EBP - 28], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 32], EBX
	push DWORD PTR [EBP - 32]
	call _temp1086
	pop DWORD PTR [EBP - 32]
	mov EBX, EAX
	mov DWORD PTR [EBP - 36], EBX
	mov EBX, DWORD PTR [EBP - 36]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 40], EBX
	push DWORD PTR [EBP - 40]
	call _temp1095
	pop DWORD PTR [EBP - 40]
	mov EBX, EAX
	mov DWORD PTR [EBP - 44], EBX
	mov EBX, DWORD PTR [EBP - 44]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 12
	mov DWORD PTR [ESP], EBX
	call _malloc
	mov DWORD PTR [EBP - 48], EAX
	mov EBX, DWORD PTR [EBP - 48]
	mov DWORD PTR [EBP - 52], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 56], EBX
	mov EBX, 25
	mov DWORD PTR [EBP - 60], EBX
	mov EBX, 37000
	mov DWORD PTR [EBP - 64], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 68], EBX
	push DWORD PTR [EBP - 68]
	push DWORD PTR [EBP - 64]
	push DWORD PTR [EBP - 60]
	push DWORD PTR [EBP - 56]
	call _temp1077
	pop DWORD PTR [EBP - 56]
	pop DWORD PTR [EBP - 60]
	pop DWORD PTR [EBP - 64]
	pop DWORD PTR [EBP - 68]
	mov EBX, EAX
	mov DWORD PTR [EBP - 72], EBX
	mov EBX, DWORD PTR [EBP - 72]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 76], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 80], EBX
	push DWORD PTR [EBP - 80]
	push DWORD PTR [EBP - 76]
	call _temp1088
	pop DWORD PTR [EBP - 76]
	pop DWORD PTR [EBP - 80]
	mov EBX, EAX
	mov DWORD PTR [EBP - 84], EBX
	mov EBX, DWORD PTR [EBP - 84]
	mov DWORD PTR [EBP - 28], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 88], EBX
	push DWORD PTR [EBP - 88]
	call _temp1095
	pop DWORD PTR [EBP - 88]
	mov EBX, EAX
	mov DWORD PTR [EBP - 92], EBX
	mov EBX, DWORD PTR [EBP - 92]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 10000000
	mov DWORD PTR [EBP - 96], EBX
	mov EAX, DWORD PTR [EBP - 96]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, 12
	mov DWORD PTR [ESP], EBX
	call _malloc
	mov DWORD PTR [EBP - 100], EAX
	mov EBX, DWORD PTR [EBP - 100]
	mov DWORD PTR [EBP - 52], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 104], EBX
	mov EBX, 39
	mov DWORD PTR [EBP - 108], EBX
	mov EBX, 42000
	mov DWORD PTR [EBP - 112], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 116], EBX
	push DWORD PTR [EBP - 116]
	push DWORD PTR [EBP - 112]
	push DWORD PTR [EBP - 108]
	push DWORD PTR [EBP - 104]
	call _temp1077
	pop DWORD PTR [EBP - 104]
	pop DWORD PTR [EBP - 108]
	pop DWORD PTR [EBP - 112]
	pop DWORD PTR [EBP - 116]
	mov EBX, EAX
	mov DWORD PTR [EBP - 120], EBX
	mov EBX, DWORD PTR [EBP - 120]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 124], EBX
	mov EBX, DWORD PTR [EBP - 124]
	mov DWORD PTR [EBP - 128], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 132], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 136], EBX
	push DWORD PTR [EBP - 136]
	push DWORD PTR [EBP - 132]
	call _temp1088
	pop DWORD PTR [EBP - 132]
	pop DWORD PTR [EBP - 136]
	mov EBX, EAX
	mov DWORD PTR [EBP - 140], EBX
	mov EBX, DWORD PTR [EBP - 140]
	mov DWORD PTR [EBP - 28], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 144], EBX
	push DWORD PTR [EBP - 144]
	call _temp1095
	pop DWORD PTR [EBP - 144]
	mov EBX, EAX
	mov DWORD PTR [EBP - 148], EBX
	mov EBX, DWORD PTR [EBP - 148]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 10000000
	mov DWORD PTR [EBP - 152], EBX
	mov EAX, DWORD PTR [EBP - 152]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, 12
	mov DWORD PTR [ESP], EBX
	call _malloc
	mov DWORD PTR [EBP - 156], EAX
	mov EBX, DWORD PTR [EBP - 156]
	mov DWORD PTR [EBP - 52], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 160], EBX
	mov EBX, 22
	mov DWORD PTR [EBP - 164], EBX
	mov EBX, 34000
	mov DWORD PTR [EBP - 168], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 172], EBX
	push DWORD PTR [EBP - 172]
	push DWORD PTR [EBP - 168]
	push DWORD PTR [EBP - 164]
	push DWORD PTR [EBP - 160]
	call _temp1077
	pop DWORD PTR [EBP - 160]
	pop DWORD PTR [EBP - 164]
	pop DWORD PTR [EBP - 168]
	pop DWORD PTR [EBP - 172]
	mov EBX, EAX
	mov DWORD PTR [EBP - 176], EBX
	mov EBX, DWORD PTR [EBP - 176]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 180], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 184], EBX
	push DWORD PTR [EBP - 184]
	push DWORD PTR [EBP - 180]
	call _temp1088
	pop DWORD PTR [EBP - 180]
	pop DWORD PTR [EBP - 184]
	mov EBX, EAX
	mov DWORD PTR [EBP - 188], EBX
	mov EBX, DWORD PTR [EBP - 188]
	mov DWORD PTR [EBP - 28], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 192], EBX
	push DWORD PTR [EBP - 192]
	call _temp1095
	pop DWORD PTR [EBP - 192]
	mov EBX, EAX
	mov DWORD PTR [EBP - 196], EBX
	mov EBX, DWORD PTR [EBP - 196]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 12
	mov DWORD PTR [ESP], EBX
	call _malloc
	mov DWORD PTR [EBP - 200], EAX
	mov EBX, DWORD PTR [EBP - 200]
	mov DWORD PTR [EBP - 204], EBX
	mov EBX, DWORD PTR [EBP - 204]
	mov DWORD PTR [EBP - 208], EBX
	mov EBX, 27
	mov DWORD PTR [EBP - 212], EBX
	mov EBX, 34000
	mov DWORD PTR [EBP - 216], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 220], EBX
	push DWORD PTR [EBP - 220]
	push DWORD PTR [EBP - 216]
	push DWORD PTR [EBP - 212]
	push DWORD PTR [EBP - 208]
	call _temp1077
	pop DWORD PTR [EBP - 208]
	pop DWORD PTR [EBP - 212]
	pop DWORD PTR [EBP - 216]
	pop DWORD PTR [EBP - 220]
	mov EBX, EAX
	mov DWORD PTR [EBP - 224], EBX
	mov EBX, DWORD PTR [EBP - 224]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 228], EBX
	mov EBX, DWORD PTR [EBP - 128]
	mov DWORD PTR [EBP - 232], EBX
	push DWORD PTR [EBP - 232]
	push DWORD PTR [EBP - 228]
	call _temp1091
	pop DWORD PTR [EBP - 228]
	pop DWORD PTR [EBP - 232]
	mov EBX, EAX
	mov DWORD PTR [EBP - 236], EBX
	mov EAX, DWORD PTR [EBP - 236]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 240], EBX
	mov EBX, DWORD PTR [EBP - 204]
	mov DWORD PTR [EBP - 244], EBX
	push DWORD PTR [EBP - 244]
	push DWORD PTR [EBP - 240]
	call _temp1091
	pop DWORD PTR [EBP - 240]
	pop DWORD PTR [EBP - 244]
	mov EBX, EAX
	mov DWORD PTR [EBP - 248], EBX
	mov EAX, DWORD PTR [EBP - 248]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, 10000000
	mov DWORD PTR [EBP - 252], EBX
	mov EAX, DWORD PTR [EBP - 252]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, 12
	mov DWORD PTR [ESP], EBX
	call _malloc
	mov DWORD PTR [EBP - 256], EAX
	mov EBX, DWORD PTR [EBP - 256]
	mov DWORD PTR [EBP - 52], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 260], EBX
	mov EBX, 28
	mov DWORD PTR [EBP - 264], EBX
	mov EBX, 35000
	mov DWORD PTR [EBP - 268], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 272], EBX
	push DWORD PTR [EBP - 272]
	push DWORD PTR [EBP - 268]
	push DWORD PTR [EBP - 264]
	push DWORD PTR [EBP - 260]
	call _temp1077
	pop DWORD PTR [EBP - 260]
	pop DWORD PTR [EBP - 264]
	pop DWORD PTR [EBP - 268]
	pop DWORD PTR [EBP - 272]
	mov EBX, EAX
	mov DWORD PTR [EBP - 276], EBX
	mov EBX, DWORD PTR [EBP - 276]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 280], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 284], EBX
	push DWORD PTR [EBP - 284]
	push DWORD PTR [EBP - 280]
	call _temp1088
	pop DWORD PTR [EBP - 280]
	pop DWORD PTR [EBP - 284]
	mov EBX, EAX
	mov DWORD PTR [EBP - 288], EBX
	mov EBX, DWORD PTR [EBP - 288]
	mov DWORD PTR [EBP - 28], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 292], EBX
	push DWORD PTR [EBP - 292]
	call _temp1095
	pop DWORD PTR [EBP - 292]
	mov EBX, EAX
	mov DWORD PTR [EBP - 296], EBX
	mov EBX, DWORD PTR [EBP - 296]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 2220000
	mov DWORD PTR [EBP - 300], EBX
	mov EAX, DWORD PTR [EBP - 300]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 304], EBX
	mov EBX, DWORD PTR [EBP - 128]
	mov DWORD PTR [EBP - 308], EBX
	push DWORD PTR [EBP - 308]
	push DWORD PTR [EBP - 304]
	call _temp1090
	pop DWORD PTR [EBP - 304]
	pop DWORD PTR [EBP - 308]
	mov EBX, EAX
	mov DWORD PTR [EBP - 312], EBX
	mov EBX, DWORD PTR [EBP - 312]
	mov DWORD PTR [EBP - 28], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 316], EBX
	push DWORD PTR [EBP - 316]
	call _temp1095
	pop DWORD PTR [EBP - 316]
	mov EBX, EAX
	mov DWORD PTR [EBP - 320], EBX
	mov EBX, DWORD PTR [EBP - 320]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 33300000
	mov DWORD PTR [EBP - 324], EBX
	mov EAX, DWORD PTR [EBP - 324]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 328], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 332], EBX
	push DWORD PTR [EBP - 332]
	push DWORD PTR [EBP - 328]
	call _temp1090
	pop DWORD PTR [EBP - 328]
	pop DWORD PTR [EBP - 332]
	mov EBX, EAX
	mov DWORD PTR [EBP - 336], EBX
	mov EBX, DWORD PTR [EBP - 336]
	mov DWORD PTR [EBP - 28], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 340], EBX
	push DWORD PTR [EBP - 340]
	call _temp1095
	pop DWORD PTR [EBP - 340]
	mov EBX, EAX
	mov DWORD PTR [EBP - 344], EBX
	mov EBX, DWORD PTR [EBP - 344]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 44440000
	mov DWORD PTR [EBP - 348], EBX
	mov EAX, DWORD PTR [EBP - 348]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, 0
	mov DWORD PTR [EBP - 352], EBX
	mov EBX, DWORD PTR [EBP - 352]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 352
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc


	.ident "Error 404: Compiler Not Found"
	.def _malloc; .scl 2; .type 32; .endef
	.def _printf; .scl 2; .type 32; .endef
