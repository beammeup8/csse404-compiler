package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;

import dataStructures.simpleInter.IntegerOperation;
import dataStructures.simpleInter.OpType;

public abstract class InterArray1 implements IInterStatement1 {
	
	public List<IntegerOperation> offsetCalc(String indexLabel) {
		List<IntegerOperation> block = new ArrayList<>();
		String addId = IdGenerator.getUniqueId();
		IntegerOperation add1 = new IntegerOperation(indexLabel, 1, addId, OpType.ADD);
		block.add(add1);
		String multId = IdGenerator.getUniqueId();
		IntegerOperation mult4 = new IntegerOperation(addId, 4, multId, OpType.MULT);
		block.add(mult4);
		return block;
	}

}
