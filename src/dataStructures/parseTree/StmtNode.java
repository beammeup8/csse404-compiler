package dataStructures.parseTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dataStructures.IntWrap;
import dataStructures.LexerType;
import dataStructures.Tag;
import dataStructures.inter1.IInterStatement1;
import dataStructures.inter1.InterArrayAssign1;
import dataStructures.inter1.InterAssign1;
import dataStructures.inter1.InterDeclaration1;
import dataStructures.inter1.InterMultiStatement1;
import dataStructures.inter1.InterNoScope1;
import dataStructures.inter1.InterPrintStatement1;
import exceptions.CustomException;

/**
 * 
 * @author mastermk beemanla
 *
 */
public class StmtNode extends Node {
	private enum StmtType {
		DECLARATION, ASSIGNMENT, DECLARE_ASSIGN, IF, WHILE, PRINT, STATEMENTLIST, ARRAY_ASSIGN
	}

	private StmtType stmtType;
	private IfNode ifNode;
	private WhileNode whileNode;
	private ExprNode expression, arrayIndex;
	private TypeNode type;
	private TerminalNode id;
	private List<StmtNode> statements;

	public StmtNode(List<Tag> tags, IntWrap head) throws CustomException {
		Tag first = tags.get(head.integer);
		if (first.symbol.equals("if")) {
			ifNode = new IfNode(tags, head);
			stmtType = StmtType.IF;
			return;
		}
		if (first.symbol.equals("while")) {
			whileNode = new WhileNode(tags, head);
			stmtType = StmtType.WHILE;
			return;
		}
		if (first.symbol.equals("{")) {
			validateTerminal(tags, head, "{");
			statements = new StmtLstNode(tags, head).getStatements();
			validateTerminal(tags, head, "}");
			stmtType = StmtType.STATEMENTLIST;
			return;
		}
		if (first.symbol.equals("System.out.println")) {
			validateTerminal(tags, head, "System.out.println");
			validateTerminal(tags, head, "(");
			expression = new ExprNode(tags, head);
			validateTerminal(tags, head, ")");
			validateTerminal(tags, head, ";");
			stmtType = StmtType.PRINT;
			return;
		}
		if (first.type == LexerType.ID) {
			if (tags.get(head.integer + 1).symbol.equals("=")) {
				id = addID(tags, head);
				validateTerminal(tags, head, "=");
				expression = new ExprNode(tags, head);
				validateTerminal(tags, head, ";");
				stmtType = StmtType.ASSIGNMENT;
				return;
			}
			if (tags.get(head.integer + 1).symbol.equals("[")) {
				id = addID(tags, head);
				validateTerminal(tags, head, "[");
				arrayIndex = new ExprNode(tags, head);
				validateTerminal(tags, head, "]");
				validateTerminal(tags, head, "=");
				expression = new ExprNode(tags, head);
				validateTerminal(tags, head, ";");
				stmtType = StmtType.ARRAY_ASSIGN;
				return;
			}
		}
		type = new TypeNode(tags, head);
		id = addID(tags, head);
		if (tags.get(head.integer).symbol.equals("=")) {
			validateTerminal(tags, head, "=");
			expression = new ExprNode(tags, head);
			stmtType = StmtType.DECLARE_ASSIGN;
		} else {
			stmtType = StmtType.DECLARATION;
		}
		validateTerminal(tags, head, ";");
	}

	@Override
	public String toString() {
		switch (stmtType) {
		case ARRAY_ASSIGN:
			return "( " + id.toString() + "[" + arrayIndex.toString() + "] = " + expression.toString() + "; )";
		case ASSIGNMENT:
			return "( " + id.toString() + " = " + expression.toString() + "; )";
		case DECLARATION:
			return "( " + type.toString() + " " + id.toString() + "; )";
		case DECLARE_ASSIGN:
			return "( " + type.toString() + " " + id.toString() + " = " + expression.toString() + "; )";
		case IF:
			return ifNode.toString();
		case PRINT:
			return "System.out.println(" + expression.toString() + ");";
		case STATEMENTLIST:
			return "{ " + statements.toString() + " }";
		case WHILE:
			return whileNode.toString();
		}
		return null;
	}

	public IInterStatement1 convertToInter1() {
		switch (stmtType) {
		case ARRAY_ASSIGN:
			return new InterArrayAssign1(id.symbol, arrayIndex.convertToInter1(), expression.convertToInter1());
		case ASSIGNMENT:
			return new InterAssign1(id.symbol, expression.convertToInter1());
		case DECLARATION:
			return new InterDeclaration1(type.getType(), id.symbol);
		case DECLARE_ASSIGN:
			IInterStatement1 decl = new InterDeclaration1(type.getType(), id.symbol);
			IInterStatement1 assign = new InterAssign1(id.symbol, expression.convertToInter1());
			return new InterNoScope1(Arrays.asList(decl, assign));
		case IF:
			return ifNode.convertToInter1();
		case PRINT:
			return new InterPrintStatement1(expression.convertToInter1());
		case STATEMENTLIST:
			List<IInterStatement1> interStatements = new ArrayList<>();
			for (int i = 0; i < statements.size(); i++) {
				interStatements.add(statements.get(i).convertToInter1());
			}
			return new InterMultiStatement1(interStatements);
		case WHILE:
			return whileNode.convertToInter1();
		default:
			break;

		}
		System.err.println("Invalid enum: Statement Node");
		return null;
	}

}
