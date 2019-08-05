package maintask1.utils;

import org.apache.logging.log4j.*;

import java.util.Arrays;

public class Indexes {

    /*
     *найти индекс экстремального значения (минимальный и максимальный
     *элементы) данного вектора, если таких элементов нет, то возвратить -1;
     */
    private static int indexOfMaxElement(double[] arr, Logger logger) {
        logger.traceEntry(Arrays.toString(arr));

        if (arr.length != 0) {

            int maxIndex = 0;
            double maxEl = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (maxEl < arr[i]) {
                    maxEl = arr[i];
                    maxIndex = i;
                } else if (maxEl == arr[i]) {
                    maxIndex = -1;
                }
            }

            if (maxIndex == -1) {
                logger.error("There is at least 2 equal max values");
            }

            return logger.traceExit(maxIndex);

        } else {
            logger.error("Array should not be empty!");
            return logger.traceExit(-1);
        }
    }

    private static int indexOfMinElement(double[] arr, Logger logger) {

        logger.traceEntry(Arrays.toString(arr));

        if (arr.length != 0) {

            int minIndex = 0;
            double minEl = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (minEl > arr[i]) {
                    minEl = arr[i];
                    minIndex = i;
                } else if (minEl == arr[i]) {
                    minIndex = -1;
                }
            }

            if (minIndex == -1) {
                logger.error("There is at least 2 equal min values");
            }

            return logger.traceExit(minIndex);

        } else {
            logger.error("Array should not be empty!");
            return logger.traceExit(-1);
        }
    }

    public static String findExtrem(double[] arr, Logger logger){
        logger.traceEntry(Arrays.toString(arr));

        int maxIndex = indexOfMaxElement(arr, logger);
        int minIndex = indexOfMinElement(arr, logger);

        if (maxIndex + minIndex == -2) {
            return logger.traceExit("There is no extremes in array");
        } else if (maxIndex != -1 && minIndex != -1) {
            return logger.traceExit("max: " + maxIndex + "\n min: " + minIndex + " ");
        } else {
            return logger.traceExit("Index of extrema: " + ((maxIndex == -1)? minIndex : maxIndex) + " ");
        }
    }

}
