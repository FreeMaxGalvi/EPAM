package by.javatr.scanner;

import java.util.Scanner;

public class Input {
    public static int scannerInt() {
        Scanner s = new Scanner(System.in);
        int result = s.nextInt();
        return result;
    }
    public static char scannerChar() {
        Scanner a = new Scanner(System.in);
        char symbol = a.next().charAt(0);
        return symbol;
    }
    public static short scannerShort() {
        Scanner s = new Scanner(System.in);
        short result = s.nextShort();
        return result;
    }
}
