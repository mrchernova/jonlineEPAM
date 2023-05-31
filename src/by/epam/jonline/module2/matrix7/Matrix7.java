/**
 * 7. Сформировать квадратную матрицу порядка N по правилу A[i,j] = sin ((i^2-j^2) / N)
 * и подсчитать количество положительных элементов в ней.
 */

package by.epam.jonline.module2.matrix7;

public class Matrix7 {
    public static void main(String[] args) {
        double n = 3;
        double[][] matrix = new double[(int) n][(int) n];

        initMatrix(matrix, n);
        printMatrix(matrix);
    }

    public static void initMatrix(double[][] matrix, double n) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = Math.sin((i * i - j * j) / n);
                matrix[i][j] = Math.round(matrix[i][j] * 100.0) / 100.0;
            }
        }
    }

    public static void printMatrix(double[][] matrix) {

        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.format("%13s", matrix[i][j]);
                if (matrix[i][j] > 0) {
                    k++;
                }
            }
            System.out.println();
        }
        System.out.println("Положительных элементов в матрице = " + k);
    }
}