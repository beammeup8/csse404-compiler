package dataStructures.simpleInter;

import java.util.List;


public class Function{
	public String name;
	public Label nameLabel;
	public List<Statement> statements;
	public List<String> localVariables;
	public List<String> parameters;
	
	public Function(String label, List<String> parameters, List<Statement> statements) {
		this.name = label;
		this.nameLabel = new Label(name);
		this.statements = statements;
		this.parameters = parameters;
		extractLocalVariables();
	}
	
	private void extractLocalVariables() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nameLabel.toString() + "\n");
		for(int i = 0; i < statements.size(); i++){
			builder.append(statements.get(i).toString() + "\n");	
		}
		builder.append("\tret\n");
		return builder.toString();
	}
}
