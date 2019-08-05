package maintask1.utils;

import org.apache.logging.log4j.*;

import java.util.Arrays;

public class Search {
    /*
     *найти позицию первого встретившегося локального минимума (максимума), а
     *если таких элементов нет, то возвратить -1 (локальный минимум это элемент,
     *который меньше любого из своих соседей; локальный максимум – это элемент,
     *который больше любого из своих соседей);
     */

    public static int findLocalExtrem(double[] arr, Logger logger){
        logger.traceEntry(Arrays.toString(arr));

        int maxIndex = arr.length - 1;
        int returnValue = -1;

        boolean condition_1;
        boolean condition_2;
        boolean finalCondition_1;
        boolean finalCondition_2;

        if (maxIndex < 2){
            logger.error("Not enough elements in array");
        } else {
            for (int i = 1; i < maxIndex; i++){
                condition_1 = arr[i] > arr[i-1];
                condition_2 = arr[i] > arr[i+1];

                finalCondition_1 = (condition_1 && condition_2);
                finalCondition_2 = (!condition_1 && !condition_2);

                if (finalCondition_1 || finalCondition_2) {
                    returnValue = i;
                    i = maxIndex;
                }
            }
        }

        return logger.traceExit(returnValue);
    }

        /*
        *реализовать для элементов вектора два алгоритма поиска: линейный или
        последовательный (linear or sequential search) и двоичный или бинарный (binary
        search);
         */

    public static int linear(double[] arr, double el, Logger logger) {
        logger.traceEntry(Arrays.toString(arr), el);

        int returnValue = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                returnValue = i;
            }
        }

        return logger.traceExit(returnValue);
    }

    public static int binary(double[] arr, int left, int right, double el, Logger logger) {
        logger.traceEntry(Arrays.toString(arr), left, right, el);

        if (right-left < 2) {
            if (arr[left] == el) {
                return logger.traceExit(left);
            } else if (arr[right] == el) {
                return logger.traceExit(right);
            } else {
                return logger.traceExit(-1);
            }
        }

        int middle = (right + left) / 2;

        double middleEl = arr[middle];

        if (middleEl == el) {
            return logger.traceExit(middle);
        } else if (el > middleEl) {
            logger.trace("go right");
            return binary(arr, middle, right, el, logger);
        } else {
            logger.trace("go left");
            return binary(arr, left, middle, el, logger);
        }
    }

    /*
     *найти среднеарифметическое и среднегеометрическое значения всех
     *элементов вектора;
     */

    private static double arythm (double[] arr, Logger logger) {
        logger.traceEntry(Arrays.toString(arr));

        if (arr.length == 0) {
            System.out.println("Array can not be empty");
            return logger.traceExit(0);
        } else {
            double sum = arr[0];

            for (int i = 1; i < arr.length; i++){
                sum += arr[i];
            }

            sum /= arr.length;

            return logger.traceExit(sum);
        }
    }

    private static double geom (double[] arr, Logger logger) {
        logger.traceEntry(Arrays.toString(arr));

        if (arr.length == 0) {
            System.out.println("Array can not be empty");
            return logger.traceExit(0);
        } else {
            double res = arr[0];

            for (int i = 1; i < arr.length; i++){
                res *= arr[i];
            }

            res  = Math.pow(res, (double) 1 / arr.length);

            return logger.traceExit(res);
        }
    }

    public static String findAvg (double[] arr, Logger logger) {
        logger.traceEntry(Arrays.toString(arr));

        double arAvg = arythm(arr, logger);
        double geAvg = geom(arr, logger);

        return logger.traceExit("Arythmetic average: " + arAvg + "\nGeometric average: " + geAvg + " ");
    }

}
