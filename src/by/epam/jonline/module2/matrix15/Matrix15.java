/**
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
 */

package by.epam.jonline.module2.matrix15;

public class Matrix15 {

    public static void main(String[] args) {

        int n = 3;
        int m = 6;
        int max = 0;

        int[][] matrix = new int[n][m];

        initMatrix(matrix);
        printMatrix(matrix);

        replaceOddElements(matrix,max);

    }

    public static int maxElement(int[][] matrix, int maxEl){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxEl){
                    maxEl = matrix[i][j];
                }
            }
        }
        return maxEl;
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

    public static void replaceOddElements(int[][] matrix, int el){

        el = maxElement(matrix,el);
        System.out.println("\nmax element = " + el + "\n");


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((matrix[i][j] % 2 != 0)&(matrix[i][j] != 0)){
                    matrix[i][j] = el;
                }
                System.out.format("%3s", matrix[i][j]);
            }
            System.out.println();
        }

    }

}




