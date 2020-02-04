package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;

public class Print extends Statement {
	public String localName;
	
	public Print(String localName) {
		this.localName = localName;
	}
	
	@Override
	public String toString() {
		return "\tprint(" + localName + ")";
	}

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		// TODO Auto-generated method stub
		return Arrays.asList(this);
	}
}
