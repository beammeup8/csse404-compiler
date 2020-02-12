package dataStructures.x86;

public class Command {

	public String label, param1, param2;
	public CommandType type;

	private Command(String label, CommandType op, String reg1, String reg2) {
		this.label = label;
		this.type = op;
		this.param1 = reg1;
		this.param2 = reg2;
	}
	
	public Command(CommandType op, String reg1, String reg2) {
		this(null, op, reg1, reg2);
	}
	
	public Command(String label) {
		this(label, CommandType.LABEL, null, null);
	}
	
	public Command(CommandType op, String reg1) {
		this(null, op, reg1, null);
	}
	
	@Override
	public String toString() {
		if(label != null){
			return label + ":";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("\t");
		builder.append(type.toString());
		builder.append(" ");
		if(param1 != null){
			builder.append(param1);
		}
		if(param2 != null){
			builder.append(", ");
			builder.append(param2);
		}
		return builder.toString();
	}
	
}
