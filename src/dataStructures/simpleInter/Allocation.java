package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;

import dataStructures.x86.Command;
import dataStructures.x86.CommandType;

public class Allocation extends Statement {
	private String localName;
	private String sizeLocation;

	public Allocation(String localName, String sizeLocation) {
		this.localName = localName;
		this.sizeLocation = sizeLocation;
	}

	@Override
	public String toString() {
		return "\tcall _malloc";
	}

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		String memoryAddress = getMemLocation(localVariables, localName);
		String sizeAddress = getMemLocation(localVariables, sizeLocation);
		StackOperation putSizeInMem = new StackOperation(sizeAddress, StackOpType.PUSH);
		Assignment putInMem = new Assignment("EAX", memoryAddress);
		Operation UndoStackOp = new Operation("ESP", "4", "ESP", OpType.ADD);
		return Arrays.asList(putSizeInMem, this, putInMem, UndoStackOp);
	}

	@Override
	public String localVariableAssigned() {
		return localName;
	}

	@Override
	public Command toX86() {
		return new Command(CommandType.CALL, "_malloc");
	}

}
