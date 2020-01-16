package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class MethodCallNode extends Node {
	private enum MethodCallType {
		EPSILON, METHOD_CALL, ARRAY_ACCESS, LENGTH
	}
	private MethodCallType type;
	private TerminalNode id;
	private List<ExprNode> params;
	private ExprNode expression;
	private MethodCallNode nextCall;

	public MethodCallNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		String symbol = tags.get(head.integer).symbol;
		try {
			if (symbol.equals("[")) {
				validateTerminal(tags, head, "[");
				expression = new ExprNode(tags, head);
				validateTerminal(tags, head, "]");
				type = MethodCallType.ARRAY_ACCESS;
			} else {
				validateTerminal(tags, head, ".");
				if (tags.get(head.integer).symbol.equals("length") && !tags.get(head.integer + 1).symbol.equals("(")) {
					validateTerminal(tags, head,  "length");
					type = MethodCallType.LENGTH;
				} else {
					id = addID(tags, head);
					validateTerminal(tags, head, "(");
					params = new FirstParamNode(tags, head).getParams();
					validateTerminal(tags, head, ")");
					type = MethodCallType.METHOD_CALL;
				}
			}
			nextCall = new MethodCallNode(tags, head);
		} catch (CustomException e) {
			head.integer = initialHead;
			type = MethodCallType.EPSILON;
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
		switch(type){
		case ARRAY_ACCESS:
			return "[" + expression.toString() + "] ";
		case EPSILON:
			return "";
		case LENGTH:
			return ".length " + nextCall.toString();
		case METHOD_CALL:
			return "." + id.toString() + "(" + params.toString() + ")" + nextCall.toString();
		}
		return null;
	}

}
