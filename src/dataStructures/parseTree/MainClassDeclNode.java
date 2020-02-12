package dataStructures.parseTree;

import java.util.ArrayList;
import java.util.List;

import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.IInterStatement1;
import dataStructures.inter1.InterClass1;
import dataStructures.inter1.InterDeclaration1;
import dataStructures.inter1.InterMethod1;
import exceptions.CustomException;

/**
 * MainClassDecl -> class ID { public static void main ( String [ ] ID ) {
 * StmtLst } }
 * 
 * @author mastermk beemanla
 *
 */
public class MainClassDeclNode extends Node {
	private TerminalNode className, argName;
	private List<StmtNode> statementList;

	public MainClassDeclNode(List<Tag> tags, IntWrap head) throws CustomException {
		validateTerminal(tags, head, "class");
		className = addID(tags, head);
		validateTerminal(tags, head, "{");
		validateTerminal(tags, head, "public");
		validateTerminal(tags, head, "static");
		validateTerminal(tags, head, "void");
		validateTerminal(tags, head, "main");
		validateTerminal(tags, head, "(");
		validateTerminal(tags, head, "String");
		validateTerminal(tags, head, "[");
		validateTerminal(tags, head, "]");
		argName = addID(tags, head);
		validateTerminal(tags, head, ")");
		validateTerminal(tags, head, "{");
		statementList = new StmtLstNode(tags, head).getStatements();
		validateTerminal(tags, head, "}");
		validateTerminal(tags, head, "}");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("(Main Class Declaration: class ");
		builder.append(className.toString());
		builder.append("{ public static void main(String[] ");
		builder.append(argName.toString());
		builder.append("){");
		builder.append(statementList.toString());
		builder.append("}})");
		return builder.toString();
	}

	public InterClass1 convertToInter1() {
		List<IInterStatement1> statements = new ArrayList<>();
		for (int i = 0; i < statementList.size(); i++) {
			statements.add(statementList.get(i).convertToInter1());
		}
		List<InterMethod1> methods = new ArrayList<>();
		methods.add(new InterMethod1(null, "main", new ArrayList<InterDeclaration1>(), statements, null));
		return new InterClass1(className.symbol, true, null, new ArrayList<InterDeclaration1>(), methods);
	}

}
