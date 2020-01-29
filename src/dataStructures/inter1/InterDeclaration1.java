package dataStructures.inter1;

import java.util.Map;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.FunctionParameter;
import dataStructures.simpleInter.Statement;

public class InterDeclaration1 implements IInterStatement1 {
	private String typeID, id, localID;

	public InterDeclaration1(String type, String id) {
		this.typeID = type;
		this.id = id;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Declaration: {");
		builder.append("typeID: " + typeID + ", ");
		builder.append("id: " + id + "}");
		return builder.toString();
	}

	@Override
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) {
		parent.addEntry(id, typeID);
		localID = parent.getLocalName(id);
	}

	public FunctionParameter toFunctionParameter() {
		FunctionParameter param = new FunctionParameter();
		param.name = localID;
		return param;
	}

	@Override
	public Statement toStatement() {
		// TODO Auto-generated method stub
		return new CodeBlock();
	}

	public String getType() {
		return typeID;
	}

}
