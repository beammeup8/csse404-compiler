package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.MemoryAccess;
import dataStructures.simpleInter.Statement;
import exceptions.CustomException;
import exceptions.InvalidCallException;

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
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) throws CustomException {
		arrayExpression.populateSymbolTable(parent, classMap);
		if (!arrayExpression.getType().equals("int[]")) {
			throw new InvalidCallException("Can not take the length of a non-array object");
		}
	}

	@Override
	public String getType() {
		return "int";
	}

	@Override
	public List<Statement> toStatementList() {
		List<Statement> block = new ArrayList<Statement>();
		block.addAll(arrayExpression.toStatementList());
		block.add(new MemoryAccess(id, arrayExpression.getId(), "0", true));
		return block;
	}

}
