package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.List;

public class Function {
	private String name;
	private Label nameLabel;
	private List<Statement> statements;
	private List<String> localVariables;
	private List<String> parameters;

	public Function(String label, List<String> parameters, List<Statement> statements) {
		this.name = label;
		this.nameLabel = new Label(name);
		this.statements = statements;
		this.parameters = parameters;
		addParametersToStatements();
		extractLocalVariables();
		addPrologueToStatements();
		addEpilogueToStatements();
		convertToMemAccesses();
	}

	private void convertToMemAccesses() {
		for (int i = 0; i < statements.size(); i++) {
			Statement s = statements.get(i);
			List<Statement> toAdd = s.convertToMemAccesses(localVariables);
			statements.remove(i);
			statements.addAll(i, toAdd);
			i += toAdd.size() - 1;
		}
	}

	private void addPrologueToStatements() {
		statements.add(0, new StackOperation(StackOpType.PUSHAD));
		statements.add(1, new Assignment("ESP", "EBP"));
		statements.add(2, new Operation("ESP", "" + localVariables.size() * 4, "ESP", OpType.SUB));
	}

	private void addParametersToStatements() {
		int offset = 12;
		for (int i = parameters.size() - 1; i >= 0; i--) {
			statements.add(0, new MemoryAccess(parameters.get(i), "EBP", "" + offset, true));
			offset += 4;
		}
	}

	private void addEpilogueToStatements() {
		statements.add(new Assignment("DWORD PTR [ESP-32]", "EAX"));
		statements.add(new Operation("ESP", "" + localVariables.size() * 4, "ESP", OpType.ADD));
		statements.add(new StackOperation(StackOpType.POPAD));
	}

	private void extractLocalVariables() {
		localVariables = new ArrayList<>();
		for (Statement s : statements) {
			String a = s.localVariableAssigned();
			if (a != null && a.startsWith("_temp") && !localVariables.contains(a)) {
				localVariables.add(a);
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nameLabel.toString() + "\n");
		builder.append("\t.cfi_startproc\n\tpush ebp\n\t.cfi_def_cfa_offset 8\n\t.cfi_offset 5, -8\n\tmov ebp, esp\n\t.cfi_def_cfa_register 5\n");
		if (name.equals("_main")) {
			builder.append("\tand esp, -16\n\tsub esp, 16\n\tcall ___main\n");
		}
		for (int i = 0; i < statements.size(); i++) {
			builder.append(statements.get(i).toString() + "\n");
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
