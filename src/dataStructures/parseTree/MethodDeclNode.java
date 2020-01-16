package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

public class MethodDeclNode extends Node {
	private TypeNode type;
	private TerminalNode id;
	private FormalNode params;
	private List<StmtNode> statements;
	private ExprNode returnExpression;

	public MethodDeclNode(List<Tag> tags, IntWrap head) throws CustomException {
		validateTerminal(tags, head , "public");
		type = new TypeNode(tags, head);
		id = addID(tags, head);
		validateTerminal(tags, head , "(");
		params = new FormalNode(tags, head);
		validateTerminal(tags, head , ")");
		validateTerminal(tags, head , "{");
		statements = new StmtLstNode(tags, head).getStatements();
		validateTerminal(tags, head , "return");
		returnExpression = new ExprNode(tags, head);
		validateTerminal(tags, head , ";");
		validateTerminal(tags, head , "}");
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
		StringBuilder builder = new StringBuilder();
		builder.append("public");
		builder.append(type.toString());
		builder.append(id.toString());
		builder.append("(");
		builder.append(params);
		builder.append("){");
		builder.append(statements.toString());
		builder.append(" return ");
		builder.append(returnExpression.toString());
		builder.append(";}");
		return builder.toString();
	}

}
