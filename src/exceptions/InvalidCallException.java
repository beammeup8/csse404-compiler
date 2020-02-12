package exceptions;

public class InvalidCallException extends CustomException {

	public InvalidCallException(String string) {
		super("Invalid call detected:\n\t" + string);
	}

}
