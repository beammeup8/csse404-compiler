package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Label extends Statement {
	private String label = "";

	public Label(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return label + ":";
	}

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		return Arrays.asList(this);
	}

	@Override
	public String localVariableAssigned() {
		return null;
	}

	@Override
	public void populateVarMap(Map<String, String> varMap) {

	}

	@Override
	public void simplifyVariables(Map<String, String> varMap) {

	}

	@Override
	public boolean isRedundant() {
		return false;
	}

}
