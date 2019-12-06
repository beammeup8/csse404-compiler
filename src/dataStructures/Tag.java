package dataStructures;

public class Tag {
	public Type type;
	public String symbol;
	
	
	
	public Tag(Type type, String symbol) {
		this.type = type;
		this.symbol = symbol;
	}



	@Override
	public String toString() {
		return type.name() + ", " + symbol;
	}
}
