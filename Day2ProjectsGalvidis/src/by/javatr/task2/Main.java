package by.javatr.task2;

import by.javatr.scanner.Input;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            Random random = new Random();
            int num = random.nextInt(1_999_999) + 1;
            System.out.println("The first number is: " + num);
            System.out.println("Choose the unit: \n 1)Find the greatest number of a natural number" +
                    " \n 2)Check whether the given natural number is a palindrome" +
                    " \n 3)Determine whether a given natural number is simple" +
                    " \n 4)Find all simple divisors of a given natural number" +
                    " \n 5)Find the GCD and the LCM of two natural numbers A and B" +
                    " \n 6)Find the number of different digits for a given natural number" +
                    " \n 7)Exit ");
            int chosen = Input.scannerInt();
            switch (chosen){
                case 1: {
                    int res1 = Number.greatest(num);
                    System.out.println("The the greatest number is " + res1);
                    break;
                }
                case 2: {
                    boolean res2 = Palindrom.is(num);
                    System.out.println("The number is" + ((res2)? " " :" not ") + "a palindrome");
                    break;
                }
                case 3: {
                    boolean res3 = Simple.div(num);
                    System.out.println("The number is" + ((res3)? " " :" not ") + "simple");
                    break;
                }
                case 4: {
                    Divide.simple(num);
                    break;
                }
                case 5: {
                    int num1 = random.nextInt(1_999_999) + 1;
                    System.out.println("The first number is: " + num1);
                    int res5_1 = Simular.gcd(num, num1);
                    int res5_2 = Simular.lcm(num, num1);
                    System.out.println("The GCD is " + res5_1 + "\n The LCM is" +res5_2);
                    break;
                }
                case 6: {
                    double res6 = Differ.amount(num);
                    System.out.println("The amount of different numbers is " + res6);
                    break;
                }
                default: break;
            }
            System.out.println("Do you want to exit? \n0 - Yes \n1 - No");
            i = Input.scannerInt();
        }
    }
}
