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
		List<Statement> setup = new ArrayList<>();
		setup.add(new StackOperation("EBX", StackOpType.PUSH));
		setup.add(new StackOperation("ECX", StackOpType.PUSH));
		setup.add(new StackOperation("EDX", StackOpType.PUSH));
		setup.add(new StackOperation("ESI", StackOpType.PUSH));
		setup.add(new StackOperation("EDI", StackOpType.PUSH));
		setup.add(new StackOperation("ESP", StackOpType.PUSH));
		setup.add(new StackOperation("EBP", StackOpType.PUSH));
		setup.add(new Assignment("ESP", "EBP"));
		setup.add(new Operation("ESP", "" + localVariables.size() * 4, "ESP", OpType.SUB));
		statements.addAll(0, setup);
	}

	private void addParametersToStatements() {
		int offset = 40;
		for (int i = parameters.size() - 1; i >= 0; i--) {
			statements.add(0, new MemoryAccess(parameters.get(i), "EBP", "" + offset, true));
			offset += 4;
		}
	}

	private void addEpilogueToStatements() {
		statements.add(new Operation("ESP", "" + localVariables.size() * 4, "ESP", OpType.ADD));
		statements.add(new StackOperation("EBP", StackOpType.POP));
		statements.add(new StackOperation("ESP", StackOpType.POP));
		statements.add(new StackOperation("EDI", StackOpType.POP));
		statements.add(new StackOperation("ESI", StackOpType.POP));
		statements.add(new StackOperation("EDX", StackOpType.POP));
		statements.add(new StackOperation("ECX", StackOpType.POP));
		statements.add(new StackOperation("EBX", StackOpType.POP));
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
