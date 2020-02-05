package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.MemoryAccess;
import dataStructures.simpleInter.Operation;
import dataStructures.simpleInter.Statement;

public class InterArrayAccess1 extends InterArray1 implements IInterExpression1 {
	
	IInterExpression1 arrayExpression, arrayIndex;
	private String id;

	public InterArrayAccess1(IInterExpression1 arrayExpression, IInterExpression1 arrayIndex) {
		this.arrayExpression = arrayExpression;
		this.arrayIndex = arrayIndex;
		this.id = IdGenerator.getUniqueId();
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) {
		arrayExpression.populateSymbolTable(parent, classMap);
		arrayIndex.populateSymbolTable(parent, classMap);
	}

	@Override
	public String getType() {
		return "int";
	}

	@Override
	public List<Statement> toStatementList() {
		List<Statement> block = new ArrayList<>();
		block.addAll(arrayExpression.toStatementList());
		block.addAll(arrayIndex.toStatementList());
		List<Operation> offsetCalc = offsetCalc(arrayIndex.getId());
		block.addAll(offsetCalc);
		String offsetId = offsetCalc.get(offsetCalc.size() - 1).localVariableAssigned();
		block.add(new MemoryAccess(id, arrayExpression.getId(), offsetId, true));
		return block;
	}

}
