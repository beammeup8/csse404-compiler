package dataStructures.inter1;

import java.util.List;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Label;
import dataStructures.simpleInter.Statements;

public class InterMethod1 implements IInter1 {
	private String typeID, id, localId;
	private List<InterDeclaration1> parameters;
	private List<IInterStatement1> statements;

	public InterMethod1(String type, String id, List<InterDeclaration1> parameters, List<IInterStatement1> statements) {
		this.id = id;
		this.typeID = type;
		this.parameters = parameters;
		this.statements = statements;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Method: {");
		builder.append("typeID: " + typeID + ", ");
		builder.append("id: " + id + ", ");
		builder.append("parameters: " + parameters.toString() + ", ");
		builder.append("statements: " + statements.toString());
		builder.append("}");
		return builder.toString();
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		parent.addEntry(id, getType());
		localId = parent.getLocalName(id);
		SymbolTable table = new SymbolTable(parent);
		parameters.forEach(x -> x.populateSymbolTable(table));
		statements.forEach(x -> x.populateSymbolTable(table));
	}

	public String getName() {
		return id;
	}

	public String getType() {
		return "method:" + typeID;
	}

	public Statements toCodeBlock() {
		CodeBlock block = new CodeBlock();
		Label label = new Label();
		label.label = localId;
		block.statements.add(label);
		for (int i = 0; i < parameters.size() ; i++) {
			block.statements.add(parameters.get(i).toFunctionParameter());
		}
		for (int i = 0; i < statements.size() ; i++) {
			block.statements.add(statements.get(i).toStatement());
		}
		return block;
	}

}
