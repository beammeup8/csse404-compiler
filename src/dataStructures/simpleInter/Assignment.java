package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Assignment extends Statement {
	private String labelIn, labelOut;

	public Assignment(String labelIn, String labelOut) {
		this.labelIn = labelIn;
		this.labelOut = labelOut;
	}

	@Override
	public String toString() {
		return "\tmov " + labelOut + ", " + labelIn;
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

	public String getLabelIn() {
		return labelIn;
	}

	public String getLabelOut() {
		return labelOut;
	}

	@Override
	public void populateVarMap(Map<String, String> varMap) {
		if (labelIn.startsWith("_")) {
			varMap.put(labelOut, labelIn);
		}
	}

	@Override
	public void simplifyVariables(Map<String, String> varMap) {
		labelIn = getNewVarName(labelIn, varMap);
		labelOut = getNewVarName(labelOut, varMap);
	}

	@Override
	public boolean isRedundant() {
		return labelIn.equals(labelOut);
	}
}
