package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.Compare;
import dataStructures.simpleInter.Jump;
import dataStructures.simpleInter.JumpType;
import dataStructures.simpleInter.Label;
import dataStructures.simpleInter.Statement;
import exceptions.CustomException;
import exceptions.IncompatibleTypeException;

public class InterWhile implements IInterStatement1 {
	private IInterExpression1 conditional;
	private IInterStatement1 body;

	public InterWhile(IInterExpression1 conditional, IInterStatement1 body) {
		this.conditional = conditional;
		this.body = body;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) throws CustomException {
		conditional.populateSymbolTable(parent, classMap);
		body.populateSymbolTable(new SymbolTable(parent), classMap);
		if(!conditional.getType().equals("boolean")){
			throw new IncompatibleTypeException("While loops can only have boolean conditionals");
		}
	}

	@Override
	public List<Statement> toStatementList() {
		List<Statement> block = new ArrayList<Statement>();
		
		String loopLabel = IdGenerator.getUniqueLabel();
		
		block.add(new Label(loopLabel));
		
		block.addAll(conditional.toStatementList());
		
		block.add(new Compare(conditional.getId(), "0"));
		
		String failLabel = IdGenerator.getUniqueLabel();
		block.add(new Jump(failLabel, JumpType.EQUAL));
		
		block.addAll(body.toStatementList());

		block.add(new Jump(loopLabel, JumpType.NONE));
		
		block.add(new Label(failLabel));
		
		return block;
	}

}
