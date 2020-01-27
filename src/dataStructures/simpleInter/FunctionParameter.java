package dataStructures.simpleInter;

public class FunctionParameter implements Statements {
	public String name;
	
	@Override
	public String toString() {
		return "\tpush" + name;
	}
}
