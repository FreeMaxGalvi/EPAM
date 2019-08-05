package maintask2.utils;

import org.apache.logging.log4j.*;

public class Diagonals {

    /*
     *проверить, является ли матрица симметричной относительно главной (или
     *побочной) диагонали.
     */


    private static boolean isMain(double[][] mtx, Logger logger) {
        logger.traceEntry();

        int miniSize = mtx.length - 1;
        boolean flag = true;

        for (int i = 0; i < miniSize && flag; i++) {
            for (int j = i + 1; j < mtx.length && flag; j++) {
                if (mtx[i][j] != mtx[j][i]) {
                    flag = false;
                }
            }
        }

        return logger.traceExit(flag);
    }

    private static boolean isSecond(double[][] mtx, Logger logger) {
        logger.traceEntry();

        int miniSize = mtx.length - 1;
        int border;
        boolean flag = true;

        for (int i = 0; i < miniSize && flag; i++) {
            border = miniSize - i;
            for (int j = 0; j < border && flag; j++) {
                if (mtx[j][i] != mtx[miniSize - i][miniSize - j]) {
                    flag = false;
                }
            }
        }

        return logger.traceExit(flag);
    }

    public static boolean isSymetric (double[][] mtx, Logger logger) {
        logger.traceEntry();
        return logger.traceExit(isSecond(mtx, logger) || isMain(mtx, logger));
    }

}
