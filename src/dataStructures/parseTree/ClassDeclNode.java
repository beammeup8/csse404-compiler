package dataStructures.parseTree;

import java.util.List;

import dataStructures.LexerType;
import dataStructures.ParserType;
import dataStructures.Tag;

/**
 * ClassDecl -> class ID Extnd { ClassVarDecLst MethodDeclLst } ClassDecl |
 * EPSILON
 * 
 * @author mastermk beemanla
 *
 */
public class ClassDeclNode extends Node {

	public ClassDeclNode(List<Tag> tags, IntWrap head) throws Exception {
		int initialHead = head.integer;
		Tag tag = tags.get(head.integer);
		if (!tag.symbol.equals("class")) {
			setToEpsilon(head, initialHead);
			return;
		}
		children.add(new TerminalNode(tag));
		head.incr();
		tag = tags.get(head.integer);
		if (!(tag.type == LexerType.ID)) {
			throw new Exception();
		}
		head.incr();
		children.add(new TerminalNode(tag));
		Node extendNode = NodeFactory.getNode(tags, head, ParserType.Extnd);
		if(extendNode == null){
			setToEpsilon(head, initialHead);
			return;
		}
	}
	
	private void setToEpsilon(IntWrap head, int initialHead){
		children.clear();
		children.add(EpsilonNode.getEpsilonNode());
		head.integer = initialHead;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub

	}

	@Override
	public ParserType getType() {
		return ParserType.ClassDecl;
	}

}
