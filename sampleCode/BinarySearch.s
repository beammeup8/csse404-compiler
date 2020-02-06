	.file "sampleCode/BinarySearch.java"
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
	mov EBX, 20
	mov DWORD PTR [EBP - 8], EBX
	push DWORD PTR [EBP - 8]
	push DWORD PTR [EBP - 4]
	call _temp165
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

_temp165:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 196
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 12]
	mov EDX, DWORD PTR [EBP - 8]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 12], EBX
	push DWORD PTR [EBP - 12]
	push DWORD PTR [EBP - 8]
	call _temp170
	pop DWORD PTR [EBP - 8]
	pop DWORD PTR [EBP - 12]
	mov EBX, EAX
	mov DWORD PTR [EBP - 16], EBX
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 20], EBX
	mov EDX, DWORD PTR [EBP - 24]
	mov EDX, DWORD PTR [EBP + 8]
	push DWORD PTR [EBP - 24]
	call _temp169
	pop DWORD PTR [EBP - 24]
	mov EBX, EAX
	mov DWORD PTR [EBP - 28], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 32], EBX
	mov EDX, DWORD PTR [EBP - 36]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, 8
	mov DWORD PTR [EBP - 40], EBX
	push DWORD PTR [EBP - 40]
	push DWORD PTR [EBP - 36]
	call _temp166
	pop DWORD PTR [EBP - 36]
	pop DWORD PTR [EBP - 40]
	mov EBX, EAX
	mov DWORD PTR [EBP - 44], EBX
	je _label0
	mov EBX, 1
	mov DWORD PTR [EBP - 48], EBX
	mov EAX, DWORD PTR [EBP - 48]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	jmp _label1
_label0:
	mov EBX, 0
	mov DWORD PTR [EBP - 52], EBX
	mov EAX, DWORD PTR [EBP - 52]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
_label1:
	mov EDX, DWORD PTR [EBP - 56]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, 19
	mov DWORD PTR [EBP - 60], EBX
	push DWORD PTR [EBP - 60]
	push DWORD PTR [EBP - 56]
	call _temp166
	pop DWORD PTR [EBP - 56]
	pop DWORD PTR [EBP - 60]
	mov EBX, EAX
	mov DWORD PTR [EBP - 64], EBX
	je _label2
	mov EBX, 1
	mov DWORD PTR [EBP - 68], EBX
	mov EAX, DWORD PTR [EBP - 68]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	jmp _label3
_label2:
	mov EBX, 0
	mov DWORD PTR [EBP - 72], EBX
	mov EAX, DWORD PTR [EBP - 72]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
_label3:
	mov EDX, DWORD PTR [EBP - 76]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, 20
	mov DWORD PTR [EBP - 80], EBX
	push DWORD PTR [EBP - 80]
	push DWORD PTR [EBP - 76]
	call _temp166
	pop DWORD PTR [EBP - 76]
	pop DWORD PTR [EBP - 80]
	mov EBX, EAX
	mov DWORD PTR [EBP - 84], EBX
	je _label4
	mov EBX, 1
	mov DWORD PTR [EBP - 88], EBX
	mov EAX, DWORD PTR [EBP - 88]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	jmp _label5
_label4:
	mov EBX, 0
	mov DWORD PTR [EBP - 92], EBX
	mov EAX, DWORD PTR [EBP - 92]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
_label5:
	mov EDX, DWORD PTR [EBP - 96]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, 21
	mov DWORD PTR [EBP - 100], EBX
	push DWORD PTR [EBP - 100]
	push DWORD PTR [EBP - 96]
	call _temp166
	pop DWORD PTR [EBP - 96]
	pop DWORD PTR [EBP - 100]
	mov EBX, EAX
	mov DWORD PTR [EBP - 104], EBX
	je _label6
	mov EBX, 1
	mov DWORD PTR [EBP - 108], EBX
	mov EAX, DWORD PTR [EBP - 108]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	jmp _label7
_label6:
	mov EBX, 0
	mov DWORD PTR [EBP - 112], EBX
	mov EAX, DWORD PTR [EBP - 112]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
