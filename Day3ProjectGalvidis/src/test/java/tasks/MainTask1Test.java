package tasks;

import maintask1.utils.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTask1Test {
    private static Logger logger = LogManager.getLogger();
    private static String getNumsFromString(String str){
        return str.replaceAll("[^-?0-9*.?0-9?]+", " ");        // extracting all numbers
        /*
         * change all characters that a not a part of number to whitespace
         * result is usually like:
         * whitespace in the beginning and the end of the string
         * numbers are derived with a whitespace as well
         * example: " 0 1 2 3 "
         * double values use point
         * example: " 1.0 2.0 "
         */
    }

    @Test
    public void linearSearch() {
        double[] arr = {4, 34, 5, 9, 0, 2, 7, 14, 198 };
        int res = Search.linear(arr,7, logger);
        assertEquals(6, res);
    }

    @Test
    public void binarySearch() {
        double[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 13, 14, 15};
        int res = Search.binary(arr,0, arr.length,7, logger);
        assertEquals(7, res);
    }

    @Test
    public void reverseArray() {
        double[] arr_1 = {3, 6, 2, 8, 0, 7, 13, 9};
        double[] exp_1 = {9, 13, 7, 0, 8, 2, 6, 3};
        Change.reverseArray(arr_1, logger);
        assertArrayEquals(exp_1, arr_1,0);
        double[] arr_2 = {1, 2, 3, 4};
        double[] exp_2 = {1, 2, 3, 4};
        Change.reverseArray(arr_2, logger);
        Change.reverseArray(arr_2, logger);
        assertArrayEquals(exp_2, arr_2,0);
    }

    @Test
    public void bubbleSort() {
        double[] arr = {8, 4, 7, 6, 1, 2, 5, 9, 3};
        double[] exp = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Sort.bubble(arr, logger);
        assertArrayEquals(exp,arr,0);
    }

    @Test
    public void insertionSort() {
        double[] arr = {8, 4, 7, 6, 1, 2, 5, 9, 3};
        double[] exp = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Sort.insertion(arr, logger);
        assertArrayEquals(exp, arr,0);
    }

    @Test
    public void selectionSort() {
        double[] arr = {8, 4, 7, 6, 1, 2, 5, 9, 3};
        double[] exp = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Sort.selection(arr, logger);
        assertArrayEquals(exp, arr,0);
    }

    @Test
    public void mergeSort() {
        double[] arr = {8, 4, 7, 6, 1, 2, 5, 9, 3};
        double[] exp = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Sort.merge(arr,0,arr.length-1, logger);
        assertArrayEquals(exp, arr,0);
    }

    @Test
    public void quickSort() {
        double[] arr = {8, 4, 7, 6, 1, 2, 5, 9, 3};
        double[] exp = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Sort.quick(arr,0,arr.length-1, logger);
        assertArrayEquals(exp, arr,0);
    }

    @Test
    public void findExtrema_1() {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        String res = getNumsFromString(Indexes.findExtrem(arr, logger));
        assertTrue(" 8 0 ".equals(res));
    }

    @Test
    public void findExtrema_2() {
        double[] arr = {1, 2, 3, 4, 5, 1, 6, 7, 8, 9};

        String res = getNumsFromString(Indexes.findExtrem(arr, logger));
        assertTrue(" 8 ".equals(res));
    }

    @Test
    public void findExtrema_3() {
        double[] arr = {1, 2, 3, 4, 1, 8, 7, 8};

        String res = getNumsFromString(Indexes.findExtrem(arr, logger));
        assertTrue(" ".equals(res));
    }

    @Test
    public void isStreamlined_1() {
        double[] arr = {1, 2, 3, 4, 5};

        assertTrue(Order.isStream(arr, logger));
    }

    @Test
    public void isStreamlined_2() {
        double[] arr = {8, 6, 4, 2, 1};

        assertTrue(Order.isStream(arr, logger));
    }

    @Test
    public void isStreamlined_3() {
        double[] arr = {1, 2, 9, 4, 2};

        assertFalse(Order.isStream(arr, logger));
    }

    @Test
    public void findAvg(){
        double[] arr = {1, 2, 2, 4};

        assertTrue(" 2.25 2.0 ".equals(getNumsFromString(Search.findAvg(arr, logger))));
    }

    @Test
    public void findIndexOfLocalExtrema(){
        double[] arr = {1, 2, 3, 4, 3, 5, 6};

        assertEquals(3,Search.findLocalExtrem(arr, logger));
    }
}
