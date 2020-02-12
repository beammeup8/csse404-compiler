package dataStructures.parseTree;

import java.util.LinkedList;
import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import exceptions.CustomException;

public class FirstParamNode extends Node {
	private boolean isEpsilon;
	private ExprNode expression;
	private List<ExprNode> otherParams;

	public FirstParamNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			expression = new ExprNode(tags, head);
			otherParams = new ParamLstNode(tags, head).getParams();
			isEpsilon = false;
		} catch (CustomException e) {
			head.integer = initialHead;
			isEpsilon = true;
		}
	}
	
	public List<ExprNode> getParams(){
		if(isEpsilon){
			return new LinkedList<ExprNode>();
		}
		LinkedList<ExprNode> params = new LinkedList<>();
		params.add(expression);
		params.addAll(otherParams);
		return params;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
