package by.javatr.task6;

import by.javatr.scanner.Input;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            System.out.println("Input number ");
            int num = Input.scannerInt();
            int res = Invert.sev(num, 7);
            System.out.println("Inverted seven-digit number is " + res);
            System.out.println("Do you want to exit? \n0 - Yes \n1 - No");
            i = Input.scannerInt();
        }
    }
}
