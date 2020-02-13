package optimizers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dataStructures.x86.Command;
import dataStructures.x86.FunctionX86;

public class MinimizeMemLookup extends Optimizer {

	@Override
	protected int optimizeFunction(FunctionX86 func) {
		int changes = 0;
		for (int i = 0; i < func.commands.size(); i++) {
			Command a1 = func.commands.get(i);
			switch (a1.type) {
			case DIV:
				break;
			case PUSH:
				String newString = findRecentSet(a1.param1, i, func.commands);
				if (!newString.equals(a1.param1)) {
					a1.param1 = newString;
					changes++;
				}
				break;
			case EQ:
			case GRE:
			case GRT:
			case LSE:
			case LST:
			case NEQ:
			case CALL:
			case JE:
			case JMP:
			case CMP:
			case LABEL:
			case MOV:
			case NEG:
			case NOT:
			case POP:
				break;
			case ADD:
			case AND:
			case OR:
			case SUB:
			case MULT:
//				newString = findRecentSet(a1.param2, i, func.commands);
//				if (!newString.equals(a1.param2)) {
//					a1.param2 = newString;
//					hasChanged = true;
//				}
				break;
			}
		}
		return changes;
	}

	private String findRecentSet(String var, int currentIndex, List<Command> commands) {
		Set<String> hasBeenSet = new HashSet<>();
		for (int i = currentIndex - 1; i >= 0; i--) {
			Command a1 = commands.get(i);
			switch (a1.type) {
			case DIV:
				if (var.equals("EDX")) {
					return "EDX";
				}
			case EQ:
			case GRE:
			case GRT:
			case LSE:
			case LST:
			case NEQ:
			case CALL:
				if (var.equals("EAX")) {
					return "EAX";
				}
				break;
			case JE:
			case JMP:
			case CMP:
			case PUSH:
				break;
			case LABEL:
				return var;
			case MOV:
				if (var.equals(a1.param1)) {
					if (var.startsWith("DWORD") && !a1.param2.startsWith("DWORD") && !hasBeenSet.contains(a1.param2)) {
						return a1.param2;
					}
					return var;
				}
				break;
			case NEG:
			case NOT:
			case ADD:
			case AND:
			case OR:
			case SUB:
			case MULT:
			case POP:
				if (var.equals(a1.param1)) {
					return a1.param1;
				}
				break;
			}
			hasBeenSet.add(a1.param1);
		}
		return var;
	}

	@Override
	public String getName() {
		return "Minimize Memory Lookups";
	}

}
