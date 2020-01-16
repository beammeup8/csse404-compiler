package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.OpType;
import dataStructures.Tag;

public class MultDivExprNode extends Node {
	private boolean isEpsilon;
	private TerminalNode symbol;
	private MultDivNode multDiv;

	public MultDivExprNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			symbol = addOp(tags, head, OpType.MULTIPLICATIVE);
			multDiv = new MultDivNode(tags, head);
			isEpsilon = false;
		} catch (CustomException e) {
			head.integer = initialHead;
			isEpsilon = true;
		}
	}
	
	@Override
	public String toString() {
		if(isEpsilon){
			return "";
		}
		return "( " +  symbol.toString() + " " + multDiv.toString() + " )";
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

}
