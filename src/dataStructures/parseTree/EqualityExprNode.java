package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.GenericOpType;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;
import exceptions.CustomException;

public class EqualityExprNode extends Node {
	boolean isEpsilon;
	TerminalNode op;
	private EqualityNode equality;
	
	public EqualityExprNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			op = addOp(tags, head, GenericOpType.EQUALITY);
			equality = new EqualityNode(tags, head);
			isEpsilon = false;
		} catch (CustomException e) {
			head.integer = initialHead;
			isEpsilon = true;
		}
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		if(isEpsilon){
			return "";
		}
		return op.toString() + " " + equality.toString();
	}

	public IInterExpression1 convertToInter1() {
		if (isEpsilon) {
			System.err.println("Can not convert epsilon to Internal Expression 1: Equality Expression");
			return null;
		}
		return equality.convertToInter1();
	}

}
