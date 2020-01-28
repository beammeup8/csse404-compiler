package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;

import dataStructures.simpleInter.Allocation;
import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.IntegerOperation;
import dataStructures.simpleInter.MemoryAccess;
import dataStructures.simpleInter.OpType;
import dataStructures.simpleInter.Statement;

public class InterNewArrayInstance implements IInterExpression1 {

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
	public void populateSymbolTable(SymbolTable parent) {
		length.populateSymbolTable(parent);
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
	public Statement toStatement() {
		CodeBlock block = new CodeBlock();
		block.addAll(toStatementList());
		return block;
	}

	@Override
	public List<Statement> toStatementList() {
		List<Statement> block = new ArrayList<Statement>();
		block.addAll(length.toStatementList());
		String addId = IdGenerator.getUniqueId();
		Statement add1 = new IntegerOperation(length.getId(), 1, addId, OpType.ADD);
		block.add(add1);
		String multId = IdGenerator.getUniqueId();
		Statement mult4 = new IntegerOperation(addId, 4, multId, OpType.MULT);
		block.add(mult4);
		block.add(new Allocation(id, multId));
		block.add(new MemoryAccess(length.getId(), id, "_ZERO", false));
		return block;
	}
}
