package dataStructures.inter1;

import dataStructures.simpleInter.OpType;

public class InterExpression1 implements IInterExpression1 {
	private IInterExpression1 a, b;
	private OpType op;
	private String id;

	public InterExpression1(IInterExpression1 a, String op, IInterExpression1 b) {
		this.a = a;
		this.b = b;
		this.op = getOpType(op);

		id = IdGenerator.getUniqueId();
	}

	private OpType getOpType(String op2) {
		if (op2.equals("<=")) {
			return OpType.LSE;
		}
		if (op2.equals(">=")) {
			return OpType.GRE;
		}
		if (op2.equals("==")) {
			return OpType.EQ;
		}
		if (op2.equals("!=")) {
			return OpType.NEQ;
		}
		if (op2.equals("&&")) {
			return OpType.AND;
		}
		if (op2.equals("||")) {
			return OpType.OR;
		}
		switch (op2.charAt(0)) {
		case '+':
			return OpType.ADD;
		case '-':
			if (a == null) {
				return OpType.NEG;
			}
			return OpType.SUB;
		case '*':
			return OpType.MULT;
		case '/':
			return OpType.DIV;
		case '!':
			return OpType.NEG;
		case '<':
			return OpType.LST;
		case '>':
			return OpType.GRT;
		}
		return null;
	}

	public InterExpression1(String op, IInterExpression1 b) {
		this(null, op, b);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Expression: {");
		if (a != null) {
			builder.append("a: ");
			builder.append(a.toString());
			builder.append(", ");
		}
		builder.append("op: ");
		builder.append(op);
		builder.append(", ");
		builder.append("b: ");
		builder.append(b.toString());
		builder.append("}");
		return builder.toString();
	}
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void populateSymbolTable(SymbolTable parent) {
		if(a != null){
			a.populateSymbolTable(parent);
		}
		b.populateSymbolTable(parent);
		String aType = null;
		if(a != null){
			aType = a.getType();
		}
		String bType = b.getType();
		switch(op){
		case EQ:
		case NEQ:
			if(!aType.equals(bType)){
				System.err.println("Incompatible type equality: " + aType + " and " + bType);
				System.exit(0);
			}
			break;
		case AND:
		case OR:
			if(!aType.equals(bType)){
				System.err.println("Incompatible types: " + aType + " and " + bType);
				System.exit(0);
			}
		case NOT:
			if(!bType.equals("boolean")){
				System.err.println("Incompatible types: operand not boolean");
				System.exit(0);
			}
			break;
		case GRE:
		case GRT:
		case LSE:
		case LST:
		case ADD:
		case SUB:
		case DIV:
		case MULT:
			if(!aType.equals(bType)){
				System.err.println("Incompatible type equality: " + aType + " and " + bType);
				System.exit(0);
			}
		case NEG:
			if(!bType.equals("int")){
				System.err.println("Incompatible types: operand not integer");
				System.exit(0);
			}
			break;
		}
		
	}
	
	@Override
	public String getType() {
		switch(op){
		case AND:
		case EQ:
		case GRE:
		case GRT:
		case LSE:
		case LST:
		case NEQ:
		case NOT:
		case OR:
			return "boolean";
		case ADD:
		case SUB:
		case DIV:
		case MULT:
		case NEG:
			return "int";
		}
		return null;
	}

}
