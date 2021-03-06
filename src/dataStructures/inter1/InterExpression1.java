package dataStructures.inter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.OpType;
import dataStructures.simpleInter.Operation;
import dataStructures.simpleInter.Statement;
import exceptions.CustomException;
import exceptions.IncompatibleTypeException;

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
			return OpType.NOT;
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
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) throws CustomException {
		if (a != null) {
			a.populateSymbolTable(parent, classMap);
		}
		b.populateSymbolTable(parent, classMap);
		String aType = null;
		if (a != null) {
			aType = a.getType();
		}
		String bType = b.getType();
		switch (op) {
		case EQ:
		case NEQ:
			if (!aType.equals(bType)) {
				throw new IncompatibleTypeException(aType + "and " + bType);
			}
			break;
		case AND:
		case OR:
			if (!aType.equals(bType)) {
				throw new IncompatibleTypeException(aType + "and " + bType);
			}
		case NOT:
			if (!bType.equals("boolean")) {
				throw new IncompatibleTypeException("operand not boolean");
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
			if (!aType.equals(bType)) {
				throw new IncompatibleTypeException(aType + "and " + bType);
			}
		case NEG:
			if (!bType.equals("int")) {
				throw new IncompatibleTypeException("operand not integer");
			}
			break;
		}

	}

	@Override
	public String getType() {
		switch (op) {
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

	@Override
	public List<Statement> toStatementList() {
		List<Statement> stmt = new ArrayList<>();
		String labelA = "";
		if(a != null){
			stmt.addAll(a.toStatementList());
			labelA = a.getId();
		}
		stmt.addAll(b.toStatementList());
		stmt.add(new Operation(labelA, b.getId(), id, op));
		return stmt;
	}

}
