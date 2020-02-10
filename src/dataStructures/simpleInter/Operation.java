package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import dataStructures.x86.Command;
import dataStructures.x86.CommandType;

public class Operation extends Statement {
	private String labelA, labelB, labelOut;
	private OpType op;
	
	private Set<OpType> comparisons = EnumSet.of(OpType.EQ, OpType.NEQ, OpType.LSE, OpType.LST, OpType.GRT, OpType.GRE);
	
	public Operation(String labelA, String labelB, String labelOut, OpType op) {
		this.labelA = labelA;
		this.labelB = labelB;
		this.labelOut = labelOut;
		this.op = op;
	}

	@Override
	public String toString() {
		switch (op) {
		case ADD:
			return twoParamToString("add");
		case AND:
			return twoParamToString("and");
		case MULT:
			return twoParamToString("imul");
		case OR:
			return twoParamToString("or");
		case SUB:
			return twoParamToString("sub");
		case DIV:
			return oneParamToString("idiv");
		case NEG:
			return oneParamToString("neg");
		case NOT:
			return oneParamToString("not");
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
		default:
			return null;
		}
	}
	
	private String setConditionalToString(String op) {
		return "\tset" + op + " AL";
	}

	private String oneParamToString(String op) {
		return "\t" + op + " " + labelOut;
	}
	
	private String twoParamToString(String op) {
		return "\t" + op + " " + labelA + ", " + labelB;
	}
	
	@Override
	public List<Statement> convertToMemAccesses(List<String> localVariables) {
		String aMem = getMemLocation(localVariables, labelA);
		String bMem = getMemLocation(localVariables, labelB);
		String outMem = getMemLocation(localVariables, labelOut);
		List<Statement> toReturn = new ArrayList<>();
		if (op == OpType.DIV) {
			toReturn.add(new Assignment("" + 0, "EDX"));
		}
		if(op == OpType.NOT){
			toReturn.add(new Operation(bMem, "1", "EAX", OpType.SUB));
			toReturn.add(new Assignment(bMem, "EAX"));
			op = OpType.NEG;
		}
		if(aMem != null && !aMem.equals(labelA)){
			labelA = "EAX";
			toReturn.add(new Assignment(aMem, labelA));
		}
		if(bMem != null && !bMem.equals(labelB)){
			labelB = "EBX";
			toReturn.add(new Assignment(bMem, labelB));
		}
		if (comparisons.contains(op)) {
			toReturn.add(new Compare(labelA, labelB));
			toReturn.add(new Assignment("0", labelA));
		}
		toReturn.add(this);
		if(outMem != null && !outMem.equals(labelOut)){
			labelOut = "EAX";
			toReturn.add(new Assignment(labelOut, outMem));
		}
		return toReturn;
	}

	@Override
	public String localVariableAssigned() {
		return labelOut;
	}

	@Override
	public List<String> localVariablesUsed() {
		return Arrays.asList(labelA, labelB);
	}

	@Override
	public Command toX86() {
		CommandType type = null;
		switch (op) {
		case ADD:
			type = CommandType.ADD;
			break;
		case AND:
			type = CommandType.AND;
			break;
		case DIV:
			type = CommandType.DIV;
			break;
		case EQ:
			type = CommandType.EQ;
			break;
		case GRE:
			type = CommandType.GRE;
			break;
		case GRT:
			type = CommandType.GRT;
			break;
		case LSE:
			type = CommandType.LSE;
			break;
		case LST:
			type = CommandType.LST;
			break;
		case MULT:
			type = CommandType.MULT;
			break;
		case NEG:
			type = CommandType.NEG;
			break;
		case NEQ:
			type = CommandType.NEQ;
			break;
		case NOT:
			type = CommandType.NOT;
			break;
		case OR:
			type = CommandType.OR;
			break;
		case SUB:
			type = CommandType.SUB;
			break;
		default:
			break;
		}
		
		switch (op) {
		case ADD:
		case AND:
		case MULT:
		case OR:
		case SUB:
			return new Command(type, labelA, labelB);
		case DIV:
		case NEG:
		case NOT:
			return new Command(type, labelOut);
		case EQ:
		case GRE:
		case GRT:
		case LSE:
		case LST:
		case NEQ:
			return new Command(type, "AL");
		default:
			return null;
		}
	}
}
