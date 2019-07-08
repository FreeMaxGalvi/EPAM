package by.javatr.task10;

import by.javatr.scanner.Input;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            System.out.println("Input symbol ");
            char sym = Input.scannerChar();
            int res = 0;
            System.out.println("Choose the unit: \n 1)first check \n 2)second check \n 3)third check " +
                    "\n 4)fourth check \n 5)exit");
            int chosen = Input.scannerInt();
            switch (chosen){
                case 1: {
                    res = Check.first(sym);
                    break;
                }
                case 2: {
                    res = Check.second(sym);
                    break;
                }
                case 3: {
                    res = Check.third(sym);
                    break;
                }
                case 4: {
                    res = Check.fourth(sym);
                    break;
                }
                default: {

                    res = 3;
                    break;
                }
            }
            if(res == 1){
                System.out.println("The character entered is a vowel ");
            } else if(res == 0){
                System.out.println("The character entered is not a vowel ");
            }
            System.out.println("Do you want to exit? \n0 - Yes \n1 - No");
            i = Input.scannerInt();
        }
    }
}
