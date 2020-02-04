package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;

public class Allocation extends Statement {
	public String localName;
	public String sizeLocation;
	
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
		localName = "ECX";
		MemoryAccess putInMem = new MemoryAccess(localName, memoryAddress, "{0}", false);
		memoryAddress = getMemLocation(localVariables, sizeLocation);
		sizeLocation = "EBX";
		MemoryAccess putSizeInMem = new MemoryAccess("EBX", memoryAddress, "{0}", false);
		Assignment sizeInCall = new Assignment(sizeLocation, "[esp]");
		return Arrays.asList(putSizeInMem, sizeInCall, this, putInMem);
	}

}
