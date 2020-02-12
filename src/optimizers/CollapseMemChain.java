package optimizers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import dataStructures.x86.Command;
import dataStructures.x86.FunctionX86;

public class CollapseMemChain extends Optimizer {

	protected boolean optimizeFunction(FunctionX86 func) {
		Map<String, LinkedList<Command>> replacedBy = new HashMap<String, LinkedList<Command>>();
		boolean hasChanged = false;
		for (int i = func.commands.size() - 1; i >= 0; i--) {
			Command a1 = func.commands.get(i);
			LinkedList<Command> list;
			switch (a1.type) {
			case MOV:
				list = replacedBy.remove(a1.param1);
				if (list == null) {
					list = new LinkedList<Command>();
					list.add(a1);
					replacedBy.put(a1.param2, list);
					break;
				}
				list.addFirst(a1);
				try {
					Integer.parseInt(a1.param2);
					condenseOne(list, func.commands);
					hasChanged = true;
				} catch (NumberFormatException e) {
					replacedBy.put(a1.param2, list);
				}
				break;
			case ADD:
			case SUB:
			case MULT:
			case OR:
			case AND:
				list = replacedBy.remove(a1.param1);
				break;
			case NEG:
			case POP:
				list = replacedBy.remove(a1.param1);
				break;
			case CMP:
			case JMP:
			case JE:
			case PUSH:
				break;
			case DIV:
				list = replacedBy.remove("EDX");
			case EQ:
			case GRE:
			case GRT:
			case LSE:
			case LST:
			case NEQ:
			case CALL:
				list = replacedBy.remove("EAX");
				break;
			default:
				if (condenseMany(replacedBy, func.commands)) {
					hasChanged = true;
				}
				replacedBy = new HashMap<String, LinkedList<Command>>();
				break;

			}
		}
		return condenseMany(replacedBy, func.commands) || hasChanged;
	}

	private boolean condenseMany(Map<String, LinkedList<Command>> replacedBy, List<Command> commands) {
		boolean changed = false;
		for (LinkedList<Command> list : replacedBy.values()) {
			if (condenseOne(list, commands)) {
				changed = true;
			}
		}
		return changed;
	}

	private boolean condenseOne(LinkedList<Command> list, List<Command> commands) {
		if (list == null || list.size() <= 1) {
			return false;
		}
		Command tail = list.getLast();
		Command head = list.getFirst();
		if (head.param2.startsWith("DWORD")) {
			return false;
		}
		Command newCom = new Command(tail.type, list.getLast().param1, head.param2);
		int index = commands.indexOf(tail);
		commands.add(index, newCom);
		commands.removeAll(list);
		return true;
	}

}
