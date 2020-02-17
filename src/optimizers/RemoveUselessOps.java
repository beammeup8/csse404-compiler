package optimizers;

import dataStructures.x86.Command;
import dataStructures.x86.FunctionX86;

public class RemoveUselessOps extends Optimizer{

	@Override
	protected int optimizeFunction(FunctionX86 func) {
		int changes = 0;
		for(int i = 0; i < func.commands.size(); i++){
			Command c = func.commands.get(i);
			switch (c.type) {
			case ADD:
			case SUB:
			case OR:
				if(c.param2.equals("0")){
					func.commands.remove(i);
					i--;
				}
				break;
			case AND:
			case MULT:
				if(c.param2.equals("1")){
					func.commands.remove(i);
					i--;
				}
				break;
			default:
				break;
			}
		}
		return changes;
	}

	@Override
	public String getName() {
		return "Remove Useless Operations";
	}
	
}
