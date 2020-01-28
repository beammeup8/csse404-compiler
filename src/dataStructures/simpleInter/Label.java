package dataStructures.simpleInter;

public class Label implements Statement {
	public String label = "";
	
	public Label(String label) {
		this.label = label;
	}
	
	@Override
	public String toString() {
		return label;
	}
}
