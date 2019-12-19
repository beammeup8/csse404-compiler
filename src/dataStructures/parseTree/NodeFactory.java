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
			return new ClassVarDeclNode(tags, head);
		case ClassVarDeclLst:
			return new ClassVarDeclLstNode(tags, head);
		case Comp:
			return new CompNode(tags, head);
		case CompExpr:
			return new CompExprNode(tags, head);
		case Comparator:
			return new ComparatorNode(tags, head);
		case Decl:
			return new DeclNode(tags, head);
		case EPSILON:
			return EpsilonNode.getEpsilonNode();
		case Expr:
			return new ExprNode(tags, head);
		case Extnd:
			return new ExtndNode(tags, head);
		case FormLst:
			return new FormLstNode(tags, head);
		case Formal:
			return new FormalNode(tags, head);
		case Logic:
			return new LogicNode(tags, head);
		case LogicExpr:
			return new LogicExprNode(tags, head);
		case MethodCall:
			return new MethodCallNode(tags, head);
		case MethodDecl:
			break;
		case MethodDeclLst:
			break;
		case MultDiv:
			break;
		case MultDivExpr:
			break;
		case ParamLst:
			break;
		case Stmt:
			break;
		case StmtLst:
			break;
		case TermExpr:
			break;
		case Terminal:
			break;
		default:
			break;

		}
		return null;
	}
}
