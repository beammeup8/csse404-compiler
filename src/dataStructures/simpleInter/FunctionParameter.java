package dataStructures.simpleInter;

public class FunctionParameter implements Statement {
	public String name;
	
	@Override
	public String toString() {
		return "\tpush" + name;
	}
}
