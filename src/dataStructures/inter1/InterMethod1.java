package dataStructures.inter1;

import java.util.List;

public class InterMethod1 implements IInter1 {
	private String typeID;
	private String id;
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

}
