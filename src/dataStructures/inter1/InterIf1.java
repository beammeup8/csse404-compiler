package dataStructures.inter1;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Compare;
import dataStructures.simpleInter.Jump;
import dataStructures.simpleInter.JumpType;
import dataStructures.simpleInter.Label;
import dataStructures.simpleInter.Statement;

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
	public Statement toStatement() {
		CodeBlock block = new CodeBlock();
		block.addAll(expression.toStatementList());
		Compare cond = new Compare();
		cond.labelA = expression.getId();
		cond.labelB = "{0}";
		
		String elseLabel = IdGenerator.getUniqueLabel();
		block.add(new Jump(elseLabel, JumpType.EQUAL));
		
		block.add(thenStatement.toStatement());
		
		String finishLabel = IdGenerator.getUniqueLabel();
		block.add(new Jump(finishLabel, JumpType.NONE));
		
		block.add(new Label(elseLabel));
		block.add(elseStatement.toStatement());
		block.add(new Label(finishLabel));
		return block;
	}

}
