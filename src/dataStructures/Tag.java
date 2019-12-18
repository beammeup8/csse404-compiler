package dataStructures;

public class Tag {
	public LexerType type;
	public String symbol;
	
	
	
	public Tag(LexerType type, String symbol) {
		this.type = type;
		this.symbol = symbol;
	}



	@Override
	public String toString() {
		return type.name() + ", " + symbol;
	}
}
