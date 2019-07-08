package by.javatr.task2;

import by.javatr.scanner.Input;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            System.out.println("Input mass of dinosaur ");
            double mass = Input.scannerInt();
            System.out.println("Choose the unit: \n 1)gramms \n 2)milligramms\n 3)tons ");
            int chosen = Input.scannerInt();
            switch (chosen){
                case 1: {
                    double res1 = Convertion.gramms(mass);
                    System.out.println("The mass of dino is " + res1 + " gramm");
                    break;
                }
                case 2: {
                    double res2 = Convertion.mgramms(mass);
                    System.out.println("The mass of dino is " + res2 + " milligramm");
                    break;
                }
                case 3: {
                    double res3 = Convertion.tons(mass);
                    System.out.println("The mass of dino is " + res3 + " ton");
                    break;
                }
                default: break;
            }
            System.out.println("Do you want to exit? \n0 - Yes \n1 - No");
            i = Input.scannerInt();
        }
    }
}
