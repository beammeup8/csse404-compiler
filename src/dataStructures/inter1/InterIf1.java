package dataStructures.inter1;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Compare;
import dataStructures.simpleInter.Statements;

public class InterIf1 implements IInterStatement1 {

	private IInterExpression1 expression;
	private IInterStatement1 thenStatement;
	private IInterStatement1 elseStatement;

	public InterIf1(IInterExpression1 expression, IInterStatement1 thenStatement, IInterStatement1 elseStatement) {
		this.expression = expression;
		this.thenStatement = thenStatement;
		this.elseStatement = elseStatement;
	}

	@Override
	public String toString() {
		return "If: {expression: " + expression.toString() + ", then: " + thenStatement.toString() + ", else: "
				+ elseStatement.toString() + "}";
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		expression.populateSymbolTable(parent);
		if (!expression.getType().equals("boolean")) {
			System.err.println("Conditionals must be boolean expressions");
			System.exit(0);
		}
		thenStatement.populateSymbolTable(new SymbolTable(parent));
		elseStatement.populateSymbolTable(new SymbolTable(parent));
	}

	@Override
	public Statements toStatement() {
		CodeBlock block = new CodeBlock();
		block.statements.addAll(expression.toStatementList());
		String expressionId = expression.getId();
		Compare cond = new Compare();
		return block;
	}

}
