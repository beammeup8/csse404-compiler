package dataStructures.parseTree;

import java.util.LinkedList;
import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;

public class ParamLstNode extends Node {
	private boolean isEpsilon;
	private ExprNode expression;
	private ParamLstNode furtherParams;

	public ParamLstNode(List<Tag> tags, IntWrap head) {
		int initialHead = head.integer;
		try {
			validateTerminal(tags, head, ",");
			expression = new ExprNode(tags, head);
			furtherParams = new ParamLstNode(tags, head);
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
		params.addAll(furtherParams.getParams());
		return params;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return null;
	}

}
