package by.javatr.task8;

public class Coordinates {
    public static int triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        int result = 0;
        double a = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 1./2);
        double b = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 1./2);
        double c = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 1./2);
        if(a + b > c && a + c > b && b + c > a){
            result++;
            a = Math.pow(a, 2);
            b = Math.pow(b, 2);
            c = Math.pow(c, 2);
            if(a + b == c || a + c == b || b + c == a){
                result++;
            }
        }
        return result;
    }
}
