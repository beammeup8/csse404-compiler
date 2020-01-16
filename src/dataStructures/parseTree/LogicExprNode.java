package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.OpType;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;

public class LogicExprNode extends Node {
	boolean isEpsilon;
	TerminalNode op;
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

	public IInterExpression1 convertToInter1() {
		if (isEpsilon) {
			return null;
		}
		return expression.convertToInter1();
	}

}