_label7:
	mov EDX, DWORD PTR [EBP - 116]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, 37
	mov DWORD PTR [EBP - 120], EBX
	push DWORD PTR [EBP - 120]
	push DWORD PTR [EBP - 116]
	call _temp166
	pop DWORD PTR [EBP - 116]
	pop DWORD PTR [EBP - 120]
	mov EBX, EAX
	mov DWORD PTR [EBP - 124], EBX
	je _label8
	mov EBX, 1
	mov DWORD PTR [EBP - 128], EBX
	mov EAX, DWORD PTR [EBP - 128]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	jmp _label9
_label8:
	mov EBX, 0
	mov DWORD PTR [EBP - 132], EBX
	mov EAX, DWORD PTR [EBP - 132]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
_label9:
	mov EDX, DWORD PTR [EBP - 136]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, 38
	mov DWORD PTR [EBP - 140], EBX
	push DWORD PTR [EBP - 140]
	push DWORD PTR [EBP - 136]
	call _temp166
	pop DWORD PTR [EBP - 136]
	pop DWORD PTR [EBP - 140]
	mov EBX, EAX
	mov DWORD PTR [EBP - 144], EBX
	je _label10
	mov EBX, 1
	mov DWORD PTR [EBP - 148], EBX
	mov EAX, DWORD PTR [EBP - 148]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	jmp _label11
_label10:
	mov EBX, 0
	mov DWORD PTR [EBP - 152], EBX
	mov EAX, DWORD PTR [EBP - 152]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
_label11:
	mov EDX, DWORD PTR [EBP - 156]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, 39
	mov DWORD PTR [EBP - 160], EBX
	push DWORD PTR [EBP - 160]
	push DWORD PTR [EBP - 156]
	call _temp166
	pop DWORD PTR [EBP - 156]
	pop DWORD PTR [EBP - 160]
	mov EBX, EAX
	mov DWORD PTR [EBP - 164], EBX
	je _label12
	mov EBX, 1
	mov DWORD PTR [EBP - 168], EBX
	mov EAX, DWORD PTR [EBP - 168]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	jmp _label13
_label12:
	mov EBX, 0
	mov DWORD PTR [EBP - 172], EBX
	mov EAX, DWORD PTR [EBP - 172]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
_label13:
	mov EDX, DWORD PTR [EBP - 176]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, 50
	mov DWORD PTR [EBP - 180], EBX
	push DWORD PTR [EBP - 180]
	push DWORD PTR [EBP - 176]
	call _temp166
	pop DWORD PTR [EBP - 176]
	pop DWORD PTR [EBP - 180]
	mov EBX, EAX
	mov DWORD PTR [EBP - 184], EBX
	je _label14
	mov EBX, 1
	mov DWORD PTR [EBP - 188], EBX
	mov EAX, DWORD PTR [EBP - 188]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	jmp _label15
_label14:
	mov EBX, 0
	mov DWORD PTR [EBP - 192], EBX
	mov EAX, DWORD PTR [EBP - 192]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
_label15:
	mov EBX, 999
	mov DWORD PTR [EBP - 196], EBX
	mov EBX, DWORD PTR [EBP - 196]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 196
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp166:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 224
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 12]
	mov EBX, 0
	mov DWORD PTR [EBP - 8], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 12], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 16], EBX
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 20], EBX
	mov EDX, DWORD PTR [EBP - 24]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 28]
	mov EBX, DWORD PTR [EBP - 24]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 32]
	mov EBX, DWORD PTR [EBP - 28]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 32]
	mov DWORD PTR [EBP - 36], EBX
	mov EBX, DWORD PTR [EBP - 36]
	mov DWORD PTR [EBP - 40], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 44], EBX
	mov EAX, DWORD PTR [EBP - 40]
	mov EBX, DWORD PTR [EBP - 44]
	sub EAX, EBX
	mov DWORD PTR [EBP - 48], EAX
	mov EBX, DWORD PTR [EBP - 48]
	mov DWORD PTR [EBP - 36], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 52], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 56], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 60], EBX
	mov EBX, DWORD PTR [EBP - 60]
	mov DWORD PTR [EBP - 64], EBX
