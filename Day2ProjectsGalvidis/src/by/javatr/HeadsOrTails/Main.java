package by.javatr.HeadsOrTails;

import by.javatr.scanner.Input;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            System.out.println("Program Heads or Tails: ");
            int k = 1000;
            int res = Coin.lift(k);
            System.out.println("Heads: " + res + "\nTails: " + (1000 - res));
            System.out.println("Do you want to exit? \n0 - Yes \n1 - No");
            i = Input.scannerInt();
        }
    }
}
