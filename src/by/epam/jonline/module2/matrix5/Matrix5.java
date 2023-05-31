/**
 * 5. Сформировать квадратную матрицу порядка n по заданному образцу (n -  четное)
 * 1   1   ..  1   1
 * 2   2   ..  2   0
 * ..  ..  ..  ..  ..
 * n-1 n-1 ..  0   0
 * n   0   ..  0   0
 */

package by.epam.jonline.module2.matrix5;

public class Matrix5 {
    public static void main(String[] args) {
        int n = 8;
        int[][] matrix = new int[n][n];

        if (n % 2 != 0) {
            System.out.println("\nОшибка. Число n  должно быть четным");
            System.exit(0);
        }

        initMatrix(matrix);
        printMatrix(matrix);

    }

    // init array -------------------------------------------------------------------------------------------
    public static void initMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - i; j++) {
                matrix[i][j] = i + 1;
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
}

