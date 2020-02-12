package exceptions;

@SuppressWarnings("serial")
public class IncorrectOperatorFound extends CustomException {

	public IncorrectOperatorFound(String symbol) {
		super("Incorrect Operator Found:\n\t" + symbol);
	}

}
