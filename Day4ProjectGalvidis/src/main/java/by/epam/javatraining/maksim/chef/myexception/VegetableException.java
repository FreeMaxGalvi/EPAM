package by.epam.javatraining.maksim.chef.myexception;

public class VegetableException extends Exception{

    private static final long serialVersionUID = -2822948820L;

    public VegetableException(String message) {
        super("wrong vegetable type: ");
    }

    public VegetableException(String message, Throwable arg) {
        super(message, arg);
    }

    public VegetableException(Throwable arg) {
        super(arg);
    }
}
