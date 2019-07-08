package by.javatr.task9;

public class Dragon {
    public static int head(int a, int k, int g, int h, int m, int n) {
        int result = 0;
        if(a > k){
            result = (a - k) * n + (k - g) * m + g * h + h;
        } else if(a <= k && a > g){
            result = (a - g) * m + g * h + h;
        } else if (a <= g && a > -1){
            result = a * h + h;
        }
        return result;
    }
    public static int eyes(int b) {
        return b * 2;
    }
}
