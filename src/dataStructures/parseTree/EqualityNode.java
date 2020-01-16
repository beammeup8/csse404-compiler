package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class EqualityNode extends Node {
	private ComparisonNode comparison;
	private EqualityExprNode equalityExpr;

	public EqualityNode(List<Tag> tags, IntWrap head) throws CustomException {
		comparison = new ComparisonNode(tags, head);
		equalityExpr = new EqualityExprNode(tags, head);
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
		return "( Equality: " + comparison.toString() + " " + equalityExpr.toString();
	}

}
