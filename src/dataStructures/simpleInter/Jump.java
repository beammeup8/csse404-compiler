package dataStructures.simpleInter;

import java.util.Arrays;
import java.util.List;

public class Jump extends Statement {
	private String label;
	private JumpType jumpType;
	
	public Jump(String label, JumpType jumpType) {
		this.label = label;
		this.jumpType = jumpType;
	}
	
	@Override
	public String toString() {
		return toX86();
	}
	
	public String toX86(){
		String jumpName = "";
		switch (jumpType) {
		case EQUAL:
			jumpName = "je";
			break;
		case GREATER:
			jumpName = "jg";
			break;
		case GREATER_EQUAL:
			jumpName = "jge";
			break;
		case LESS:
			jumpName = "jl";
			break;
		case LESS_EQUAL:
			jumpName = "jle";
			break;
		case NONE:
			jumpName = "jmp";
			break;
		case NOT_EQUAL:
			jumpName = "jne";
			break;
		case ZERO:
			jumpName = "jz";
			break;
		case CALL:
			jumpName = "call";
			break;
		default:
			break;
		}
		return "\t" + jumpName + " " + label;
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
