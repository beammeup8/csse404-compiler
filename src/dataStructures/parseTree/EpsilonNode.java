package dataStructures.parseTree;

import dataStructures.ParserType;

public class EpsilonNode extends Node{
	private static Node node = new EpsilonNode();
	private EpsilonNode(){
		
	}
	
	public static Node getEpsilonNode(){
		return node;
	}
	
	@Override
	public String toString() {
		return "\u03B5";
	}

	@Override
	public ParserType getType() {
		return ParserType.EPSILON;
	}

	@Override
	public void optimize() {
		// TODO Auto-generated method stub
		
	}
}
