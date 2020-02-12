package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.IInterExpression1;
import dataStructures.inter1.InterExpression1;
import exceptions.CustomException;

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

	public IInterExpression1 convertToInter1() {
		if (addSubExpr.isEpsilon) {
			return multDiv.convertToInter1();
		}
		return new InterExpression1(multDiv.convertToInter1(), addSubExpr.op.symbol, addSubExpr.convertToInter1());
	}

}
