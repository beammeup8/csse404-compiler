package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.IInterStatement1;

public class WhileNode extends Node {
	private ExprNode conditional;
	private StmtNode body;

	public WhileNode(List<Tag> tags, IntWrap head) throws CustomException {
		validateTerminal(tags, head, "while");
		validateTerminal(tags, head, "(");
		conditional = new ExprNode(tags, head);
		validateTerminal(tags, head, ")");
		body = new StmtNode(tags, head);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("(While Expression: while( ");
		builder.append(conditional.toString());
		builder.append(")");
		builder.append(body.toString());
		builder.append(")");
		return builder.toString();
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

	public IInterStatement1 convertToInter1() {
		return null;
	}

}
