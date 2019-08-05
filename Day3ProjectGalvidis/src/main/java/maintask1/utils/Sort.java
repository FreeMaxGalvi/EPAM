package maintask1.utils;

import org.apache.logging.log4j.*;

import java.util.Arrays;
public class Sort {
    /*
     *реализовать несколько алгоритмов сортировок элементов вектора по
     *возрастанию и убыванию (рекомендуется для реализации как минимум
     *следующие: сортировка обменом или пузырьковая сортировка (bubble sort), а
     *также её улучшенные версии; сортировка вставками (insertion sort); сортировка
     *выбором (selection sort); сортировка слиянием (merge sort) и быстрая сортировка
     *(quick sort).
     */

    public static void bubble(double[] arr, Logger logger) {
        logger.traceEntry(Arrays.toString(arr));

        int length = arr.length - 1;
        int border;

        for (int i = 0; i < length; i++){
            border = length - i;                            // not to sort sorted part
            for (int j = 0; j < border; j++){
                if (arr[j] > arr[j+1]){
                    Change.swap(arr, j,j+1, logger);
                }
            }
        }

        logger.traceExit();
    }

    public static void insertion(double[] arr, Logger logger) {
        logger.traceEntry(Arrays.toString(arr));

        double el;
        int inner;

        for (int outer = 1; outer < arr.length; outer++){
            el = arr[outer];
            inner = 0;

            while (el > arr[inner]){                        // finding the index where el should be
                inner++;
            }

            if (inner < outer){                             // check if it is in sorted part
                for (int i = outer; i > inner;){        // pushing the array to place our element
                    Change.swap(arr,i,--i, logger);
                }
            }
        }

        logger.traceExit();
    }

    public static void selection(double[] arr, Logger logger) {
        logger.traceEntry(Arrays.toString(arr));

        double min;                                             // min value
        int minIndex;                                           // index of min value

        int border = arr.length - 1;
        for (int i = 0; i < border; i++) {
            min = arr[i];
            minIndex = i;

            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Change.swap(arr, i, minIndex, logger);
            }
        }

        logger.traceExit();
    }

    public static void merge(double[] arr, int left, int right, Logger logger){
        logger.traceEntry(Arrays.toString(arr), left, right);

        int length = right - left;

        if (length == 1) {                                              // sorting if array length = 2, too
            // not so hard to make another function
            if (arr[left] > arr[right]){
                Change.swap(arr, left, right, logger);
            }

        } else if (length > 1) {

            int middle = (left + right) / 2;

            logger.trace("go left");
            merge(arr, left, middle, logger);                             // sorting left part
            logger.trace("go right");
            merge(arr,middle + 1, right, logger);                     // sorting right part

            Change.merge(arr, left, middle, right, logger);                           // merging halfs
            logger.trace("merged");
        }

        logger.traceExit();
    }

    public static void quick (double[] arr, int left, int right, Logger logger) {
        logger.traceEntry(Arrays.toString(arr), left, right);

        int i = left;
        int j = right;

        double midEl = arr[(left+right) / 2];

        do {
            while (arr[i] < midEl) {
                i++;
            }
            while (arr[j] > midEl) {
                j--;
            }

            if (i <= j) {
                if (i != j){
                    Change.swap(arr, i, j, logger);
                }
                i++;
                j--;
            }

        } while (i < j);

        if (i < right) {
            logger.trace("go right");
            quick(arr, i, right, logger);
        }
        if (j > left) {
            logger.trace("go left");
            quick(arr, left, j, logger);
        }

        logger.traceExit();
    }

}
