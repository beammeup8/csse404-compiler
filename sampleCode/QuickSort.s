	.file "sampleCode/QuickSort.java"
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
	call _temp1285
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

_temp1285:
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
	mov EDX, DWORD PTR [EBP - 8]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 12], EBX
	push DWORD PTR [EBP - 12]
	push DWORD PTR [EBP - 8]
	call _temp1288
	pop DWORD PTR [EBP - 8]
	pop DWORD PTR [EBP - 12]
	mov EBX, EAX
	mov DWORD PTR [EBP - 16], EBX
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 20], EBX
	mov EDX, DWORD PTR [EBP - 24]
	mov EDX, DWORD PTR [EBP + 8]
	push DWORD PTR [EBP - 24]
	call _temp1287
	pop DWORD PTR [EBP - 24]
	mov EBX, EAX
	mov DWORD PTR [EBP - 28], EBX
	mov EBX, DWORD PTR [EBP - 28]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 9999
	mov DWORD PTR [EBP - 32], EBX
	mov EAX, DWORD PTR [EBP - 32]
	mov DWORD PTR [ESP+4], EAX
	mov DWORD PTR [ESP], OFFSET FLAT:LC0
	call _printf
	mov EDX, DWORD PTR [EBP - 36]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 40]
	mov EBX, DWORD PTR [EBP - 36]
	mov EDX, DWORD PTR [EBX + 4]
	mov EBX, 1
	mov DWORD PTR [EBP - 44], EBX
	mov EAX, DWORD PTR [EBP - 40]
	mov EBX, DWORD PTR [EBP - 44]
	sub EAX, EBX
	mov DWORD PTR [EBP - 48], EAX
	mov EBX, DWORD PTR [EBP - 48]
	mov DWORD PTR [EBP - 20], EBX
	mov EDX, DWORD PTR [EBP - 52]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, 0
	mov DWORD PTR [EBP - 56], EBX
	mov EBX, DWORD PTR [EBP - 20]
	mov DWORD PTR [EBP - 60], EBX
	push DWORD PTR [EBP - 60]
	push DWORD PTR [EBP - 56]
	push DWORD PTR [EBP - 52]
	call _temp1286
	pop DWORD PTR [EBP - 52]
	pop DWORD PTR [EBP - 56]
	pop DWORD PTR [EBP - 60]
	mov EBX, EAX
	mov DWORD PTR [EBP - 64], EBX
	mov EBX, DWORD PTR [EBP - 64]
	mov DWORD PTR [EBP - 20], EBX
	mov EDX, DWORD PTR [EBP - 68]
	mov EDX, DWORD PTR [EBP + 8]
	push DWORD PTR [EBP - 68]
	call _temp1287
	pop DWORD PTR [EBP - 68]
	mov EBX, EAX
	mov DWORD PTR [EBP - 72], EBX
	mov EBX, DWORD PTR [EBP - 72]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, 0
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

