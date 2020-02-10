package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dataStructures.x86.Command;
import dataStructures.x86.CommandType;

public class MemoryAccess extends Statement {
	private String registerLabel, memoryLabel, offsetLabel;
	private boolean isRead;

	public MemoryAccess(String registerLabel, String memoryLabel, String offsetLabel, boolean isRead) {
		this.registerLabel = registerLabel;
		this.memoryLabel = memoryLabel;
		this.offsetLabel = offsetLabel;
		this.isRead = isRead;
	}
	
	private String getMemPart() {
		return "DWORD PTR [" + memoryLabel + " + " + offsetLabel + "]";
	}

	@Override
	public String toString() {
		String memPart = getMemPart();
		if (isRead) {
			return "\tmov " + registerLabel + ", " + memPart;
		}
		return "\tmov " + memPart + ", " + registerLabel;
	}

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		List<Statement> toReturn = new ArrayList<Statement>();
		String registerAddr = getMemLocation(localVariables, registerLabel);
		if (!isRead && !registerLabel.equals(registerAddr)) {
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
		if(isRead && !registerLabel.equals(registerAddr)){
			registerLabel = "EBX";
			toReturn.add(new Assignment(registerLabel, registerAddr));
		}
		return toReturn;
	}

	@Override
	public String localVariableAssigned() {
		if (isRead) {
			return registerLabel;
		}
		return getMemPart();
	}

	@Override
	public List<String> localVariablesUsed() {
		if (isRead) {
			return Arrays.asList(memoryLabel, offsetLabel, getMemPart());
		}
		return Arrays.asList(registerLabel, memoryLabel, offsetLabel);
	}

	@Override
	public Command toX86() {
		if (isRead) {
			return new Command(CommandType.MOV, registerLabel, getMemPart());
		}
		return new Command(CommandType.MOV, getMemPart(), registerLabel);
	}
}
