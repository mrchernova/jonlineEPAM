/**
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу (n -  четное)
 * 1   1   1   ..   1   1   1
 * 0   1   1   ..   1   1   0
 * 0   0   1   ..   1   0   0
 * ..  ..  ..  ..   ..  ..  ..
 * 0   1   1   ..   1   1   0
 * 1   1   1   ..   1   1   1
 */

package by.epam.jonline.module2.matrix6;

public class Matrix6 {
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
        int x = 0;
        for (int i = 0; i < matrix.length; i++) {

            if (i < matrix.length / 2) {
                x = i;
                for (int j = x; j < matrix.length - i; j++) {
                    matrix[i][j] = 1;
                }
            } else {

                for (int j = x; j < matrix.length - x; j++) {
                    matrix[i][j] = 1;
                }
                x--;
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

