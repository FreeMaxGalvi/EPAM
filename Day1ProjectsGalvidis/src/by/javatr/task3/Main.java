package by.javatr.task3;

import by.javatr.scanner.Input;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            System.out.println("Input R1 ");
            int r1 = Input.scannerInt();
            System.out.println("Input R2 ");
            int r2 = Input.scannerInt();
            double res = Area.sqr(r1, r2);
            System.out.println("The area of ring is " + res);
            System.out.println("Do you want to exit? \n0 - Yes \n1 - No");
            i = Input.scannerInt();
        }
    }
}
