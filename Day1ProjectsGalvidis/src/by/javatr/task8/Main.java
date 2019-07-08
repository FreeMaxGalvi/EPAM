package by.javatr.task8;

import by.javatr.scanner.Input;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            System.out.println("Input coordinates ");
            int A_x = Input.scannerInt();
            int A_y = Input.scannerInt();
            int B_x = Input.scannerInt();
            int B_y = Input.scannerInt();
            int C_x = Input.scannerInt();
            int C_y = Input.scannerInt();
            int res = Coordinates.triangle(A_x, A_y, B_x, B_y, C_x, C_y);
            if(res == 0){
                System.out.println("These points are not vertices of a triangle ");
            } else if(res == 1){
                System.out.println("The given points are the vertices of the triangle, but the triangle is not rectangular ");
            } else {
                System.out.println("These points are vertices of a triangle and the triangle is rectangular");
            }
            System.out.println("Do you want to exit? \n0 - Yes \n1 - No");
            i = Input.scannerInt();
        }
    }
}
