package by.javatr.task1;

import by.javatr.scanner.Input;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            System.out.println("Input 'a' ");
            int a = Input.scannerInt();
            System.out.println("Input 'b' ");
            int b = Input.scannerInt();
            System.out.println("Input 'c' ");
            int c = Input.scannerInt();
            int res = Differ.dif(a, b, c);
            if (res == 0) {
                System.out.println("Numbers are not similar");
            } else {
                System.out.println("Numbers are similar");
            }
            System.out.println("Do you want to exit? \n0 - Yes \n1 - No");
            i = Input.scannerInt();
        }
    }
}
