package dataStructures.inter1;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.Statement;

public class InterArrayAssign1 implements IInterStatement1 {
	private String arrayID;
	IInterExpression1 arrayIndex, value;

	public InterArrayAssign1(String arrayID, IInterExpression1 arrayIndex, IInterExpression1 value) {
		this.arrayID = arrayID;
		this.arrayIndex = arrayIndex;
		this.value = value;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		arrayIndex.populateSymbolTable(parent);
		value.populateSymbolTable(parent);
		parent.checkType(arrayID, "int[]");		
		arrayID = parent.getLocalName(arrayID);
	}

	@Override
	public Statement toStatement() {
		// TODO Auto-generated method stub
		return new CodeBlock();
	}

}
