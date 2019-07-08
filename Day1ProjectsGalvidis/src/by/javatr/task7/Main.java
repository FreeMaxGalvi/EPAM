package by.javatr.task7;

import by.javatr.scanner.Input;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            System.out.println("Input numbers ");
            int A = Input.scannerInt();
            int B = Input.scannerInt();
            System.out.println("A is " + A);
            System.out.println("B is " + B);
            A *= B;
            B = A / B;
            A = A / B;
            System.out.println("Now A is " + A);
            System.out.println("Now B is " + B);
            System.out.println("Do you want to exit? \n0 - Yes \n1 - No");
            i = Input.scannerInt();
        }
    }
}
