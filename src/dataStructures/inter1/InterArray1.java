package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;

import dataStructures.simpleInter.OpType;
import dataStructures.simpleInter.Operation;

public abstract class InterArray1 implements IInterStatement1 {
	
	public List<Operation> offsetCalc(String indexLabel) {
		List<Operation> block = new ArrayList<>();
		String offsetId = IdGenerator.getUniqueId();
		block.add(new Operation(indexLabel, "1", offsetId, OpType.ADD));
		block.add(new Operation(offsetId, "4", offsetId, OpType.MULT));
		return block;
	}

}
