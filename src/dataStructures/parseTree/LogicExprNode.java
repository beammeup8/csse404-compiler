package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.OpType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class LogicExprNode extends Node {
	private boolean isEpsilon;
	private TerminalNode op;
	private ExprNode expression;

	public LogicExprNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			op = addOp(tags, head, OpType.LOGIC);
			expression = new ExprNode(tags, head);
			isEpsilon = false;
		} catch (CustomException e) {
			head.integer = initialHead;
			isEpsilon = true;
		}
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
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
		return op.toString() + " " + expression.toString();
	}

}