_temp1286:
	.cfi_startproc
	push ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov ebp, esp
	.cfi_def_cfa_register 5
	pushad
	mov EBX, ESP
	mov EBP, EBX
	sub ESP, 416
	mov EDX, DWORD PTR [EBP - 4]
	mov EDX, DWORD PTR [EBP + 16]
	mov EDX, DWORD PTR [EBP - 8]
	mov EDX, DWORD PTR [EBP + 12]
	mov EBX, 0
	mov DWORD PTR [EBP - 12], EBX
	mov EBX, DWORD PTR [EBP - 12]
	mov DWORD PTR [EBP - 16], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 20], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 24], EBX
	mov EAX, DWORD PTR [EBP - 20]
	mov EBX, DWORD PTR [EBP - 24]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 28], EAX
	je _label134
	mov EDX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 36]
	mov EBX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 40], EBX
	mov EAX, DWORD PTR [EBP - 40]
	add EAX, 1
	mov DWORD PTR [EBP - 44], EAX
	mov EAX, DWORD PTR [EBP - 44]
	imul EAX, 4
	mov DWORD PTR [EBP - 44], EAX
	mov EDX, DWORD PTR [EBP - 48]
	mov EBX, DWORD PTR [EBP - 36]
	mov ECX, DWORD PTR [EBP - 44]
	mov EDX, DWORD PTR [EBX + ECX]
	mov EBX, DWORD PTR [EBP - 48]
	mov DWORD PTR [EBP - 52], EBX
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 56], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 60], EBX
	mov EAX, DWORD PTR [EBP - 56]
	mov EBX, DWORD PTR [EBP - 60]
	sub EAX, EBX
	mov DWORD PTR [EBP - 64], EAX
	mov EBX, DWORD PTR [EBP - 64]
	mov DWORD PTR [EBP - 68], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 72], EBX
	mov EBX, DWORD PTR [EBP - 72]
	mov DWORD PTR [EBP - 76], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 80], EBX
	mov EBX, DWORD PTR [EBP - 80]
	mov DWORD PTR [EBP - 84], EBX
_label135:
	mov EBX, DWORD PTR [EBP - 84]
	mov DWORD PTR [EBP - 88], EBX
	je _label136
	mov EBX, 1
	mov DWORD PTR [EBP - 92], EBX
	mov EBX, DWORD PTR [EBP - 92]
	mov DWORD PTR [EBP - 96], EBX
_label137:
	mov EBX, DWORD PTR [EBP - 96]
	mov DWORD PTR [EBP - 100], EBX
	je _label138
	mov EBX, DWORD PTR [EBP - 68]
	mov DWORD PTR [EBP - 104], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 108], EBX
	mov EAX, DWORD PTR [EBP - 104]
	mov EBX, DWORD PTR [EBP - 108]
	add EAX, EBX
	mov DWORD PTR [EBP - 112], EAX
	mov EBX, DWORD PTR [EBP - 112]
	mov DWORD PTR [EBP - 68], EBX
	mov EDX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 116]
	mov EBX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 68]
	mov DWORD PTR [EBP - 120], EBX
	mov EAX, DWORD PTR [EBP - 120]
	add EAX, 1
	mov DWORD PTR [EBP - 124], EAX
	mov EAX, DWORD PTR [EBP - 124]
	imul EAX, 4
	mov DWORD PTR [EBP - 124], EAX
	mov EDX, DWORD PTR [EBP - 128]
	mov EBX, DWORD PTR [EBP - 116]
	mov ECX, DWORD PTR [EBP - 124]
	mov EDX, DWORD PTR [EBX + ECX]
	mov EBX, DWORD PTR [EBP - 128]
	mov DWORD PTR [EBP - 132], EBX
	mov EBX, DWORD PTR [EBP - 132]
	mov DWORD PTR [EBP - 136], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 140], EBX
	mov EAX, DWORD PTR [EBP - 136]
	mov EBX, DWORD PTR [EBP - 140]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 144], EAX
	mov EBX, DWORD PTR [EBP - 144]
	not EAX
	mov DWORD PTR [EBP - 148], EAX
	je _label139
	mov EBX, 0
	mov DWORD PTR [EBP - 152], EBX
	mov EBX, DWORD PTR [EBP - 152]
	mov DWORD PTR [EBP - 96], EBX
	jmp _label140
_label139:
	mov EBX, 1
	mov DWORD PTR [EBP - 156], EBX
	mov EBX, DWORD PTR [EBP - 156]
	mov DWORD PTR [EBP - 96], EBX
_label140:
	jmp _label137
_label138:
	mov EBX, 1
	mov DWORD PTR [EBP - 160], EBX
	mov EBX, DWORD PTR [EBP - 160]
	mov DWORD PTR [EBP - 96], EBX
