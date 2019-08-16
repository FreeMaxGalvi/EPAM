package by.epam.javatraining.maksim.chef.myexception;

public class VegetableException extends Exception{

    private static final long serialVersionUID = -8836383675376745480L;

    public VegetableException(String message) {
        super(message);
    }

    public VegetableException(String message, Throwable arg) {
        super(message, arg);
    }

    public VegetableException(Throwable arg) {
        super(arg);
    }
}
