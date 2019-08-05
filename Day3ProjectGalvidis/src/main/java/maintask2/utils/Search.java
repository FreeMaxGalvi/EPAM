package maintask2.utils;

import org.apache.logging.log4j.*;

public class Search {
    /*
     *найти среднеарифметическое и среднегеометрическое значения всех
     *элементов матрицы;
     */

    private static double arythm(double[][] mtx, Logger logger){
        logger.traceEntry();

        double sum = 0;
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[0].length; j++) {
                sum += mtx[i][j];
            }
        }

        return logger.traceExit(sum /(mtx.length * mtx[0].length));
    }

    private static double geom(double[][] mtx, Logger logger) {
        logger.traceEntry();

        double res = 1;
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[0].length; j++) {
                res *= mtx[i][j];
            }
        }

        return logger.traceExit(Math.pow(res,(double)1 / (mtx.length * mtx[0].length)));
    }

    public static String avg(double[][] mtx, Logger logger) {
        logger.traceEntry();
        return logger.traceExit("Arythmetic average: " + arythm(mtx, logger) + "\nGeometric average: "
                + geom(mtx, logger) + " ");
    }

}
