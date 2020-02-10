package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;

import dataStructures.x86.Command;
import dataStructures.x86.CommandType;

public class Jump extends Statement {
	private String label;
	private JumpType jumpType;

	public Jump(String label, JumpType jumpType) {
		this.label = label;
		this.jumpType = jumpType;
	}

	@Override
	public String toString() {
		String jumpName = "";
		switch (jumpType) {
		case EQUAL:
			jumpName = "je";
			break;
		case NONE:
			jumpName = "jmp";
			break;
		case CALL:
			jumpName = "call";
			break;
		default:
			break;
		}
		return "\t" + jumpName + " " + label;
	}
	
	public Command toX86(){
		switch (jumpType) {
		case EQUAL:
			return new Command(CommandType.JE, label);
		case NONE:
			return new Command(CommandType.JMP, label);
		case CALL:
			return new Command(CommandType.CALL, label);
		default:
			break;
		}
		return null;
	}

	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		return Arrays.asList(this);
	}

	@Override
	public String localVariableAssigned() {
		return null;
	}
}
