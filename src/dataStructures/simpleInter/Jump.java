package dataStructures.simpleInter;

public class Jump implements Statements {
	public String label = "";
	public JumpType jumpType;
	
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
		case NOT_EQUAL:
			jumpName = "jne";
			break;
		case ZERO:
			jumpName = "jz";
			break;
		}
		return "\t" + jumpName + " " + label + ";";
	}
}
