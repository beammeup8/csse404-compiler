package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Print extends Statement {
	private String localName;
	
	public Print(String localName) {
		this.localName = localName;
	}
	
	@Override
	public String toString() {
		return "\tcall _printf";
	}

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		localName = getMemLocation(localVariables, localName);
		Assignment intoEAX = new Assignment(localName, "EAX");
		Assignment setParam = new Assignment("EAX","DWORD PTR [ESP+4]");
		Assignment unknown = new Assignment("OFFSET FLAT:LC0", "DWORD PTR [ESP]");
		return Arrays.asList(intoEAX, setParam, unknown, this);
	}

	@Override
	public String localVariableAssigned() {
		return null;
	}

	@Override
	public List<String> localVariablesUsed() {
		return new ArrayList<>();
	}
}
