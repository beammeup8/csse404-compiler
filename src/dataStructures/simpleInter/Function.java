package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.List;

public class Function {
	public String name;
	public Label nameLabel;
	public List<Statement> statements;
	public List<String> localVariables;
	public List<String> parameters;

	public Function(String label, List<String> parameters, List<Statement> statements) {
		this.name = label;
		this.nameLabel = new Label(name);
		this.statements = statements;
		this.parameters = parameters;
		extractLocalVariables();
		addParametersToStatements();
		addPrologueToStatements();
		convertToMemAccesses();
		addEpilogueToStatements();
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
		statements.add(2, new Operation("ESP", "" + localVariables.size()*4, "ESP", OpType.SUB));
	}

	private void addParametersToStatements() {
		int offset = 12;
		for (int i = parameters.size() - 1; i >= 0; i--) {
			statements.add(0, new MemoryAccess(parameters.get(i), "EBP", "{" + offset + "}", true));
			offset += 4;
		}
	}

	private void addEpilogueToStatements() {
		statements.add(new MemoryAccess("EAX", "ESP", "{-32}", false));
		statements.add(new StackOperation(StackOpType.POPAD));
		statements.add(new ReturnStatement(parameters.size()));
	}

	private void extractLocalVariables() {
		localVariables = new ArrayList<>();
		for (Statement s : statements) {
			if (s.getClass().equals(Assignment.class)) {
				Assignment a = (Assignment) s;
				if (a.labelOut.startsWith("_temp") && !localVariables.contains(a.labelOut)) {
					localVariables.add(a.labelOut);
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nameLabel.toString() + "\n");
		for (int i = 0; i < statements.size(); i++) {
			builder.append(statements.get(i).toString() + "\n");
		}
		return builder.toString();
	}
}
