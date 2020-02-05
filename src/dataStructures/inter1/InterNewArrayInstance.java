package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.Allocation;
import dataStructures.simpleInter.MemoryAccess;
import dataStructures.simpleInter.Operation;
import dataStructures.simpleInter.Statement;

public class InterNewArrayInstance extends InterArray1 implements IInterExpression1 {

	private String id;
	private IInterExpression1 length;
	
	public InterNewArrayInstance(IInterExpression1 length) {
		id = IdGenerator.getUniqueId();
		this.length = length;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) {
		length.populateSymbolTable(parent, classMap);
		if(!length.getType().equals("int")){
			System.err.println("Arrays must have a numeric length");
			System.exit(0);
		}
		
	}

	@Override
	public String getType() {
		return "int[]";
	}
	
	@Override
	public List<Statement> toStatementList() {
		List<Statement> block = new ArrayList<Statement>();
		block.addAll(length.toStatementList());
		List<Operation> offsetCalc = offsetCalc(length.getId());
		block.addAll(offsetCalc);
		String multId = offsetCalc.get(offsetCalc.size() - 1).localVariableAssigned();
		block.add(new Allocation(id, multId));
		block.add(new MemoryAccess(length.getId(), id, "0", false));
		return block;
	}
}
