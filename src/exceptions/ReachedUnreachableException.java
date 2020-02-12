package exceptions;

public class ReachedUnreachableException extends CustomException {

	public ReachedUnreachableException(String string) {
		super("Reached theoretically unreachable code:\n\t" + string);
	}

}
