package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class MethodExpNode extends Node {
	private TermExprNode terminalExpression;
	private MethodCallNode methodCall;
	
	public MethodExpNode(List<Tag> tags, IntWrap head) throws CustomException {
		terminalExpression = new TermExprNode(tags, head);
		methodCall = new MethodCallNode(tags, head);
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
		return "( Method Expression: " + terminalExpression.toString() + " " + methodCall.toString();
	}

}
