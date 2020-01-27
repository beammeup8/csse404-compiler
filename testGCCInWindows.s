	.file	"testGCCInWindows.c"
	.text
	.globl	_nothing
	.def	_nothing;	.scl	2;	.type	32;	.endef
_nothing:
LFB14:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	subl	$40, %esp
	movl	$4, (%esp)
	call	_malloc
	movl	%eax, -12(%ebp)
	nop
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
LFE14:
	.ident	"GCC: (GNU) 5.3.0"
	.def	_malloc;	.scl	2;	.type	32;	.endef
