package by.javatr.task4;

public class Friend {
    public static void find(int a, int b){
        for(int i = a; i < b + 1; i++){
            for (int j = i + 1; j < b + 1; j++){
                if (div(a) == b && div(b) == a)
                    System.out.println(i + " and " + j);
            }
        }
    }
    public static int div(int n){
        int d = 0;
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                d += i;
            }
        }
        return d;
    }
}
