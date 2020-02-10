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
		Assignment putSizeInMem = new Assignment(sizeAddress, "EBX");
		Assignment sizeInCall = new Assignment("EBX", "DWORD PTR [ESP]");
		Assignment putInMem = new Assignment("EAX", memoryAddress);
		return Arrays.asList(putSizeInMem, sizeInCall, this, putInMem);
	}

	@Override
	public String localVariableAssigned() {
		return localName;
	}

	@Override
	public List<String> localVariablesUsed() {
		return Arrays.asList(sizeLocation);
	}

	@Override
	public Command toX86() {
		return new Command(CommandType.CALL, "_malloc");
	}

}
