package dataStructures.parseTree;

import java.util.List;

import dataStructures.GenericOpType;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;
import exceptions.CustomException;

public class AddSubExprNode extends Node {
	boolean isEpsilon;
	TerminalNode op;
	private AddSubNode addSub;

	public AddSubExprNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			op = addOp(tags, head, GenericOpType.ADDITIVE);
			addSub = new AddSubNode(tags, head);
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
		return "( " +  op.toString() + " " + addSub.toString() + " )";
	}

	public IInterExpression1 convertToInter1() {
		if (isEpsilon) {
			return null;
		}
		return addSub.convertToInter1();
	}

}
