/**
 * 10. Найти положительные элементы главной диагонали квадратной матрицы
 */

package by.epam.jonline.module2.matrix10;

public class Matrix10 {

    public static void main(String[] args) {

        int n = 5;
        int[][] matrix = new int[n][n];

        initMatrix(matrix);
        printMatrix(matrix);

        System.out.println("Положительные элементы главной диагонали: ");
        mainDiagonal(matrix);


    }

    public static void initMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20 - 10);
            }
        }
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.format("%3s", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void mainDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {


            }
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            }
        }


    }

}
