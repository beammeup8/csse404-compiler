package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.List;

public class Program {
	private List<Function> functions;
	
	public Program() {
		functions = new ArrayList<Function>();
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < functions.size(); i ++){
			builder.append(functions.get(i).toString());
			builder.append("\n");
		}
		builder.append("\n");
		return builder.toString();
	}
	
	public void add(Function s){
		functions.add(s);
	}
	
	public void addAll(List<Function> s){
		functions.addAll(s);
	}
}
