package by.javatr.task2;

public class Convertion {
    public static double gramms(double a) {
        double result = a * 1000;
        return result;
    }
    public static double mgramms(double a) {
        double result = a * 1_000_000;
        return result;
    }
    public static double tons(double a) {
        double result = a / 1000;
        return result;
    }
}
