package by.javatr.task5;

public class Average {
    public static double arithmetic(int a, int k) {
        double result = 0;
        for(int i = 0; i < k; i++){
            result += a % 10;
            a /= 10;
        }
        result /= k;
        return result;
    }
    public static double geometric(int b, int k) {
        double result = 1;
        for(int i = 0; i < k; i++){
            result *= b % 10;
            b /= 10;
        }
        result = Math.pow(result, 1. / 6);
        return result;
    }
}
