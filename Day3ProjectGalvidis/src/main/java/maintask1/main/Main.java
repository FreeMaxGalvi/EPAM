package maintask1.main;

import java.io.FileInputStream;
import java.util.Arrays;

import creation.Сreate;
import maintask1.utils.*;
import org.apache.logging.log4j.*;
import scanner.Input;

public class Main {
    private static double[] array ;

    private static Logger logger = LogManager.getLogger();

    /**
     * This is the main method that is used to call all methods of the first task
     *
     * @args - string array containing the command line arguments
     */
    public static void main (String[] args) {

        // Task 1
        int i = 1;
        while (i == 1) {


            System.out.println("Please enter the size of your array: ");
            int size = Input.scannerInt();
            array = Сreate.Array(size);
            int right = array.length - 1;
            int left = 0;
            System.out.println("Your array is: " + Arrays.toString(array));

            Indexes.findExtrem(array, logger);//this method find the extrems of the array
            Search.findAvg(array, logger);//this method find the arithmetic and geometric mean
            Order.isStream(array, logger);//this method check is all the elements of array are in order
            Search.findLocalExtrem(array, logger);// this method find a local extrems
            System.out.println("Please enter the number you want to find: ");
            double number = Input.scannerDouble();

            Change.reverseArray(array, logger);// this method is reversing array

            System.out.println("Choose the unit: \n 1)Linear search" +
                    " \n 2)Binary search" +
                    " \n 3)Exit ");
            int chosen = Input.scannerInt();
            switch (chosen){
                case 1: {
                    System.out.println("Your number is in " + Search.linear(array,number, logger) + " cell");
                    /*
                    * this is the method of linear search in the array
                    *
                    * */
                    break;
                }
                case 2: {
                    System.out.println("Before using the binary search your array should be sorted: " +
                            "\n 1)Quick sort" +
                            " \n 2)Merge sort" +
                            " \n 3)Selection sort " +
                            " \n 4)Insertion sort" +
                            " \n 5)Bubble sort" +
                            " \n 6)Exit");
                    int decision = Input.scannerInt();
                    switch(decision){
                        case 1: {
                            Sort.quick(array, left, right, logger);//method of quick sort
                            break;
                        }
                        case 2: {
                            Sort.merge(array, left, right, logger);//method of merge sort
                            break;
                        }
                        case 3: {
                            Sort.selection(array, logger);//method of selection sort
                            break;
                        }
                        case 4: {
                            Sort.insertion(array, logger);//method of insertion sort
                            break;
                        }
                        case 5: {
                            Sort.bubble(array, logger);//method of bubble sort
                            break;
                        }
                        default: {
                            break;
                        }
                    }
                    System.out.println("Your number is in " + Search.binary(array, left, right, number, logger) +
                            " cell");
                    /*
                     * this is the method of binary search in the array
                     *
                     * */
                    break;
                }
                default: break;
            }
            System.out.println("Do you want to exit? \n0 - Yes \n1 - No");
            i = Input.scannerInt();
        }



    }
}
