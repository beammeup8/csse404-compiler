package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class IfNode extends Node {
	private ExprNode conditional; 
	private StmtNode thenBody, elseBody;

	public IfNode(List<Tag> tags, IntWrap head) throws CustomException {
		validateTerminal(tags, head, "if");
		validateTerminal(tags, head, "(");
		conditional = new ExprNode(tags, head);
		addTerminal(tags, head,  ")");
		thenBody = new StmtNode(tags, head);
		validateTerminal(tags, head, "else");
		elseBody = new StmtNode(tags, head);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("(If Expressiont: if( ");
		builder.append(conditional.toString());
		builder.append(")");
		builder.append(thenBody.toString());
		builder.append(" else ");
		builder.append(elseBody.toString());
		builder.append(")");
		return builder.toString();
	}

	@Override
	public AbstractStructure convertToInternal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

}
