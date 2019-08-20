package by.epam.javatraining.maksim.chef.myexception;

public class SaladException extends Exception {

	private static final long serialVersionUID = -64748299290L;

	public SaladException(String message) {
		super(message);
	}

	public SaladException(String message, Throwable arg) {
		super(message, arg);
	}

	public SaladException(Throwable arg) {
		super(arg);
	}
}
