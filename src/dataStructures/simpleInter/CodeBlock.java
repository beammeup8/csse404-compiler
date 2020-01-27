package dataStructures.simpleInter;

import java.util.ArrayList;
import java.util.List;

public class CodeBlock implements Statements{
	public List<Statements> statements = new ArrayList<Statements>();
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < statements.size(); i ++){
			builder.append(statements.get(i).toString());
			builder.append("\n");
		}
		builder.append("\n");
		return builder.toString();
	}
}
