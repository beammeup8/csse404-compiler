package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;
import dataStructures.inter1.InterExpression1;
import exceptions.CustomException;

public class MultDivNode extends Node {
	private NegExprNode negExpr;
	private MultDivExprNode multDivExpr;

	public MultDivNode(List<Tag> tags, IntWrap head) throws CustomException {
		negExpr = new NegExprNode(tags, head);
		multDivExpr = new MultDivExprNode(tags, head);
	}

	@Override
	public String toString() {
		return "( Multiplicative Expression: " + negExpr.toString() + " " + multDivExpr.toString();
	}

	public IInterExpression1 convertToInter1() {
		if (multDivExpr.isEpsilon) {
			return negExpr.convertToInter1();
		}
		return new InterExpression1(negExpr.convertToInter1(), multDivExpr.op.symbol, multDivExpr.convertToInter1());
	}

}
