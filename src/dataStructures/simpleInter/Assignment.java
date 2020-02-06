package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;

public class Assignment extends Statement{
	private String labelIn, labelOut;
	
	public Assignment(String labelIn, String labelOut) {
		this.labelIn = labelIn;
		this.labelOut = labelOut;
	}

	@Override
	public String toString() {
		return "\tmov " + labelOut +  ", " + labelIn; 
	}

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		String inMemLocation = getMemLocation(localVariables, labelIn);
		String outMemLocation = getMemLocation(localVariables, labelOut);
		Assignment getInFromMem = new Assignment(inMemLocation, "EBX");
		labelIn = "EBX";
		labelOut = outMemLocation;
		return Arrays.asList(getInFromMem, this);
	}

	@Override
	public String localVariableAssigned() {
		return labelOut;
	}
}
