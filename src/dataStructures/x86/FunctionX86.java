package dataStructures.x86;

import java.util.List;

public class FunctionX86 {
	public List<Command> commands;
	public boolean isMain;
	public String name;
	public int stackSize;

	public FunctionX86(List<Command> commands, boolean isMain, String name, int stackSize) {
		this.isMain = isMain;
		this.commands = commands;
		this.name = name;
		this.stackSize = stackSize;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name + ":\n");
		builder.append(
				"\t.cfi_startproc\n\tpush ebp\n\t.cfi_def_cfa_offset 8\n\t.cfi_offset 5, -8\n\tmov ebp, esp\n\t.cfi_def_cfa_register 5\n");
		if (isMain) {
			builder.append("\tand esp, -16\n\tsub esp, 16\n\tcall ___main\n");
		}
		builder.append(
				"\tpush EBX\n\tpush ECX\n\tpush EDX\n\tpush ESI\n\tpush EDI\n\tpush ESP\n\tpush EBP\n\tmov EBP, ESP\n");
		if(stackSize != 0){
			builder.append("\tsub ESP, " + stackSize + "\n"); 
		}
		for (int i = 0; i < commands.size(); i++) {
			builder.append(commands.get(i).toString() + "\n");
		}
		if(stackSize != 0){
			builder.append("\tadd ESP, " + stackSize + "\n"); 
		}
		builder.append("\tpop EBP\n\tpop ESP\n\tpop EDI\n\tpop ESI\n\tpop EDX\n\tpop ECX\n\tpop EBX\n");

		if (name.equals("_main")) {
			builder.append("\tleave\n");
		} else {
			builder.append("\tpop ebp\n");
		}
		builder.append("\t.cfi_restore 5\n\t.cfi_def_cfa 4, 4\n\tret\n\t.cfi_endproc\n");
		return builder.toString();
	}
}
