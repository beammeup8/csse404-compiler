package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;

public class ReturnStatement extends Statement {

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

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		return Arrays.asList(this);
	}

	@Override
	public String localVariableAssigned() {
		return null;
	}
}
