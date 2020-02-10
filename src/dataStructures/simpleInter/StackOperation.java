package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dataStructures.x86.Command;
import dataStructures.x86.CommandType;

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
	public List<String> localVariablesUsed() {
		switch (opType) {
		case POP:
			return new ArrayList<>();
		case PUSH:
			return Arrays.asList(label);
		}
		return new ArrayList<>();
	}

	@Override
	public Command toX86() {
		switch (opType) {
		case POP:
			return new Command(CommandType.POP, label);
		case PUSH:
			return new Command(CommandType.PUSH, label);
		}
		return null;
	}

}
