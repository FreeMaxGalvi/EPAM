package by.epam.javatraining.maksim.chef.myexception;

/**
 * This is class SaladException, it throws exceptions for working with objects
 * of the Plane class.
 * 
 * @author Vitaly Kononov
 * @since 08-08-2019
 * @version 1.0
 */
public class SaladException extends Exception {

	private static final long serialVersionUID = -8836383675376745480L;

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
