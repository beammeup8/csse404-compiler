package dataStructures.inter1;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Compare;
import dataStructures.simpleInter.Jump;
import dataStructures.simpleInter.JumpType;
import dataStructures.simpleInter.Label;
import dataStructures.simpleInter.Statements;

public class InterWhile implements IInterStatement1 {
	private IInterExpression1 conditional;
	private IInterStatement1 body;

	public InterWhile(IInterExpression1 conditional, IInterStatement1 body) {
		this.conditional = conditional;
		this.body = body;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		conditional.populateSymbolTable(parent);
		body.populateSymbolTable(new SymbolTable(parent));
		if(!conditional.getType().equals("boolean")){
			System.err.println("While loops can only have boolean conditionals");
			System.exit(0);
		}
	}

	@Override
	public Statements toStatement() {
		CodeBlock block = new CodeBlock();
		
		String loopLabel = IdGenerator.getUniqueLabel();
		
		block.statements.add(new Label(loopLabel));
		
		block.statements.addAll(conditional.toStatementList());
		Compare cond = new Compare();
		cond.labelA = conditional.getId();
		cond.labelB = "_ZERO";
		
		Jump failJump = new Jump();
		failJump.jumpType = JumpType.EQUAL;
		String failLabel = IdGenerator.getUniqueLabel();
		failJump.label = failLabel;
		block.statements.add(failJump);
		
		block.statements.add(body.toStatement());
		Jump loopJump = new Jump();
		loopJump.jumpType = JumpType.NONE;
		loopJump.label = loopLabel;
		block.statements.add(loopJump);
		
		block.statements.add(new Label(failLabel));
		
		return block;
	}

}
