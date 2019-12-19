package dataStructures.parseTree;

import java.util.List;

import dataStructures.LexerType;
import dataStructures.ParserType;
import dataStructures.Tag;

/**
 * Stmt -> 	Decl = Expr ; 
 * 			| { StmtLst } 
 * 			| if ( Expr ) Stmt else Stmt 
 * 			| while ( Expr ) Stmt 
 * 			| System.out.println ( Expr ) ; 
 * 			| ID = Expr ;
 * 
 * @author mastermk beemanla
 *
 */
public class StmtNode extends Node {

	public StmtNode(List<Tag> tags, IntWrap head) throws Exception {
		int initialHead = head.integer;
		Tag first = tags.get(head.integer);
		if(first.symbol.equals("{")){
			addTerminal(tags, head, initialHead, "{");
			addNonTerminal(tags, head, initialHead, ParserType.StmtLst);
			addTerminal(tags, head, initialHead, "}");
			return;
		}
		if(first.symbol.equals("if")){
			addTerminal(tags, head, initialHead, "if");
			addTerminal(tags, head, initialHead, "(");
			addNonTerminal(tags, head, initialHead, ParserType.Expr);
			addTerminal(tags, head, initialHead, ")");
			addNonTerminal(tags, head, initialHead, ParserType.Stmt);
			addTerminal(tags, head, initialHead, "else");
			addNonTerminal(tags, head, initialHead, ParserType.Stmt);
			return;
		}
		if(first.symbol.equals("while")){
			addTerminal(tags, head, initialHead, "while");
			addTerminal(tags, head, initialHead, "(");
			addNonTerminal(tags, head, initialHead, ParserType.Expr);
			addTerminal(tags, head, initialHead, ")");
			addNonTerminal(tags, head, initialHead, ParserType.Stmt);
			return;
		}
		if(first.symbol.equals("System.out.println")){
			addTerminal(tags, head, initialHead, "System.out.println");
			addTerminal(tags, head, initialHead, "(");
			addNonTerminal(tags, head, initialHead, ParserType.Expr);
			addTerminal(tags, head, initialHead, ")");
			addTerminal(tags, head, initialHead, ";");
			return;
		}
		if(first.type == LexerType.ID){
			addID(tags, head, initialHead);
			addTerminal(tags, head, initialHead, "=");
			addNonTerminal(tags, head, initialHead, ParserType.Expr);
			addTerminal(tags, head, initialHead, ";");
			return;
		}
		addNonTerminal(tags, head, initialHead, ParserType.Decl);
		addTerminal(tags, head, initialHead, "=");
		addNonTerminal(tags, head, initialHead, ParserType.Expr);
		addTerminal(tags, head, initialHead, ";");
	}

	@Override
	public ParserType getType() {
		return ParserType.Stmt;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub.

	}

}
