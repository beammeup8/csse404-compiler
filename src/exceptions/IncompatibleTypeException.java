package exceptions;

public class IncompatibleTypeException extends CustomException {

	public IncompatibleTypeException(String string) {
		super("Incompatible types:\n\t" + string);
	}

}
