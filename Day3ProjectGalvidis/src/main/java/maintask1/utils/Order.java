package maintask1.utils;

import org.apache.logging.log4j.*;

import java.util.Arrays;

public class Order {
    /*
     *проверить, находятся ли все элементы вектора в упорядоченном виде (т.е.
     *отсортированы ли элементы по возрастанию или убыванию);
     */

    private static boolean isGrowingOrDescending(double[] arr, boolean growingCondition, Logger logger){
        logger.traceEntry(Arrays.toString(arr), growingCondition);

        if (arr.length == 0 || arr.length == 1) {
            logger.error("Array's length is not big enough");
            return logger.traceExit(false);
        } else {
            double prevEl = arr[0];
            boolean result = true;

            if (growingCondition) {
                for (int i = 1; i < arr.length; i++) {
                    if (prevEl >= arr[i]) {
                        result = false;
                        i = arr.length;
                    } else {
                        prevEl = arr[i];
                    }
                }
            } else {
                for (int i = 1; i < arr.length; i++) {
                    if (prevEl <= arr[i]) {
                        result = false;
                        i = arr.length;
                    } else {
                        prevEl = arr[i];
                    }
                }
            }

            return logger.traceExit(result);
        }
    }

    public static boolean isStream(double[] arr, Logger logger) {
        logger.traceEntry(Arrays.toString(arr));

        boolean condition_1 = isGrowingOrDescending(arr,true, logger);
        boolean condition_2 = isGrowingOrDescending(arr,false, logger);

        if (condition_1 || condition_2) {
            return logger.traceExit(true);
        } else {
            return logger.traceExit(false);
        }
    }
}
