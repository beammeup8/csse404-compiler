package dataStructures.parseTree;

import java.util.ArrayList;
import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;
import dataStructures.inter1.InterArrayAccess1;
import dataStructures.inter1.InterLength1;
import dataStructures.inter1.InterMethodCall1;

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
	public void optimize() {
		// TODO Auto-generated method stub
		
	}
	
	public List<IInterExpression1> getParameters(){
		List<IInterExpression1> converted = new ArrayList<IInterExpression1>();
		for (int i = 0; i < params.size(); i++){
			converted.add(params.get(i).convertToInter1());
		}
		return converted;
	}
	
	public IInterExpression1 convertToInter1(IInterExpression1 calledOn){
		IInterExpression1 currentCall = null;
		switch (type) {
		case EPSILON:
			return calledOn;
		case ARRAY_ACCESS:
			currentCall =  new InterArrayAccess1(calledOn, expression.convertToInter1());
			break;
		case LENGTH:
			currentCall = new InterLength1(calledOn);
			break;
		case METHOD_CALL:
			currentCall = new InterMethodCall1(calledOn, id.symbol, getParameters());
			break;
		}
		return nextCall.convertToInter1(currentCall);
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
