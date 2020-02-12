package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.GenericOpType;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;
import exceptions.CustomException;

public class ComparisonExprNode extends Node {
	boolean isEpsilon;
	TerminalNode op;
	private ComparisonNode comparison;
	

	public ComparisonExprNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			op = addOp(tags, head, GenericOpType.COMPARISON);
			comparison = new ComparisonNode(tags, head);
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
		return op.toString() + " " + comparison.toString();
	}

	public IInterExpression1 convertToInter1() {
		if (isEpsilon) {
			return null;
		}
		return comparison.convertToInter1();
	}

}
