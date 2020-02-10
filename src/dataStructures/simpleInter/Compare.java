package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;

import dataStructures.x86.Command;
import dataStructures.x86.CommandType;

public class Compare extends Statement{
	private String labelA, labelB;
	
	public Compare(String labelA, String labelB) {
		this.labelA = labelA;
		this.labelB = labelB;
	}
	
	@Override
	public String toString() {
		return "\tcmp " + labelA + ", " + labelB;
	}
	
	public Command toX86(){
		return new Command(CommandType.CMP, labelA, labelB);
	}

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		String aMemLocation = getMemLocation(localVariables, labelA);
		String bMemLocation = getMemLocation(localVariables, labelB);
		if(aMemLocation.equals(labelA) || bMemLocation.equals(labelB)){
			labelA = aMemLocation;
			labelB = bMemLocation;
			return Arrays.asList(this);
		}
		Assignment getInFromMem = new Assignment(aMemLocation, "EBX");
		labelA = aMemLocation;
		labelB = bMemLocation;
		return Arrays.asList(getInFromMem, this);
	}

	@Override
	public String localVariableAssigned() {
		return null;
	}

	@Override
	public List<String> localVariablesUsed() {
		return Arrays.asList(labelA, labelB);
	}
}
