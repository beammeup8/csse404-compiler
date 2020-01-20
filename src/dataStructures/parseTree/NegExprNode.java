package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.OpType;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;
import dataStructures.inter1.InterExpression1;

public class NegExprNode extends Node {
	private TerminalNode op;
	private MethodExpNode method;
	

	public NegExprNode(List<Tag> tags, IntWrap head) throws CustomException {
		boolean isEven = true;
		try {
			while(true){
				op = addOp(tags, head, OpType.NEGATION);
				isEven = !isEven;
			}
		} catch (CustomException e) {
			if(isEven){
				op = null;
			}
			method = new MethodExpNode(tags, head);
		}
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		if(op == null){
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
