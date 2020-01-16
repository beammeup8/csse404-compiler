package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class ComparisonNode extends Node {
	private AddSubNode addSub;
	private ComparisonExprNode comparisonExpr;
	
	public ComparisonNode(List<Tag> tags, IntWrap head) throws CustomException {
		addSub = new AddSubNode(tags, head);
		comparisonExpr = new ComparisonExprNode(tags, head);
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
		return "( Comparision: " + addSub.toString() + " " + comparisonExpr.toString();
	}

}
