package scanner;

import java.util.Scanner;

public class Input {

    public static int scannerInt() {
        Scanner s = new Scanner(System.in);
        int result = s.nextInt();
        return result;
    }

    public static double scannerDouble() {
        Scanner s = new Scanner(System.in);
        double result = s.nextDouble();
        return result;
    }
}
