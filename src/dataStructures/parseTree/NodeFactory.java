package dataStructures.parseTree;

import java.util.List;

import dataStructures.ParserType;
import dataStructures.Tag;

public class NodeFactory {

	public static Node getNode(List<Tag> tags, IntWrap head, ParserType type) throws Exception {
		System.out.println(type.toString() + ": " + tags.get(head.integer).symbol);
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
		case LogicExpr:
			return new LogicExprNode(tags, head);
		case MethodCall:
			return new MethodCallNode(tags, head);
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
		case Type:
			return new TypeNode(tags, head);
		case FirstParam:
			return new FirstParamNode(tags, head);
		case MethodExpr:
			return new MethodExpNode(tags, head);
		case NegExpr:
			return new NegExprNode(tags, head);
		default:
			break;

		}
		return null;
	}
}
