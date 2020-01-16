package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

/**
 * Expr ->	Comp LogicExpr
 * @author mastermk beemanla
 *
 */
public class ExprNode extends Node {
	private EqualityNode equality;
	private LogicExprNode logicExpr; 

	public ExprNode(List<Tag> tags, IntWrap head) throws CustomException {
		equality = new EqualityNode(tags, head);
		logicExpr = new LogicExprNode(tags, head);
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
		return "Expression: " + equality.toString() + " " + logicExpr.toString(); 
	}

}
