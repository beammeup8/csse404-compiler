package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;
import dataStructures.inter1.InterExpression1;
import exceptions.CustomException;

public class ComparisonNode extends Node {
	private AddSubNode addSub;
	private ComparisonExprNode comparisonExpr;

	public ComparisonNode(List<Tag> tags, IntWrap head) throws CustomException {
		addSub = new AddSubNode(tags, head);
		comparisonExpr = new ComparisonExprNode(tags, head);
	}

	@Override
	public String toString() {
		return "( Comparision: " + addSub.toString() + " " + comparisonExpr.toString();
	}

	public IInterExpression1 convertToInter1() {
		if (comparisonExpr.isEpsilon) {
			return addSub.convertToInter1();
		}
		return new InterExpression1(addSub.convertToInter1(), comparisonExpr.op.symbol,
				comparisonExpr.convertToInter1());
	}

}
