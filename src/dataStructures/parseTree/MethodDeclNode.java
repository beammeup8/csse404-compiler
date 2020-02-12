package dataStructures.parseTree;

import java.util.ArrayList;
import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.InterMethod1;
import exceptions.CustomException;
import dataStructures.inter1.IInterStatement1;

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

	public InterMethod1 convertToInter1() {
		List<IInterStatement1> interStatements = new ArrayList<>();
		for (int i = 0; i < statements.size(); i++) {
			interStatements.add(statements.get(i).convertToInter1());
		}
		return new InterMethod1(type.getType(), id.symbol, params.convertToInter1(), interStatements, returnExpression.convertToInter1());
	}

}
