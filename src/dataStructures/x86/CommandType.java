package dataStructures.x86;

public enum CommandType {
	ADD, SUB, MULT, DIV, CALL, AND, OR, NEG, NOT, EQ, GRE, GRT, LSE, LST, NEQ, PUSH, POP, MOV, JE, JMP, CMP;
	
	@Override
	public String toString() {
		switch (this) {
		case ADD:
			return "add";
		case AND:
			return "and";
		case MULT:
			return "imul";
		case OR:
			return "or";
		case SUB:
			return "sub";
		case DIV:
			return "idiv";
		case NEG:
			return "neg";
		case NOT:
			return "not";
		case EQ:
			return setConditionalToString("e");
		case GRE:
			return setConditionalToString("ge");
		case GRT:
			return setConditionalToString("g");
		case LSE:
			return setConditionalToString("le");
		case LST:
			return setConditionalToString("l");
		case NEQ:
			return setConditionalToString("ne");
		case PUSH:
			return "push";
		case POP:
			return "pop";
		case MOV:
			return "mov";
		case JE:
			return "je";
		case JMP:
			return "jmp";
		case CMP:
			return "cmp";
		case CALL:
			return "call";
		default:
			return null;
		}
	}
	
	private String setConditionalToString(String op) {
		return "set" + op;
	}
}
