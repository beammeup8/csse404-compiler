package dataStructures.inter1;

import java.util.List;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.IntegerOperation;
import dataStructures.simpleInter.MemoryAccess;
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
	public void populateSymbolTable(SymbolTable parent) {
		arrayExpression.populateSymbolTable(parent);
		arrayExpression.populateSymbolTable(parent);
	}

	@Override
	public String getType() {
		return "int";
	}

	@Override
	public Statement toStatement() {
		CodeBlock block = new CodeBlock();
		block.addAll(arrayExpression.toStatementList());
		block.addAll(arrayIndex.toStatementList());
		List<IntegerOperation> offsetCalc = offsetCalc(arrayIndex.getId());
		block.addAll(offsetCalc);
		String offsetId = offsetCalc.get(offsetCalc.size() - 1).labelOut;
		block.add(new MemoryAccess(id, arrayExpression.getId(), offsetId, true));
		return block;
	}

	@Override
	public List<Statement> toStatementList() {
		return ((CodeBlock) toStatement()).statements;
	}

}
