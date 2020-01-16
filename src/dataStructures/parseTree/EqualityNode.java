package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;
import dataStructures.inter1.InterExpression1;

public class EqualityNode extends Node {
	private ComparisonNode comparison;
	private EqualityExprNode equalityExpr;

	public EqualityNode(List<Tag> tags, IntWrap head) throws CustomException {
		comparison = new ComparisonNode(tags, head);
		equalityExpr = new EqualityExprNode(tags, head);
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "( Equality: " + comparison.toString() + " " + equalityExpr.toString();
	}

	public IInterExpression1 convertToInter1() {
		if (equalityExpr.isEpsilon) {
			return comparison.convertToInter1();
		}
		return new InterExpression1(comparison.convertToInter1(), equalityExpr.op.symbol, equalityExpr.convertToInter1());
	}

}
