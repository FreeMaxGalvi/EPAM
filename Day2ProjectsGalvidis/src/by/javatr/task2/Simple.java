package by.javatr.task2;

public class Simple {
    public static boolean div(int a) {
        int b = 0;
        boolean result = false;
        double help = Math.pow(a, 0.5);
        for(int i = 2; i <= help; i++){
            if((a % i) == 0){
                b++;
            }
        }
        if(b == 0){
            result = true;
        }
        return result;
    }
}
