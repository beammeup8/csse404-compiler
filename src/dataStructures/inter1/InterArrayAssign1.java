package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.MemoryAccess;
import dataStructures.simpleInter.Operation;
import dataStructures.simpleInter.Statement;

public class InterArrayAssign1 extends InterArray1 implements IInterStatement1 {
	private String arrayID;
	private IInterExpression1 arrayIndex, value;
	private int offset;

	public InterArrayAssign1(String arrayID, IInterExpression1 arrayIndex, IInterExpression1 value) {
		this.arrayID = arrayID;
		this.arrayIndex = arrayIndex;
		this.value = value;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) {
		arrayIndex.populateSymbolTable(parent, classMap);
		value.populateSymbolTable(parent, classMap);
		parent.checkType(arrayID, "int[]");
		offset = parent.getOffset(arrayID);
		arrayID = parent.getLocalName(arrayID);
	}

	@Override
	public List<Statement> toStatementList() {
		List<Statement> block = new ArrayList<Statement>();
		block.addAll(value.toStatementList());
		block.addAll(arrayIndex.toStatementList());
		List<Operation> offsetCalc = offsetCalc(arrayIndex.getId());
		block.addAll(offsetCalc);
		String offsetId = offsetCalc.get(offsetCalc.size() - 1).localVariableAssigned();
		if (offset > -1) {
			block.add(new MemoryAccess(arrayID, "EBP", "36", true));
			block.add(new MemoryAccess(arrayID, arrayID, "" + offset, true));
		}
		block.add(new MemoryAccess(value.getId(), arrayID, offsetId, false));
		return block;
	}

}