_label141:
	mov EBX, DWORD PTR [EBP - 96]
	mov DWORD PTR [EBP - 164], EBX
	je _label142
	mov EBX, DWORD PTR [EBP - 76]
	mov DWORD PTR [EBP - 168], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 172], EBX
	mov EAX, DWORD PTR [EBP - 168]
	mov EBX, DWORD PTR [EBP - 172]
	sub EAX, EBX
	mov DWORD PTR [EBP - 176], EAX
	mov EBX, DWORD PTR [EBP - 176]
	mov DWORD PTR [EBP - 76], EBX
	mov EDX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 180]
	mov EBX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 76]
	mov DWORD PTR [EBP - 184], EBX
	mov EAX, DWORD PTR [EBP - 184]
	add EAX, 1
	mov DWORD PTR [EBP - 188], EAX
	mov EAX, DWORD PTR [EBP - 188]
	imul EAX, 4
	mov DWORD PTR [EBP - 188], EAX
	mov EDX, DWORD PTR [EBP - 192]
	mov EBX, DWORD PTR [EBP - 180]
	mov ECX, DWORD PTR [EBP - 188]
	mov EDX, DWORD PTR [EBX + ECX]
	mov EBX, DWORD PTR [EBP - 192]
	mov DWORD PTR [EBP - 132], EBX
	mov EBX, DWORD PTR [EBP - 52]
	mov DWORD PTR [EBP - 196], EBX
	mov EBX, DWORD PTR [EBP - 132]
	mov DWORD PTR [EBP - 200], EBX
	mov EAX, DWORD PTR [EBP - 196]
	mov EBX, DWORD PTR [EBP - 200]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 204], EAX
	mov EBX, DWORD PTR [EBP - 204]
	not EAX
	mov DWORD PTR [EBP - 208], EAX
	je _label143
	mov EBX, 0
	mov DWORD PTR [EBP - 212], EBX
	mov EBX, DWORD PTR [EBP - 212]
	mov DWORD PTR [EBP - 96], EBX
	jmp _label144
_label143:
	mov EBX, 1
	mov DWORD PTR [EBP - 216], EBX
	mov EBX, DWORD PTR [EBP - 216]
	mov DWORD PTR [EBP - 96], EBX
_label144:
	jmp _label141
_label142:
	mov EDX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 220]
	mov EBX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 68]
	mov DWORD PTR [EBP - 224], EBX
	mov EAX, DWORD PTR [EBP - 224]
	add EAX, 1
	mov DWORD PTR [EBP - 228], EAX
	mov EAX, DWORD PTR [EBP - 228]
	imul EAX, 4
	mov DWORD PTR [EBP - 228], EAX
	mov EDX, DWORD PTR [EBP - 232]
	mov EBX, DWORD PTR [EBP - 220]
	mov ECX, DWORD PTR [EBP - 228]
	mov EDX, DWORD PTR [EBX + ECX]
	mov EBX, DWORD PTR [EBP - 232]
	mov DWORD PTR [EBP - 16], EBX
	mov EDX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 236]
	mov EBX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 76]
	mov DWORD PTR [EBP - 240], EBX
	mov EAX, DWORD PTR [EBP - 240]
	add EAX, 1
	mov DWORD PTR [EBP - 244], EAX
	mov EAX, DWORD PTR [EBP - 244]
	imul EAX, 4
	mov DWORD PTR [EBP - 244], EAX
	mov EDX, DWORD PTR [EBP - 248]
	mov EBX, DWORD PTR [EBP - 236]
	mov ECX, DWORD PTR [EBP - 244]
	mov EDX, DWORD PTR [EBX + ECX]
	mov EBX, DWORD PTR [EBP - 68]
	mov DWORD PTR [EBP - 252], EBX
	mov EAX, DWORD PTR [EBP - 252]
	add EAX, 1
	mov DWORD PTR [EBP - 256], EAX
	mov EAX, DWORD PTR [EBP - 256]
	imul EAX, 4
	mov DWORD PTR [EBP - 256], EAX
	mov EDX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 32]
	mov EBX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 248]
	mov EBX, DWORD PTR [EBP - 32]
	mov ECX, DWORD PTR [EBP - 256]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 260], EBX
	mov EBX, DWORD PTR [EBP - 76]
	mov DWORD PTR [EBP - 264], EBX
	mov EAX, DWORD PTR [EBP - 264]
	add EAX, 1
	mov DWORD PTR [EBP - 268], EAX
	mov EAX, DWORD PTR [EBP - 268]
	imul EAX, 4
	mov DWORD PTR [EBP - 268], EAX
	mov EDX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 32]
	mov EBX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 260]
	mov EBX, DWORD PTR [EBP - 32]
	mov ECX, DWORD PTR [EBP - 268]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, DWORD PTR [EBP - 76]
	mov DWORD PTR [EBP - 272], EBX
	mov EBX, DWORD PTR [EBP - 68]
	mov DWORD PTR [EBP - 276], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 280], EBX
	mov EAX, DWORD PTR [EBP - 276]
	mov EBX, DWORD PTR [EBP - 280]
	add EAX, EBX
	mov DWORD PTR [EBP - 284], EAX
	mov EAX, DWORD PTR [EBP - 272]
	mov EBX, DWORD PTR [EBP - 284]
	cmp EAX, EBX
	setl AL
	mov DWORD PTR [EBP - 288], EAX
	je _label145
	mov EBX, 0
	mov DWORD PTR [EBP - 292], EBX
	mov EBX, DWORD PTR [EBP - 292]
	mov DWORD PTR [EBP - 84], EBX
	jmp _label146
