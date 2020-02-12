package optimizers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import dataStructures.x86.Command;
import dataStructures.x86.CommandType;
import dataStructures.x86.FunctionX86;
import dataStructures.x86.ProgramX86;

public class RemoveUnusedMem implements Optimizer {
	Map<String, LinkedList<Command>> replacedBy;

	@Override
	public boolean optimize(ProgramX86 prog) {
		boolean changed = false;
		for (FunctionX86 func : prog.functions) {
			if (optimizeFunction(func)) {
				changed = true;
			}
		}
		return changed;
	}

	private boolean optimizeFunction(FunctionX86 func) {
		replacedBy = new HashMap<String, LinkedList<Command>>();
		boolean hasChanged = true;
		while (hasChanged) {
			hasChanged = false;
			for (int i = func.commands.size() - 1; i >= 0; i--) {
				Command a1 = func.commands.get(i);
				if(a1.type == null || a1.type != CommandType.MOV){
					//resets on each label
					replacedBy = new HashMap<String, LinkedList<Command>>();
					continue;
				}
				if(a1.type == CommandType.MOV){
					LinkedList<Command> list = replacedBy.remove(a1.param1);
					if(list == null){
						list = new LinkedList<Command>();
						list.add(a1);
						replacedBy.put(a1.param2, list);
						continue;
					}
					list.addFirst(a1);
					try {
						Integer.parseInt(a1.param2);
						Command newCom = new Command(CommandType.MOV, list.getLast().param1, a1.param2);
						int index = func.commands.indexOf(list.getLast());
						func.commands.add(index, newCom);
						func.commands.removeAll(list);
						hasChanged = true;
						
					} catch (NumberFormatException e) {
						replacedBy.put(a1.param2, list);
					}
				}
			}
		}
		return hasChanged;
	}
	
}
