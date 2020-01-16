package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;

public class AddSubNode extends Node {
	private MultDivNode multDiv;
	private AddSubExprNode addSubExpr;

	public AddSubNode(List<Tag> tags, IntWrap head) throws CustomException {
		multDiv = new MultDivNode(tags, head);
		addSubExpr = new AddSubExprNode(tags, head);
	}
	
	@Override
	public String toString() {
		return "( AddSub: " + multDiv.toString() + " " + addSubExpr.toString() + " )";
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

}
