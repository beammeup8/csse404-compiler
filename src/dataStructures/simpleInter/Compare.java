package dataStructures.simpleInter;

public class Compare implements Statements{
	public String labelA, labelB;
	
	@Override
	public String toString() {
		return toX86();
	}
	
	public String toX86(){
		return "\tcmp " + labelA + ", " + labelB;
	}
}
