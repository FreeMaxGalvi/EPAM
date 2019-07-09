package by.javatr.task3;

public class Perfect {
    public static boolean dividers(int a){
        boolean result = false;
        int b = 0;
        for (int i = 1; i < a; i++){
            if (a % i == 0){
                b += i;
            }
        }
        if(b == a){
            result = true;
        }
        return result;
    }
}
