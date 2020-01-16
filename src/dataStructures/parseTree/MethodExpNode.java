package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;

public class MethodExpNode extends Node {
	private TermExprNode terminalExpression;
	private MethodCallNode methodCall;
	
	public MethodExpNode(List<Tag> tags, IntWrap head) throws CustomException {
		terminalExpression = new TermExprNode(tags, head);
		methodCall = new MethodCallNode(tags, head);
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "( Method Expression: " + terminalExpression.toString() + " " + methodCall.toString();
	}

	public IInterExpression1 convertToInter1() {
		switch (methodCall.type) {
		case ARRAY_ACCESS:
			//return new InterArrayAccess1(terminalExpression.convertToInter1(), methodCall.convertToInter1());
		case EPSILON:
			// return terminalExpression.convertToInter1();
		case LENGTH:
			//return new InterLength1(terminalExpression.convertToInter1());
		case METHOD_CALL:
			//return new InterMethodCall1(terminalExpression.convertToInter1(), methodCall.convertToInter1());
		}
		return new DummyInterExpression1();
	}

}
