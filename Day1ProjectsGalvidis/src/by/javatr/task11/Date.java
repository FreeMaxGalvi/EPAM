package by.javatr.task11;

public class Date {
    public static short day(short a, short b, short c) {
        short max;
        switch (b) {
            case 4:
            case 6:
            case 9:
            case 11:
                max = 30;
                break;
            case 2:
                max =(short) ((leap(c)) ? 29 : 28);
                break;
            default: max = 31;
        }
        if(a < max){
            a++;
        } else {
            a = 1;
        }
        return a;
    }
    public static short month(short a) {
        if(a < 12){
            a++;
        } else {
            a = 1;
        }
        return a;
    }
    public static short year(short a) {
        a++;
        return a;
    }
    private static boolean leap(int b) {
        if (b % 400 == 0) {
            return true;
        } else if (b % 4 != 0) {
            return false;
        } else {
            return b % 100 != 0;
        }
    }
}
