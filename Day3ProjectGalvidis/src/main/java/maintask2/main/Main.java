package maintask2.main;

import java.util.Arrays;

import creation.Сreate;
import maintask2.utils.*;
import org.apache.logging.log4j.*;
import scanner.Input;

public class Main {

    private static double[][] matrix;
    private static Logger logger = LogManager.getLogger();

    /**
     * This is the main method that is used to call all methods of the second task
     *
     * @args - string array containing the command line arguments
     */

    public static void main(String[] args) {

        // Task 1
        int i = 1;
        while (i == 1) {

            System.out.println("Please enter the size of your matrix: ");
            int size = Input.scannerInt();
            int size_help = size - 1;
            matrix = Сreate.Matrix(size);
            System.out.println("Your matrix is: ");
            for (int k = 0; k < size_help; k++) {
                System.out.println(Arrays.toString(matrix[k]));
            }
            Values.findExtrem(matrix, logger);//this method find extrems of the matrix
            Search.avg(matrix, logger);//this method find the arithmetic and geometric mean
            Diagonals.isSymetric(matrix, logger);//this method check is diagonals of the matrix are symetric
            Local.findLocalExtrem(matrix, logger);//this method find a local extrems
            Transport.matrix(matrix, logger);//this method transport the matrix


        }
    }
}