_label16:
	mov EBX, DWORD PTR [EBP - 64]
	mov DWORD PTR [EBP - 68], EBX
	je _label17
	mov EBX, DWORD PTR [EBP - 56]
	mov DWORD PTR [EBP - 72], EBX
	mov EBX, DWORD PTR [EBP - 36]
	mov DWORD PTR [EBP - 76], EBX
	mov EAX, DWORD PTR [EBP - 72]
	mov EBX, DWORD PTR [EBP - 76]
	add EAX, EBX
	mov DWORD PTR [EBP - 80], EAX
	mov EBX, DWORD PTR [EBP - 80]
	mov DWORD PTR [EBP - 84], EBX
	mov EDX, DWORD PTR [EBP - 88]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 84]
	mov DWORD PTR [EBP - 92], EBX
	push DWORD PTR [EBP - 92]
	push DWORD PTR [EBP - 88]
	call _temp167
	pop DWORD PTR [EBP - 88]
	pop DWORD PTR [EBP - 92]
	mov EBX, EAX
	mov DWORD PTR [EBP - 96], EBX
	mov EBX, DWORD PTR [EBP - 96]
	mov DWORD PTR [EBP - 84], EBX
	mov EDX, DWORD PTR [EBP - 24]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 100]
	mov EBX, DWORD PTR [EBP - 24]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 84]
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
	mov DWORD PTR [EBP - 12], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 116], EBX
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBP - 120], EBX
	mov EAX, DWORD PTR [EBP - 116]
	mov EBX, DWORD PTR [EBP - 120]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 124], EAX
	je _label18
	mov EBX, DWORD PTR [EBP - 84]
	mov DWORD PTR [EBP - 128], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 132], EBX
	mov EAX, DWORD PTR [EBP - 128]
	mov EBX, DWORD PTR [EBP - 132]
	sub EAX, EBX
	mov DWORD PTR [EBP - 136], EAX
	mov EBX, DWORD PTR [EBP - 136]
	mov DWORD PTR [EBP - 36], EBX
	jmp _label19
_label18:
	mov EBX, DWORD PTR [EBP - 84]
	mov DWORD PTR [EBP - 140], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 144], EBX
	mov EAX, DWORD PTR [EBP - 140]
	mov EBX, DWORD PTR [EBP - 144]
	add EAX, EBX
	mov DWORD PTR [EBP - 148], EAX
	mov EBX, DWORD PTR [EBP - 148]
	mov DWORD PTR [EBP - 56], EBX
_label19:
	mov EDX, DWORD PTR [EBP - 152]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBP - 156], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 160], EBX
	push DWORD PTR [EBP - 160]
	push DWORD PTR [EBP - 156]
	push DWORD PTR [EBP - 152]
	call _temp168
	pop DWORD PTR [EBP - 152]
	pop DWORD PTR [EBP - 156]
	pop DWORD PTR [EBP - 160]
	mov EBX, EAX
	mov DWORD PTR [EBP - 164], EBX
	je _label20
	mov EBX, 0
	mov DWORD PTR [EBP - 168], EBX
	mov EBX, DWORD PTR [EBP - 168]
	mov DWORD PTR [EBP - 64], EBX
	jmp _label21
_label20:
	mov EBX, 1
	mov DWORD PTR [EBP - 172], EBX
	mov EBX, DWORD PTR [EBP - 172]
	mov DWORD PTR [EBP - 64], EBX
_label21:
	mov EBX, DWORD PTR [EBP - 36]
	mov DWORD PTR [EBP - 176], EBX
	mov EBX, DWORD PTR [EBP - 56]
	mov DWORD PTR [EBP - 180], EBX
	mov EAX, DWORD PTR [EBP - 176]
	mov EBX, DWORD PTR [EBP - 180]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 184], EAX
	je _label22
	mov EBX, 0
	mov DWORD PTR [EBP - 188], EBX
	mov EBX, DWORD PTR [EBP - 188]
	mov DWORD PTR [EBP - 64], EBX
	jmp _label23
_label22:
	mov EBX, 0
	mov DWORD PTR [EBP - 192], EBX
	mov EBX, DWORD PTR [EBP - 192]
	mov DWORD PTR [EBP - 196], EBX
