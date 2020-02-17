package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;

import dataStructures.x86.Command;
import dataStructures.x86.CommandType;

public class Print extends Statement {
	private String localName;

	public Print(String localName) {
		this.localName = localName;
	}

	@Override
	public String toString() {
		return "\tcall _printf";
	}

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		localName = getMemLocation(localVariables, localName);
		StackOperation setParam = new StackOperation(localName, StackOpType.PUSH);
		StackOperation unknown = new StackOperation("OFFSET FLAT:LC0", StackOpType.PUSH);
		Operation addToStackPtr = new Operation("ESP", "8", "ESP", OpType.ADD);
		return Arrays.asList(setParam, unknown, this, addToStackPtr);
	}

	@Override
	public String localVariableAssigned() {
		return null;
	}

	@Override
	public Command toX86() {
		return new Command(CommandType.CALL, "_printf");
	}
}
