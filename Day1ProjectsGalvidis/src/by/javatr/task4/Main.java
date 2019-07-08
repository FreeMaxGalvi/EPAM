package by.javatr.task4;

import by.javatr.scanner.Input;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            System.out.println("Input number ");
            int num = Input.scannerInt();
            int res = Sequence.check(num, 4);
            if (res == 0) {
                System.out.println("Numbers has no numeral sequence");
            } else if(res == 1){
                System.out.println("Numbers has numeral increasing sequence");
            } else {
                System.out.println("Numbers has numeral decreasing sequence");
            }
            System.out.println("Do you want to exit? \n0 - Yes \n1 - No");
            i = Input.scannerInt();
        }
    }
}
