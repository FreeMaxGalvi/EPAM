package by.javatr.task6;

public class Invert {
    public static int sev(int a, int k) {
        int result = 0;
        for(int i = 0; i < k; i++){
            result += (a % 10) * Math.pow(10, k - i - 1);
            a /= 10;
        }
        return result;
    }
}
