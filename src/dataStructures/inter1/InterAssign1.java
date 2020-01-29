package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.Assignment;
import dataStructures.simpleInter.Statement;

public class InterAssign1 implements IInterStatement1 {

	private String id, localId;
	private IInterExpression1 value;

	public InterAssign1(String id, IInterExpression1 value) {
		this.id = id;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Assignment: {id: " + id + ", value: " + value.toString() + "}";
	}

	@Override
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) {
		value.populateSymbolTable(parent, classMap);
		parent.checkType(id, value.getType());
		localId = parent.getLocalName(id);
	}

	@Override
	public List<Statement> toStatementList() {
		List<Statement> block = new ArrayList<>();
		block.addAll(value.toStatementList());
		block.add(new Assignment(value.getId(), localId));
		return block;
	}

}
