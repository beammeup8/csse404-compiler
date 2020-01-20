package dataStructures.parseTree;

import java.util.List;

import Exceptions.CustomException;
import dataStructures.IntWrap;
import dataStructures.Tag;
import dataStructures.inter1.InterDeclaration1;

public class ClassVarDeclNode extends Node {
	private TypeNode type;
	private TerminalNode id;

	public ClassVarDeclNode(List<Tag> tags, IntWrap head) throws CustomException {
		type = new TypeNode(tags, head);
		id = addID(tags, head);
		validateTerminal(tags, head, ";");
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "( Field: " + type.toString() + " " + id.toString() + " ; )"; 
	}

	public InterDeclaration1 convertToInter1() {
		return new InterDeclaration1(type.getType(), id.symbol);
	}

}
