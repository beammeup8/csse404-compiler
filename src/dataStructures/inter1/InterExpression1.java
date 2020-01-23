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

}
