package maintask2.utils;

import org.apache.logging.log4j.*;

public class Local {
    /*
     * найти позицию первого встретившегося локального минимума (максимума), а
     *если таких элементов нет, то возвратить (-1;-1) (локальный минимум это
     *элемент, который меньше любого из своих соседей; локальный максимум – это
     *элемент, который больше любого из своих соседей);
     */

    private static boolean isExtrem(double[][] mtx, int i, int j, Logger logger) {
        logger.traceEntry();

        int height = mtx.length - 1;
        int length = mtx[0].length - 1;

        boolean maxFlag = true;
        boolean minFlag = true;

        if(i != 0) {
            if (mtx[i][j] > mtx[i-1][j]) {
                minFlag = false;
            } else if (mtx[i][j] < mtx[i-1][j]) {
                maxFlag = false;
            } else {
                maxFlag = false;
                minFlag = false;
            }
        }

        if (i != height) {
            if (mtx[i][j] > mtx[i+1][j]) {
                minFlag = false;
            } else if (mtx[i][j] < mtx[i+1][j]) {
                maxFlag = false;
            } else {
                maxFlag = false;
                minFlag = false;
            }
        }

        if (!(minFlag || maxFlag)){                             // should make the process a little faster
            return false;
        }

        if(j != 0) {
            if (mtx[i][j] > mtx[i][j-1]) {
                minFlag = false;
            } else if (mtx[i][j] < mtx[i][j-1]) {
                maxFlag = false;
            } else {
                maxFlag = false;
                minFlag = false;
            }
        }

        if (j != length) {
            if (mtx[i][j] > mtx[i][j+1]) {
                minFlag = false;
            } else if (mtx[i][j] < mtx[i][j+1]) {
                maxFlag = false;
            } else {
                maxFlag = false;
                minFlag = false;
            }
        }

        return logger.traceExit(minFlag || maxFlag);
    }

    public static int[] findLocalExtrem(double[][] mtx, Logger logger) {
        logger.traceEntry();

        int[] res = {-1,-1};
        boolean flag = true;

        for (int i = 0; i < mtx.length && flag; i++) {
            for (int j = 0; j < mtx[0].length && flag; j++) {
                if (isExtrem(mtx, i, j, logger)) {
                    res[0] = i;
                    res[1] = j;
                    flag = false;
                }
            }
        }

        return logger.traceExit(res);
    }

}
