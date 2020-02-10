package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StackOperation extends Statement {
	private String label;
	private StackOpType opType;

	public StackOperation(StackOpType opType) {
		this.opType = opType;
	}
	
	public StackOperation(String label, StackOpType opType) {
		this.label = label;
		this.opType = opType;
	}

	@Override
	public String toString() {
		switch (opType) {
		case POP:
			return "\tpop " + label;
		case PUSH:
			return "\tpush " + label;
		}
		return null;
	}

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		if(label != null){
			label = getMemLocation(localVariables, label);
		}
		return Arrays.asList(this);
	}

	@Override
	public String localVariableAssigned() {
		switch (opType) {
		case POP:
			return label;
		case PUSH:
			return null;
		}
		return null;
	}

	@Override
	public void populateVarMap(Map<String, String> varMap) {

	}

	@Override
	public void simplifyVariables(Map<String, String> varMap) {
		label = getNewVarName(label, varMap);
	}

	@Override
	public boolean isRedundant() {
		return false;
	}


}
