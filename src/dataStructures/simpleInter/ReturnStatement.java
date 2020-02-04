package dataStructures.simpleInter;

public class ReturnStatement implements Statement {

	private int stackSize;

	public ReturnStatement(int numParams) {
		this.stackSize = (numParams + 1) * 4;
	}

	@Override
	public String toString() {
		return toX86();
	}

	public String toX86() {
		return "\tret " + stackSize;
	}
}
