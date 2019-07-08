package by.javatr.task5;

import by.javatr.scanner.Input;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            System.out.println("Input number ");
            int num = Input.scannerInt();
            double res1 = Average.arithmetic(num, 6);
            double res2 = Average.geometric(num, 6);
            System.out.println("The average arithmetic is " + res1);
            System.out.println("The average geometric is " + res2);
            System.out.println("Do you want to exit? \n0 - Yes \n1 - No");
            i = Input.scannerInt();
        }
    }
}
