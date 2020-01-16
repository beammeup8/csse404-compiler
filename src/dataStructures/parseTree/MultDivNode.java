package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class MultDivNode extends Node {
	private NegExprNode negExpr;
	private MultDivExprNode multDivExpr;

	public MultDivNode(List<Tag> tags, IntWrap head) throws CustomException {
		negExpr = new NegExprNode(tags, head);
		multDivExpr = new MultDivExprNode(tags, head);
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
		return "( Multiplicative Expression: " + negExpr.toString() + " " + multDivExpr.toString();
	}

}
