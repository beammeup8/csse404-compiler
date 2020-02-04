package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.List;

public class MemoryAccess extends Statement {
	public String registerLabel, memoryLabel, offsetLabel;
	public boolean isRead;

	public MemoryAccess(String registerLabel, String memoryLabel, String offsetLabel, boolean isRead) {
		this.registerLabel = registerLabel;
		this.memoryLabel = memoryLabel;
		this.offsetLabel = offsetLabel;
		this.isRead = isRead;
	}

	@Override
	public String toString() {
		String memPart = "DWORD PTR [" + memoryLabel + "+" +offsetLabel + "]";
		if (isRead) {
			return "\tmov " + registerLabel + ", " + memPart;
		}
		return "\tmov " + memPart + ", " + registerLabel;
	}

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		List<Statement> toReturn = new ArrayList<Statement>();
		registerLabel = getMemLocation(localVariables, registerLabel);
		String memLabelAddr = getMemLocation(localVariables, memoryLabel);
		if(!memoryLabel.equals(memLabelAddr)){
			memoryLabel = "EBX";
			toReturn.add(new Assignment(memLabelAddr, "EBX"));
		}
		String offsetLabelAddr = getMemLocation(localVariables, offsetLabel);
		if(!offsetLabelAddr.equals(offsetLabel)){
			memoryLabel = "ECX";
			toReturn.add(new Assignment(offsetLabelAddr, "ECX"));
		}
		toReturn.add(this);
		return toReturn;
	}
}
