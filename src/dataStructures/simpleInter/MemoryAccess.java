package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.List;

public class MemoryAccess extends Statement {
	private String registerLabel, memoryLabel, offsetLabel;
	private boolean isRead;

	public MemoryAccess(String registerLabel, String memoryLabel, String offsetLabel, boolean isRead) {
		this.registerLabel = registerLabel;
		this.memoryLabel = memoryLabel;
		this.offsetLabel = offsetLabel;
		this.isRead = isRead;
	}

	@Override
	public String toString() {
		String memPart = "DWORD PTR [" + memoryLabel + " + " + offsetLabel + "]";
		if (isRead) {
			return "\tmov " + registerLabel + ", " + memPart;
		}
		return "\tmov " + memPart + ", " + registerLabel;
	}

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		List<Statement> toReturn = new ArrayList<Statement>();
		String registerAddr = getMemLocation(localVariables, registerLabel);
		if (!registerLabel.equals(registerAddr)) {
			registerLabel = "EDX";
			toReturn.add(new Assignment(registerAddr, registerLabel));
		}
		String memLabelAddr = getMemLocation(localVariables, memoryLabel);
		if(!memoryLabel.equals(memLabelAddr)){
			memoryLabel = "EBX";
			toReturn.add(new Assignment(memLabelAddr, memoryLabel));
		}
		String offsetLabelAddr = getMemLocation(localVariables, offsetLabel);
		if(!offsetLabelAddr.equals(offsetLabel)){
			offsetLabel = "ECX";
			toReturn.add(new Assignment(offsetLabelAddr, offsetLabel));
		}
		toReturn.add(this);
		return toReturn;
	}

	@Override
	public String localVariableAssigned() {
		return registerLabel;
	}
}