_label23:
	jmp _label16
_label17:
	mov EDX, DWORD PTR [EBP - 200]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBP - 204], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 208], EBX
	push DWORD PTR [EBP - 208]
	push DWORD PTR [EBP - 204]
	push DWORD PTR [EBP - 200]
	call _temp168
	pop DWORD PTR [EBP - 200]
	pop DWORD PTR [EBP - 204]
	pop DWORD PTR [EBP - 208]
	mov EBX, EAX
	mov DWORD PTR [EBP - 212], EBX
	je _label24
	mov EBX, 1
	mov DWORD PTR [EBP - 216], EBX
	mov EBX, DWORD PTR [EBP - 216]
	mov DWORD PTR [EBP - 20], EBX
	jmp _label25
_label24:
	mov EBX, 0
	mov DWORD PTR [EBP - 220], EBX
	mov EBX, DWORD PTR [EBP - 220]
	mov DWORD PTR [EBP - 20], EBX
_label25:
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 224], EBX
	mov EBX, DWORD PTR [EBP - 224]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 224
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp167:
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
	mov EDX, DWORD PTR [EBP + 12]
	mov EBX, 0
	mov DWORD PTR [EBP - 8], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 12], EBX
	mov EBX, 0
	mov DWORD PTR [EBP - 16], EBX
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 24], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 28], EBX
	mov EAX, DWORD PTR [EBP - 24]
	mov EBX, DWORD PTR [EBP - 28]
	sub EAX, EBX
	mov DWORD PTR [EBP - 32], EAX
	mov EBX, DWORD PTR [EBP - 32]
	mov DWORD PTR [EBP - 36], EBX
_label26:
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 40], EBX
	mov EBX, DWORD PTR [EBP - 36]
	mov DWORD PTR [EBP - 44], EBX
	mov EAX, DWORD PTR [EBP - 40]
	mov EBX, DWORD PTR [EBP - 44]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 48], EAX
	je _label27
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBP - 52], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 56], EBX
	mov EAX, DWORD PTR [EBP - 52]
	mov EBX, DWORD PTR [EBP - 56]
	add EAX, EBX
	mov DWORD PTR [EBP - 60], EAX
	mov EBX, DWORD PTR [EBP - 60]
	mov DWORD PTR [EBP - 12], EBX
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 64], EBX
	mov EBX, 2
	mov DWORD PTR [EBP - 68], EBX
	mov EAX, DWORD PTR [EBP - 64]
	mov EBX, DWORD PTR [EBP - 68]
	add EAX, EBX
	mov DWORD PTR [EBP - 72], EAX
	mov EBX, DWORD PTR [EBP - 72]
	mov DWORD PTR [EBP - 20], EBX
	jmp _label26
_label27:
	mov EBX, DWORD PTR [EBP - 12]
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

_temp168:
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
	je _label28
	mov EBX, 0
	mov DWORD PTR [EBP - 48], EBX
	mov EBX, DWORD PTR [EBP - 48]
	mov DWORD PTR [EBP - 16], EBX
	jmp _label29
_label28:
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
	je _label30
	mov EBX, 0
	mov DWORD PTR [EBP - 68], EBX
	mov EBX, DWORD PTR [EBP - 68]
	mov DWORD PTR [EBP - 16], EBX
	jmp _label31
_label30:
	mov EBX, 1
	mov DWORD PTR [EBP - 72], EBX
	mov EBX, DWORD PTR [EBP - 72]
	mov DWORD PTR [EBP - 16], EBX
_label31:
_label29:
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

_temp169:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 64
	mov EBX, 1
	mov DWORD PTR [EBP - 4], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 8], EBX
_label32:
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
	je _label33
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
	jmp _label32
_label33:
	mov EBX, 99999
	mov DWORD PTR [EBP - 60], EBX
	mov EAX, DWORD PTR [EBP - 60]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EBX, 0
	mov DWORD PTR [EBP - 64], EBX
	mov EBX, DWORD PTR [EBP - 64]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 64
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp170:
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
_label34:
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
	je _label35
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
	jmp _label34
_label35:
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
