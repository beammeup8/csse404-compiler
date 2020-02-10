package dataStructures.x86;

import java.util.List;

public class FunctionX86 {
	public List<Command> commands;
	public boolean isMain;
	public String name;
	
	public FunctionX86(List<Command> commands, boolean isMain, String name) {
		this.isMain = isMain;
		this.commands = commands;
		this.name = name;
	}
		
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name + ":\n");
		builder.append("\t.cfi_startproc\n\tpush ebp\n\t.cfi_def_cfa_offset 8\n\t.cfi_offset 5, -8\n\tmov ebp, esp\n\t.cfi_def_cfa_register 5\n");
		if (isMain) {
			builder.append("\tand esp, -16\n\tsub esp, 16\n\tcall ___main\n");
		}
		for (int i = 0; i < commands.size(); i++) {
			builder.append(commands.get(i).toString() + "\n");
		}
		if (name.equals("_main")) {
			builder.append("\tleave\n");
		} else {
			builder.append("\tpop ebp\n");
		}
		builder.append("\t.cfi_restore 5\n\t.cfi_def_cfa 4, 4\n\tret\n\t.cfi_endproc\n");
		return builder.toString();
	}
}
