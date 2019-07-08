package by.javatr.task4;

public class Sequence {
    public static int check(int a, int k) {
        int b = 0;
        int result;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < k; i++){
            if(i != 0 && b > a % 10){
                count1++;
            } else if (i != 0 && b < a % 10){
                count2++;
            }
            b = a % 10;
            a /= 10;
        }
        if(count1 == 3){
            result = 1;
        } else if(count2 == 3){
            result = 2;
        } else {
            result = 0;
        }
        return result;
    }
}
