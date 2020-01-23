package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.GenericOpType;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;

public class MultDivExprNode extends Node {
	boolean isEpsilon;
	TerminalNode op;
	private MultDivNode multDiv;

	public MultDivExprNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			op = addOp(tags, head, GenericOpType.MULTIPLICATIVE);
			multDiv = new MultDivNode(tags, head);
			isEpsilon = false;
		} catch (CustomException e) {
			head.integer = initialHead;
			isEpsilon = true;
		}
	}
	
	@Override
	public String toString() {
		if(isEpsilon){
			return "";
		}
		return "( " +  op.toString() + " " + multDiv.toString() + " )";
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

	public IInterExpression1 convertToInter1() {
		if (isEpsilon) {
			return null;
		}
		return multDiv.convertToInter1();
	}

}
