package dataStructures.parseTree;
import dataStructures.ParserType;
import dataStructures.Tag;

public class NegationNode extends Node{
	
	public NegationNode(Tag tag) {
		super(tag.symbol, ParserType.Negation);
	}

	@Override
	public void optimize() {
	}

}
