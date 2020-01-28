package dataStructures.inter1;

import java.util.List;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.MemoryAccess;
import dataStructures.simpleInter.Statement;

public class InterLength1 extends InterArray1 implements IInterExpression1 {

	private String id;
	private IInterExpression1 arrayExpression;

	public InterLength1(IInterExpression1 arrayExpression) {
		id = IdGenerator.getUniqueId();
		this.arrayExpression = arrayExpression;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		arrayExpression.populateSymbolTable(parent);
		if (!arrayExpression.getType().equals("int[]")) {
			System.err.println("Can not take the length of a non-array object");
			System.exit(0);
		}
	}

	@Override
	public String getType() {
		return "int";
	}

	@Override
	public Statement toStatement() {
		CodeBlock block = new CodeBlock();
		block.addAll(arrayExpression.toStatementList());
		block.add(new MemoryAccess(id, arrayExpression.getId(), "{0}", true));
		return block;
	}

	@Override
	public List<Statement> toStatementList() {
		return ((CodeBlock) toStatement()).statements;
	}

}
