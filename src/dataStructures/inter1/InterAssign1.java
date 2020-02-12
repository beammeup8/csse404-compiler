package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.Assignment;
import dataStructures.simpleInter.MemoryAccess;
import dataStructures.simpleInter.Statement;
import exceptions.CustomException;

public class InterAssign1 implements IInterStatement1 {

	private String id, localId;
	private IInterExpression1 value;
	private int offset;

	public InterAssign1(String id, IInterExpression1 value) {
		this.id = id;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Assignment: {id: " + id + ", value: " + value.toString() + "}";
	}

	@Override
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) throws CustomException {
		value.populateSymbolTable(parent, classMap);
		parent.checkType(id, value.getType());
		localId = parent.getLocalName(id);
		offset = parent.getOffset(id);
	}

	@Override
	public List<Statement> toStatementList() {
		List<Statement> block = new ArrayList<>();
		block.addAll(value.toStatementList());
		if (offset > -1) {
			block.add(new MemoryAccess(localId, "EBP", "36", true));
			block.add(new MemoryAccess(value.getId(), localId, "" + offset, false));
		} else {
			block.add(new Assignment(value.getId(), localId));
		}
		return block;
	}

}
