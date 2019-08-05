package maintask2.utils;

import org.apache.logging.log4j.*;

public class Transport {
    /*
     * транспонировать квадратную матрицу (при решении данного задания не
     *рекомендуется задействовать дополнительную память для дополнительного
     *массива).
     */

    private static void swapMtx(double[][] mtx, int i_1, int j_1, int i_2, int j_2) {
        mtx[i_1][j_1] += mtx[i_2][j_2];
        mtx[i_2][j_2] = mtx[i_1][j_1] - mtx[i_2][j_2];
        mtx[i_1][j_1] -= mtx[i_2][j_2];
    }

    public static void matrix(double[][] mtx, Logger logger) {                // так как дополнительную память выделять
        logger.traceEntry();                                            // нельзя, то работаем только с квадратными

        for (int i = 0; i < mtx.length; i++) {
            for (int j = i + 1; j < mtx.length; j++) {
                swapMtx(mtx, i, j, j, i);
            }
        }

        logger.traceExit();
    }
}
