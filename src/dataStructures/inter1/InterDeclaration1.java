package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
		populateSymbolTable(parent, classMap, -1);
	}
	
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap, int offset) {
		parent.addEntry(id, typeID, offset);
		localID = parent.getLocalName(id);
	}

	@Override
	public List<Statement> toStatementList() {
		List<Statement> block = new ArrayList<Statement>();
		// TODO Auto-generated method stub
		return block;
	}

	public String getType() {
		return typeID;
	}
	
	public String getName(){
		return localID;
	}

}
