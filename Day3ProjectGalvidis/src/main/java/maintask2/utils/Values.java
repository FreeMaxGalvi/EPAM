package maintask2.utils;

import java.util.Arrays;
import org.apache.logging.log4j.*;

public class Values {
    /*
     *найти экстремальные значения (минимальный и максимальный элементы)
     *данной матрицы;
     */

    private static int[] indexOfMaxElement(double[][] mtx, Logger logger) {

        logger.traceEntry();

        double maxEl = mtx[0][0];
        int[] maxIndex = {0,0};
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[0].length; j++) {
                if (mtx[i][j] > maxEl) {
                    maxEl = mtx[i][j];
                    maxIndex[0] = i;
                    maxIndex[1] = j;
                }
            }
        }
        return logger.traceExit(maxIndex);
    }

    private static int[] indexOfMinElement(double[][] mtx, Logger logger) {
        logger.traceEntry();

        double minEl = mtx[0][0];
        int[] minIndex = {0,0};
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[0].length; j++) {
                if (mtx[i][j] < minEl) {
                    minEl = mtx[i][j];
                    minIndex[0] = i;
                    minIndex[1] = j;
                }
            }
        }
        return logger.traceExit(minIndex);
    }

    public static String findExtrem(double[][] mtx, Logger logger) {
        logger.traceEntry();

        int[] max = indexOfMaxElement(mtx, logger);
        int[] min = indexOfMinElement(mtx, logger);

        return logger.traceExit("Indexes of :\nmax el: " + Arrays.toString(max) + "\nmin el: " + Arrays.toString(min));
    }
}
