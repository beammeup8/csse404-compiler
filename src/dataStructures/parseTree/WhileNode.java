package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.IInterStatement1;
import dataStructures.inter1.InterWhile;
import exceptions.CustomException;

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

	public IInterStatement1 convertToInter1() {
		return new InterWhile(conditional.convertToInter1(), body.convertToInter1());
	}

}
