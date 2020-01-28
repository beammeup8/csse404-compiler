package dataStructures.inter1;

import java.util.List;

import dataStructures.simpleInter.CodeBlock;
import dataStructures.simpleInter.IntegerOperation;
import dataStructures.simpleInter.MemoryAccess;
import dataStructures.simpleInter.Statement;

public class InterArrayAssign1 extends InterArray1 implements IInterStatement1 {
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
		CodeBlock block = new CodeBlock();
		block.addAll(value.toStatementList());
		block.addAll(arrayIndex.toStatementList());
		List<IntegerOperation> offsetCalc = offsetCalc(arrayIndex.getId());
		block.addAll(offsetCalc);
		String offsetId = offsetCalc.get(offsetCalc.size() - 1).labelOut;
		block.add(new MemoryAccess(value.getId(), arrayID, offsetId, false));
		return block;
	}

}
