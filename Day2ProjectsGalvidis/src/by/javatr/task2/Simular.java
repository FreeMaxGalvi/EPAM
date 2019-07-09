package by.javatr.task2;

public class Simular {
    public static int gcd(int a, int b) {
        return lgc(a, b);
    }
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    public static int lgc(int n1, int n2) {
        if (n2 == 0){
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
}
