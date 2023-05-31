/**
 * 4. Сформировать квадратную матрицу порядка n  по заданному образцу (n -  четное)
 * 1   2    3    ..  n
 * n   n-1  n-2  ..  1
 * 1   2    3    ..  n
 * ..  ..   ..   ..  ..
 * n   n-1  n-2  ..  1
 */

package by.epam.jonline.module2.matrix4;


public class Matrix4 {
    public static void main(String[] args) {
        int n = 10;
        int[][] matrix = new int[n][n];

        if (n % 2 != 0) {
            System.out.println("\nОшибка. Число n  должно быть четным");
            System.exit(0);
        }

        initMatrix(matrix, n);
        printMatrix(matrix);

    }

    // init array -------------------------------------------------------------------------------------------
    public static void initMatrix(int[][] matrix, int n) {

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {

                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = j + 1; //1234
                }

            } else {
                int x = n;
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = x; //4321
                    x--;
                }
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

