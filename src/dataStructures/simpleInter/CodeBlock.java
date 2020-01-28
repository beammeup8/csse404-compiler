package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.List;

public class CodeBlock implements Statement{
	public List<Statement> statements = new ArrayList<Statement>();
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < statements.size(); i ++){
			builder.append(statements.get(i).toString());
			builder.append("\n");
		}
		builder.append("\n");
		return builder.toString();
	}
	
	public void add(Statement s){
		statements.add(s);
	}
	
	public void addAll(List<Statement> s){
		statements.addAll(s);
	}
}
