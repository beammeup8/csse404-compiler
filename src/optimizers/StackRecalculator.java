package optimizers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dataStructures.x86.Command;
import dataStructures.x86.FunctionX86;

public class StackRecalculator extends Optimizer {

	@Override
	protected int optimizeFunction(FunctionX86 func) {
		Map<String, String> stackLocations = countItemsOnStack(func.commands);
		int changes = adjustLabels(stackLocations, func.commands);
		int sizeOfStack = 4 * stackLocations.size();
		if(sizeOfStack != func.stackSize){
			changes += 2;
			func.stackSize = sizeOfStack;
		}
		return changes;
	}
	
	private int adjustLabels(Map<String, String> stackLocations, List<Command> commands){
		int count = 0;
		for(Command c: commands){
			String replaceWith = stackLocations.get(c.param1);
			if(replaceWith != null && !replaceWith.equals(c.param1)){
				c.param1 = replaceWith;
				count ++;
			}
			
			replaceWith = stackLocations.get(c.param2);
			if(replaceWith != null && !replaceWith.equals(c.param2)){
				c.param2 = replaceWith;
				count ++;
			}
		}
		return count;
	}
	
	private Map<String, String> countItemsOnStack(List<Command> commands){
		int currentCount = 0;
		
		Map<String, String> stackLocationMap = new HashMap<>();
		for(Command c: commands){
			currentCount = addNewLabel(c.param1, stackLocationMap, currentCount);
			currentCount = addNewLabel(c.param2, stackLocationMap, currentCount);
		}
		return stackLocationMap;
	}
	
	private int addNewLabel(String param, Map<String, String> stackLocationMap, int currentCount){
		if(param == null){
			return currentCount;
		}
		String begining = "DWORD PTR [EBP - ";
		if(param.startsWith(begining) && !stackLocationMap.containsKey(param)){
			currentCount ++;
			stackLocationMap.put(param, begining + currentCount * 4 + "]");
		}
		return currentCount;
	}

	@Override
	public String getName() {
		return "Stack Recalculator";
	}

}
