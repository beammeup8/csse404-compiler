package dataStructures.inter1;

import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Label;
import dataStructures.simpleInter.Statement;

public class InterMethod1 implements IInter1 {
	private String typeID, id, localId;
	private List<InterDeclaration1> parameters;
	private List<IInterStatement1> statements;
	private IInterExpression1 returnExpr;

	public InterMethod1(String type, String id, List<InterDeclaration1> parameters, List<IInterStatement1> statements, IInterExpression1 returnExpr) {
		this.id = id;
		this.typeID = type;
		this.parameters = parameters;
		this.statements = statements;
		this.returnExpr = returnExpr;
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
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) {
		parent.addEntry(id, getType());
		localId = parent.getLocalName(id);
		SymbolTable table = new SymbolTable(parent);
		parameters.forEach(x -> x.populateSymbolTable(table, classMap));
		statements.forEach(x -> x.populateSymbolTable(table, classMap));
	}

	public String getName() {
		return id;
	}

	public String getType() {
		return "method:" + typeID;
	}

	public Statement toCodeBlock() {
		CodeBlock block = new CodeBlock();
		Label label = new Label(localId);
		block.add(label);
		for (int i = 0; i < parameters.size() ; i++) {
			block.add(parameters.get(i).toFunctionParameter());
		}
		for (int i = 0; i < statements.size() ; i++) {
			block.add(statements.get(i).toStatement());
		}
		return block;
	}

}
