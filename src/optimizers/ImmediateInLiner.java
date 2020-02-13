package optimizers;

import dataStructures.x86.Command;
import dataStructures.x86.CommandType;
import dataStructures.x86.FunctionX86;

public class ImmediateInLiner extends Optimizer {

	protected int optimizeFunction(FunctionX86 func) {
		int changes = 0;
		for (int i = 0; i < func.commands.size() - 1; i++) {
			Command a1 = func.commands.get(i);
			Command a2 = func.commands.get(i + 1);
			if (a1.type == CommandType.MOV && a2.type == CommandType.MOV) {
				if (!a1.param2.startsWith("DWORD") && !a1.param1.startsWith("DWORD") && a1.param1.equals(a2.param2)) {
					func.commands.remove(i + 1);
					func.commands.remove(i);
					func.commands.add(i, new Command(CommandType.MOV, a2.param1, a1.param2));
					changes++;
					i--;
				}
			}
		}
		return changes;
	}

	@Override
	public String getName() {
		return "Immediate In-Liner";
	}

}
