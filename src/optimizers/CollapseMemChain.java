package optimizers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import dataStructures.x86.Command;
import dataStructures.x86.CommandType;
import dataStructures.x86.FunctionX86;

public class CollapseMemChain extends Optimizer {

	protected int optimizeFunction(FunctionX86 func) {
		int changes = 0;
		Map<String, LinkedList<Command>> replacedBy = new HashMap<String, LinkedList<Command>>();
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
				if (a1.param2.contains("EBP +")) {
					changes += condenseOne(list, func.commands);
				} else {
					try {
						Integer.parseInt(a1.param2);
						changes += condenseOne(list, func.commands);
					} catch (NumberFormatException e) {
						replacedBy.put(a1.param2, list);
					}
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
				changes += condenseMany(replacedBy, func.commands);
				replacedBy = new HashMap<String, LinkedList<Command>>();
				break;

			}
		}
		return changes + condenseMany(replacedBy, func.commands);
	}

	private int condenseMany(Map<String, LinkedList<Command>> replacedBy, List<Command> commands) {
		int changes = 0;
		for (LinkedList<Command> list : replacedBy.values()) {
			changes += condenseOne(list, commands);
		}
		return changes;
	}

	private int condenseOne(LinkedList<Command> list, List<Command> commands) {
		if (list == null || list.size() <= 1) {
			return 0;
		}
		Command tail = list.getLast();
		Command head = list.getFirst();
		
		if (head.param2.startsWith("DWORD")) {
			return 0;
		}
		
		Command newCom = null;
		if (tail.type == CommandType.MOV) {
			newCom = new Command(tail.type, tail.param1, head.param2);
			
		} else if (tail.type == CommandType.PUSH) {
			newCom = new Command(tail.type, head.param2);
		}
		int index = commands.indexOf(tail);
		commands.add(index, newCom);
		commands.removeAll(list);
		return list.size();
	}

	@Override
	public String getName() {
		return "Collapse Memory Access Chains";
	}

}
