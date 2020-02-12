package dataStructures.parseTree;

import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.IInterStatement1;
import dataStructures.inter1.InterIf1;
import exceptions.CustomException;

public class IfNode extends Node {
	private ExprNode conditional;
	private StmtNode thenBody, elseBody;

	public IfNode(List<Tag> tags, IntWrap head) throws CustomException {
		validateTerminal(tags, head, "if");
		validateTerminal(tags, head, "(");
		conditional = new ExprNode(tags, head);
		addTerminal(tags, head, ")");
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

	public IInterStatement1 convertToInter1() {
		return new InterIf1(conditional.convertToInter1(), thenBody.convertToInter1(), elseBody.convertToInter1());
	}

}
