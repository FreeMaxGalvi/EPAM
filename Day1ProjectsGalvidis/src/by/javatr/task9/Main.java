package by.javatr.task9;

import by.javatr.scanner.Input;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            System.out.println("Input age ");
            int age = Input.scannerInt();
            int res1 = Dragon.head(age, 300, 200, 3, 2, 1);
            int res2 = Dragon.eyes(res1);
            System.out.println("In the age of " + age + " years dragon has " + res1 + " heads and " + res2 + " eyes");
            System.out.println("Do you want to exit? \n0 - Yes \n1 - No");
            i = Input.scannerInt();
        }
    }
}
