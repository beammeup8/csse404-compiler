package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;

import dataStructures.simpleInter.IntegerOperation;
import dataStructures.simpleInter.OpType;

public abstract class InterArray1 implements IInterStatement1 {
	
	public List<IntegerOperation> offsetCalc(String indexLabel) {
		List<IntegerOperation> block = new ArrayList<>();
		String offsetId = IdGenerator.getUniqueId();
		block.add(new IntegerOperation(indexLabel, 1, offsetId, OpType.ADD));
		block.add(new IntegerOperation(offsetId, 4, offsetId, OpType.MULT));
		return block;
	}

}
