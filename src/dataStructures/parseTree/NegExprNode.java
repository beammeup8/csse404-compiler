package dataStructures.parseTree;

import java.util.List;

import dataStructures.GenericOpType;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;
import dataStructures.inter1.InterExpression1;
import exceptions.CustomException;

public class NegExprNode extends Node {
	private TerminalNode op;
	private MethodExpNode method;

	public NegExprNode(List<Tag> tags, IntWrap head) throws CustomException {
		boolean isEven = true;
		try {
			while (true) {
				op = addOp(tags, head, GenericOpType.NEGATION);
				isEven = !isEven;
			}
		} catch (CustomException e) {
			if (isEven) {
				op = null;
			}
			method = new MethodExpNode(tags, head);
		}
	}

	@Override
	public String toString() {
		if (op == null) {
			return method.toString();
		}
		return "( " + op.toString() + " " + method.toString() + " )";
	}

	public IInterExpression1 convertToInter1() {
		if (op == null) {
			return method.convertToInter1();
		}
		return new InterExpression1(op.symbol, method.convertToInter1());
	}

}
