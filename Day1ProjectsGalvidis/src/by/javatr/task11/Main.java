package by.javatr.task11;

import by.javatr.scanner.Input;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            System.out.println("Input date ");
            short day = Input.scannerShort();
            short month = Input.scannerShort();
            short year = Input.scannerShort();
            System.out.println("The date is " + day+ "." + month + "." + year);
            day = Date.day(day, month, year);
            if(day == 1){
                month = Date.month(month);
            }
            if(month == 1){
                year = Date.year(year);
            }
            System.out.println("The next date is " + day+ "." + month + "." + year);
            System.out.println("Do you want to exit? \n0 - Yes \n1 - No");
            i = Input.scannerInt();
        }
    }
}
