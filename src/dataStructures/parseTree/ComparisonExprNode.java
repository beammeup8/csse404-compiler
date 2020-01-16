package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.OpType;
import dataStructures.Tag;

public class ComparisonExprNode extends Node {
	private boolean isEpsilon;
	private  TerminalNode op;
	private ComparisonNode comparison;
	

	public ComparisonExprNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			op = addOp(tags, head, OpType.COMPARISON);
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

}
