package creation;

import java.util.Random;

public class Сreate {
    /**
     * This method creates given one-dimensional array for class
     * Main. package maintask1.
     *
     * @return the given array
     */
    private static Random random = new Random();
    public static double[] Array(int num) {

        double[] array = new double[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }

    /**
     * This method creates given one-dimensional matrix for class
     * Main. package maintask2.
     *
     * @return the given matrix
     */
    public static double[][] Matrix(int num1) {

        double[][] matrix = new double[num1][num1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(101);
            }
        }
        return matrix;
    }

}
