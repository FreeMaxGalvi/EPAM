package by.javatr.task2;

public class Palindrom {
    public static boolean is(int a) {
        int b = 0;
        int c= a;
        boolean result = false;
        while (a != 0){
            b = ((b * 10) + (a % 10));
            a /= 10;
        }
        if(b == c){
            result = true;
        }
        return result;
    }
}
