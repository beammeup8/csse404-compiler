package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;
import dataStructures.inter1.InterExpression1;
import exceptions.CustomException;

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
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Expression: " + equality.toString() + " " + logicExpr.toString(); 
	}

	public IInterExpression1 convertToInter1() {
		if (logicExpr.isEpsilon) {
			return equality.convertToInter1();
		}
		return new InterExpression1(equality.convertToInter1(), logicExpr.op.symbol, logicExpr.convertToInter1());
	}

}
