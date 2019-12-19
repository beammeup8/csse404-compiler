package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class NodeFactory {

	public static Node getNode(List<Tag> tags, IntWrap head, ParserType type) throws Exception {
		switch (type) {
		case Program:
			return new ProgramNode(tags, head);
		case MainClassDecl:
			return new MainClassDeclNode(tags, head);
		case ClassDecl:
			return new ClassDeclNode(tags, head);
		case AddSub:
			return new AddSubNode(tags, head);
		case AddSubExpr:
			return new AddSubExprNode(tags, head);
		case ClassDeclLst:
			return new ClassDeclLstNode(tags, head);
		case ClassVarDecl:
			break;
		case ClassVarDeclLst:
			break;
		case Comp:
			break;
		case CompExpr:
			break;
		case Comparator:
			break;
		case Decl:
			break;
		case EPSILON:
			break;
		case Expr:
			break;
		case Extnd:
			break;
		case FormLst:
			break;
		case Formal:
			break;
		case Logic:
			break;
		case LogicExpr:
			break;
		case MethodCall:
			break;
		case MethodDecl:
			return new MethodDeclNode(tags, head);
		case MethodDeclLst:
			return new MethodDeclLstNode(tags, head);
		case MultDiv:
			return new MultDivNode(tags, head);
		case MultDivExpr:
			return new MultDivExprNode(tags, head);
		case ParamLst:
			return new ParamLstNode(tags, head);
		case Stmt:
			return new StmtNode(tags, head);
		case StmtLst:
			return new StmtLstNode(tags, head);
		case TermExpr:
			return new TermExprNode(tags, head);
		case Terminal:
			return new TerminalNode(tags.get(head.integer));
		default:
			break;

		}
		return null;
	}
}
