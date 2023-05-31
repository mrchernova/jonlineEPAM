/**
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */

package by.epam.jonline.module2.matrix1;

import java.util.Random;

public class Matrix1 {
    public static void main(String[] args) {
        int n = 4;
        int m = 3;

        int[][] matrix = new int[n][m];

        initMatrix(matrix);
        printMatrix(matrix);

        selectColumn(matrix);
    }

    // init array -------------------------------------------------------------------------------------------
    public static void initMatrix(int[][] matrix) {
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = rand.nextInt(10);
            }
        }
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }


    // ----------------------------------------------------------------------------------------------------
    public static void selectColumn(int[][] matrix) {
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if ((j % 2 == 0) & (matrix[0][j] > matrix[matrix.length - 1][j])) {        // если столбец нечетный И если первый элемент > последнего ТО print
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}