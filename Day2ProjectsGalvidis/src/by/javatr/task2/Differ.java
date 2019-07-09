package by.javatr.task2;

public class Differ {
    public static int amount(int a) {
        int result = 0;
        for(int i = 0; i < 10; i++) {
            for(int num = a; num != 0; num /= 10) {
                if (num % 10 == i) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
