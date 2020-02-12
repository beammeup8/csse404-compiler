package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.Assignment;
import dataStructures.simpleInter.Function;
import dataStructures.simpleInter.Statement;
import exceptions.CustomException;

public class InterMethod1 implements IInter1 {
	private String typeID, id;
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
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) throws CustomException {
		SymbolTable table = new SymbolTable(parent);
		for (InterDeclaration1 parameter : parameters) {
			parameter.populateSymbolTable(table, classMap);
		}
		for (IInterStatement1 statement : statements) {
			statement.populateSymbolTable(table, classMap);
		}
		if (returnExpr != null) {
			returnExpr.populateSymbolTable(table, classMap);
		}
	}

	public String getName() {
		return id;
	}

	public String getType() {
		return "method:" + typeID;
	}

	public Function toFunction(String functionLabel) {
		List<String> paramNames = new ArrayList<>();
		for (int i = 0; i < parameters.size() ; i++) {
			paramNames.add(parameters.get(i).getName());
		}
		
		List<Statement> block = new ArrayList<Statement>();
		for (int i = 0; i < statements.size() ; i++) {
			block.addAll(statements.get(i).toStatementList());
		}
		
		if(returnExpr != null){
			block.addAll(returnExpr.toStatementList());
			block.add(new Assignment(returnExpr.getId(), "EAX"));
		}
		return new Function(functionLabel, paramNames, block);
	}

}
