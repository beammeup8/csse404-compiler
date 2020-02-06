package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.List;

public class Program {
	private List<Function> functions;
	private String filename;
	
	public Program(String filename) {
		functions = new ArrayList<Function>();
		this.filename = filename;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append(getHeader());
		for(int i = 0; i < functions.size(); i ++){
			builder.append(functions.get(i).toString());
			builder.append("\n");
		}
		builder.append(getFooter());
		return builder.toString();
	}
	
	private String getHeader() {
		StringBuilder builder = new StringBuilder();
		builder.append("\t.file \"");
		builder.append(filename);
		builder.append("\"\n\t.def ___main; .scl 2; .type 32; .endef\n\t.intel_syntax noprefix\n\t.section .rdata, \"dr\"\n");
		builder.append("LC0:\n\t.ascii \"%d\\n\\0\"\n\t.text\n\t.globl _main\n\t.def _main; .scl 2; .type 32; .endef\n");
		return builder.toString();
	}
	
	private String getFooter() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\t.ident \"Error 404: Compiler Not Found\"\n");
		builder.append("\t.def _malloc; .scl 2; .type 32; .endef\n");
		builder.append("\t.def _printf; .scl 2; .type 32; .endef\n");
		return builder.toString();
	}
	
	public void add(Function s){
		functions.add(s);
	}
	
	public void addAll(List<Function> s){
		functions.addAll(s);
	}
}
