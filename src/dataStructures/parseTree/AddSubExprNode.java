package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.OpType;
import dataStructures.Tag;

public class AddSubExprNode extends Node {
	private boolean isEpsilon;
	private TerminalNode symbol;
	private AddSubNode addSub;

	public AddSubExprNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			symbol = addOp(tags, head, OpType.ADDITIVE);
			addSub = new AddSubNode(tags, head);
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
		return "( " +  symbol.toString() + " " + addSub.toString() + " )";
	}

}
