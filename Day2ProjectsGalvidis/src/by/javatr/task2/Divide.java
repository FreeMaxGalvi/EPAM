package by.javatr.task2;

public class Divide {
    public static void simple(int a) {
        double b = Math.pow(a, 0.5);
        for (int i = 2; i <= b; ++i){
            if (Simple.div(i)) {
                if (a % i == 0) {
                    System.out.println(i);
                }
            }
        }
        if (Simple.div(a)){
            System.out.println(a);
        }
    }
}
