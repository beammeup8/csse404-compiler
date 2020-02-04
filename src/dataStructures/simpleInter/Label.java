package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;

public class Label extends Statement {
	public String label = "";
	
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
}
