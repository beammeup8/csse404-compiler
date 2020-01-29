package dataStructures.simpleInter;

public class ReturnStatement implements Statement {

	@Override
	public String toString() {
		return toX86();
	}
	
	public String toX86() {
		return "\tret";
	}
}
