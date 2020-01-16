package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.internalStructure.AbstractStructure;

/**
 * MainClassDecl -> class ID { public static void main ( String [ ] ID ) { StmtLst } }
 * 
 * @author mastermk beemanla
 *
 */
public class MainClassDeclNode extends Node {
	private TerminalNode className, argName;
	private List<StmtNode> statmentList;

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
		statmentList = new StmtLstNode(tags, head).getStatements();
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
		builder.append(statmentList.toString());
		builder.append("}})");
		return builder.toString();
	}

	@Override
	public AbstractStructure convertToInternal() {
		return null;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

}
