package maintask1.utils;

import org.apache.logging.log4j.*;

import java.util.Arrays;

public class Change {
    /*
     *реверсировать все элементы вектора (при решении данного задания не
     *рекомендуется задействовать дополнительную память);
     */

    public static void swap (double[] arr, int firstIndex, int secondIndex, Logger logger){
        logger.traceEntry(Arrays.toString(arr), firstIndex, secondIndex);

        arr[firstIndex] += arr[secondIndex];
        arr[secondIndex] = arr[firstIndex] - arr[secondIndex];
        arr[firstIndex] -= arr[secondIndex];

        logger.traceExit();
    }

    public static void reverseArray(double[] arr, Logger logger) {
        logger.traceEntry(Arrays.toString(arr));

        int length = arr.length;
        int middle = length / 2;
        length--;

        for (int i = 0; i < middle; i++) {
            swap(arr, i,length - i, logger);
        }

        logger.traceExit();
    }



    public static void merge(double[] arr, int left, int middle, int right, Logger logger) {
        logger.traceEntry(Arrays.toString(arr), left, middle, right);

        int size = right - left + 1;                                        // size of a temporary array
        double[] temp = new double[size];
        int index= 0;                                                   // index for pushing in temp array

        int leftCopy = left;
        int rightPartStart = ++middle;

        right++;                                                        // not to use <=

        while (left < middle && rightPartStart < right) {               // sorting in a temp array
            if (arr[left] < arr[rightPartStart]){
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[rightPartStart++];
            }
        }

        if (left < middle) {                                  // finish sorting by adding the biggest numbers
            for (int i = left; i < middle;) {
                temp[index++] = arr[i++];
            }
        } else if (rightPartStart < right) {
            for (int i = rightPartStart; i < right;){
                temp[index++] = arr[i++];
            }
        }

        for (int i = 0; i < size; i++, leftCopy++) {                      // copying from temp array to basic
            arr[leftCopy] = temp[i];
        }

        logger.traceExit();
    }
}
