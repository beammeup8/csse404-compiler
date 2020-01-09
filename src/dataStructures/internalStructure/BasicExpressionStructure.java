package dataStructures.internalStructure;

public class BasicExpressionStructure extends AbstractStructure {
	private enum Op {
		plus, minus, mult, div, and, or, not;
	}

	private Op op;
	private AbstractStructure a, b;

	public BasicExpressionStructure(String symbol, AbstractStructure a, AbstractStructure b) {
		this.a = a;
		this.b = b;
		if (symbol.equals("+")) {
			op = Op.plus;
		} else if (symbol.equals("-")) {
			op = Op.minus;
		} else if (symbol.equals("*")) {
			op = Op.mult;
		} else if (symbol.equals("/")) {
			op = Op.div;
		} else if (symbol.equals("&&")) {
			op = Op.and;
		} else if (symbol.equals("||")) {
			op = Op.and;
		} else if(symbol.equals("!")){
			op = Op.not;
			this.b = null;
		}
	}

	private String getSymbol() {
		switch (op) {
		case div:
			return "/";
		case minus:
			return "-";
		case mult:
			return "*";
		case plus:
			return "+";
		case and:
			return "&&";
		case or:
			return "||";
		case not:
			return "!";	
		default:
			break;

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
