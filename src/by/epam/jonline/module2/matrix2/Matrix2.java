/**
 * 2. Дана квадратная матрица. Вывести элементы, стоящие на диагонали
 */

package by.epam.jonline.module2.matrix2;

import java.util.Random;

public class Matrix2 {
    public static void main(String[] args) {
        int n = 3;

        int[][] matrix = new int[n][n];

        initMatrix(matrix);
        printMatrix(matrix);

        diagonalElements(matrix);
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
    public static void diagonalElements(int[][] matrix) {
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
                if (i < matrix.length - 1) {
                    i++;
                }
            }
        }
        System.out.println();
    }
}
