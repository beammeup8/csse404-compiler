package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.OpType;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class NegExprNode extends Node {
	private TerminalNode symbol;
	private MethodExpNode method;
	

	public NegExprNode(List<Tag> tags, IntWrap head) throws CustomException {
		boolean isEven = true;
		try {
			while(true){
				symbol = addOp(tags, head, OpType.NEGATION);
				isEven = !isEven;
			}
		} catch (CustomException e) {
			if(isEven){
				symbol = null;
			}
			method = new MethodExpNode(tags, head);
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
		if(symbol == null){
			return method.toString();
		}
		return "( " + symbol.toString() + " " + method.toString() + " )";
	}

}
