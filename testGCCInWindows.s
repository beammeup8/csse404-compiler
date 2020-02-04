	.file	"testGCCInWindows.c"
	.intel_syntax noprefix
	.text
	.globl	_nothing
	.def	_nothing;	.scl	2;	.type	32;	.endef
_nothing:
LFB14:
	.cfi_startproc
	push	ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	mov	ebp, esp
	.cfi_def_cfa_register 5
	sub	esp, 40
	mov	DWORD PTR [esp], 20
	call	_malloc
	mov	DWORD PTR [ebp-12], eax
	mov	eax, DWORD PTR [ebp-12]
	mov	DWORD PTR [eax], 20
	mov	eax, DWORD PTR [ebp-12]
	mov	eax, DWORD PTR [eax]
	add	eax, 70
	mov	DWORD PTR [ebp-16], eax
	mov	eax, DWORD PTR [ebp-12]
	mov	DWORD PTR [esp], eax
	call	_free
	nop
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
LFE14:
	.ident	"GCC: (GNU) 5.3.0"
	.def	_malloc;	.scl	2;	.type	32;	.endef
	.def	_free;	.scl	2;	.type	32;	.endef
