package by.javatr.HeadsOrTails;

import  java.util.Random;

public class Coin {
    public static int lift(int a) {
        int b = 0;
        int result = 0;
        Random random = new Random();
        for(int i = 0; i < a; i++){
            b = random.nextInt(2);
            if(b == 1){
                result++;
            }
        }
        return result;
    }
}
