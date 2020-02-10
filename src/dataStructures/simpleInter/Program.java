package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.List;

import dataStructures.x86.FunctionX86;
import dataStructures.x86.ProgramX86;

public class Program {
	private List<Function> functions;
	private String filename;
	
	public Program(String filename) {
		functions = new ArrayList<Function>();
		this.filename = filename;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < functions.size(); i ++){
			builder.append(functions.get(i).toString());
			builder.append("\n");
		}
		return builder.toString();
	}
	
	public ProgramX86 toX86(){
		List<FunctionX86> funcs = new ArrayList<>();
		functions.forEach(x -> funcs.add(x.toX86()));
		return new ProgramX86(filename, funcs);
	}
	
	public void add(Function s){
		functions.add(s);
	}
	
	public void addAll(List<Function> s){
		functions.addAll(s);
	}
}
