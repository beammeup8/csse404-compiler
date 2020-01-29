package dataStructures.simpleInter;

public class Print implements Statement {
	public String localName;
	
	public Print(String localName) {
		this.localName = localName;
	}
	
	@Override
	public String toString() {
		return "\tprint(" + localName + ")";
	}
}
