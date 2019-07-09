package by.javatr.task3;

import by.javatr.scanner.Input;

public class Main {
    public static void main(String[] args) {
            System.out.println("Program check: ");
            boolean k1 = Perfect.dividers(6);
            boolean k2 = Perfect.dividers(9);
            boolean k3 = Perfect.dividers(28);
            boolean k4 = Perfect.dividers(496);
            boolean k5 = Perfect.dividers(2345);
            boolean k6 = Perfect.dividers(8128);
            System.out.println("Test1 is: " + k1 + "\nTest2 is: " + k2 +"Test3 is: " + k3 + "\nTest4 is: " + k4 +
                    "Test5 is: " + k5 + "\nTest6 is: " + k6);
    }
}
