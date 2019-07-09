package by.javatr.task2;

public class Number {
    public static int greatest(int a) {
        int b;
        int result = 0;
        while (a != 0){
            b = a % 10;
            a /= 10;
            if(result < b){
                result = b;
            }
        }
        return result;
    }
}
