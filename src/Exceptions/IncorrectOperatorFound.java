package Exceptions;


public class IncorrectOperatorFound extends CustomException {

	public IncorrectOperatorFound(String symbol) {
		super("Incorrect Operator Found: " + symbol);
	}

}
