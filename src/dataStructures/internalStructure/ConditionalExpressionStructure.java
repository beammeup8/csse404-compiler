package dataStructures.internalStructure;

public class ConditionalExpressionStructure extends AbstractStructure {
	private enum Op {
		greaterThan, lessThan, equal, notEqual, greaterEqual, lessEqual;
	}

	private Op op;
	private AbstractStructure a, b;

	public ConditionalExpressionStructure(String symbol, AbstractStructure a, AbstractStructure b) {
		if (symbol.equals(">")) {
			op = Op.greaterThan;
		} else if (symbol.equals("<")) {
			op = Op.lessThan;
		} else if (symbol.equals("==")) {
			op = Op.equal;
		} else if (symbol.equals("!=")) {
			op = Op.notEqual;
		} else if (symbol.equals(">=")) {
			op = Op.greaterEqual;
		} else if (symbol.equals("<=")) {
			op = Op.lessEqual;
		}
		this.a = a;
		this.b = b;
	}

	private String getSymbol() {
		switch (op) {
		case equal:
			return "==";
		case greaterEqual:
			return ">=";
		case greaterThan:
			return ">";
		case lessEqual:
			return "<=";
		case lessThan:
			return "<";
		case notEqual:
			return "!=";

		}
		return null;
	}

	@Override
	public String toString() {
		return a.toString() + getSymbol() + b.toString();
	}

	@Override
	public String tox86() {
		// TODO Auto-generated method stub
		return null;
	}

}