_label145:
	mov EBX, 1
	mov DWORD PTR [EBP - 296], EBX
	mov EBX, DWORD PTR [EBP - 296]
	mov DWORD PTR [EBP - 84], EBX
_label146:
	jmp _label135
_label136:
	mov EDX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 300]
	mov EBX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 68]
	mov DWORD PTR [EBP - 304], EBX
	mov EAX, DWORD PTR [EBP - 304]
	add EAX, 1
	mov DWORD PTR [EBP - 308], EAX
	mov EAX, DWORD PTR [EBP - 308]
	imul EAX, 4
	mov DWORD PTR [EBP - 308], EAX
	mov EDX, DWORD PTR [EBP - 312]
	mov EBX, DWORD PTR [EBP - 300]
	mov ECX, DWORD PTR [EBP - 308]
	mov EDX, DWORD PTR [EBX + ECX]
	mov EBX, DWORD PTR [EBP - 76]
	mov DWORD PTR [EBP - 316], EBX
	mov EAX, DWORD PTR [EBP - 316]
	add EAX, 1
	mov DWORD PTR [EBP - 320], EAX
	mov EAX, DWORD PTR [EBP - 320]
	imul EAX, 4
	mov DWORD PTR [EBP - 320], EAX
	mov EDX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 32]
	mov EBX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 312]
	mov EBX, DWORD PTR [EBP - 32]
	mov ECX, DWORD PTR [EBP - 320]
	mov DWORD PTR [EBX + ECX], EDX
	mov EDX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 324]
	mov EBX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBX + 0]
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 328], EBX
	mov EAX, DWORD PTR [EBP - 328]
	add EAX, 1
	mov DWORD PTR [EBP - 332], EAX
	mov EAX, DWORD PTR [EBP - 332]
	imul EAX, 4
	mov DWORD PTR [EBP - 332], EAX
	mov EDX, DWORD PTR [EBP - 336]
	mov EBX, DWORD PTR [EBP - 324]
	mov ECX, DWORD PTR [EBP - 332]
	mov EDX, DWORD PTR [EBX + ECX]
	mov EBX, DWORD PTR [EBP - 68]
	mov DWORD PTR [EBP - 340], EBX
	mov EAX, DWORD PTR [EBP - 340]
	add EAX, 1
	mov DWORD PTR [EBP - 344], EAX
	mov EAX, DWORD PTR [EBP - 344]
	imul EAX, 4
	mov DWORD PTR [EBP - 344], EAX
	mov EDX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 32]
	mov EBX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 336]
	mov EBX, DWORD PTR [EBP - 32]
	mov ECX, DWORD PTR [EBP - 344]
	mov DWORD PTR [EBX + ECX], EDX
	mov EBX, DWORD PTR [EBP - 16]
	mov DWORD PTR [EBP - 348], EBX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 352], EBX
	mov EAX, DWORD PTR [EBP - 352]
	add EAX, 1
	mov DWORD PTR [EBP - 356], EAX
	mov EAX, DWORD PTR [EBP - 356]
	imul EAX, 4
	mov DWORD PTR [EBP - 356], EAX
	mov EDX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBP + 8]
	mov EDX, DWORD PTR [EBP - 32]
	mov EBX, DWORD PTR [EBP - 32]
	mov EDX, DWORD PTR [EBX + 0]
	mov EDX, DWORD PTR [EBP - 348]
	mov EBX, DWORD PTR [EBP - 32]
	mov ECX, DWORD PTR [EBP - 356]
	mov DWORD PTR [EBX + ECX], EDX
	mov EDX, DWORD PTR [EBP - 360]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 4]
	mov DWORD PTR [EBP - 364], EBX
	mov EBX, DWORD PTR [EBP - 68]
	mov DWORD PTR [EBP - 368], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 372], EBX
	mov EAX, DWORD PTR [EBP - 368]
	mov EBX, DWORD PTR [EBP - 372]
	sub EAX, EBX
	mov DWORD PTR [EBP - 376], EAX
	push DWORD PTR [EBP - 376]
	push DWORD PTR [EBP - 364]
	push DWORD PTR [EBP - 360]
	call _temp1286
	pop DWORD PTR [EBP - 360]
	pop DWORD PTR [EBP - 364]
	pop DWORD PTR [EBP - 376]
	mov EBX, EAX
	mov DWORD PTR [EBP - 380], EBX
	mov EBX, DWORD PTR [EBP - 380]
	mov DWORD PTR [EBP - 384], EBX
	mov EDX, DWORD PTR [EBP - 388]
	mov EDX, DWORD PTR [EBP + 8]
	mov EBX, DWORD PTR [EBP - 68]
	mov DWORD PTR [EBP - 392], EBX
	mov EBX, 1
	mov DWORD PTR [EBP - 396], EBX
	mov EAX, DWORD PTR [EBP - 392]
	mov EBX, DWORD PTR [EBP - 396]
	add EAX, EBX
	mov DWORD PTR [EBP - 400], EAX
	mov EBX, DWORD PTR [EBP - 8]
	mov DWORD PTR [EBP - 404], EBX
	push DWORD PTR [EBP - 404]
	push DWORD PTR [EBP - 400]
	push DWORD PTR [EBP - 388]
	call _temp1286
	pop DWORD PTR [EBP - 388]
	pop DWORD PTR [EBP - 400]
	pop DWORD PTR [EBP - 404]
	mov EBX, EAX
	mov DWORD PTR [EBP - 408], EBX
	mov EBX, DWORD PTR [EBP - 408]
	mov DWORD PTR [EBP - 384], EBX
	jmp _label147
_label134:
	mov EBX, 0
	mov DWORD PTR [EBP - 412], EBX
	mov EBX, DWORD PTR [EBP - 412]
	mov DWORD PTR [EBP - 384], EBX
_label147:
	mov EBX, 0
	mov DWORD PTR [EBP - 416], EBX
	mov EBX, DWORD PTR [EBP - 416]
	mov EAX, EBX
	mov EBX, DWORD PTR [ESP-32]
	mov EAX, EBX
	add ESP, 416
	popad
	pop ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc

_temp1287:
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
_label148:
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
	je _label149
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
	jmp _label148
_label149:
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

_temp1288:
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
