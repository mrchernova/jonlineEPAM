/**
 *  13. Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов
 */

package by.epam.jonline.module2.matrix13;

public class Matrix13 {
    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];

        initMatrix(matrix);
        printMatrix(matrix);


        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++){

                if (col % 2 == 0) {

                    int min = matrix[row][col];
                    int min_row = row;

                    for (int nextRow = row + 1; nextRow < n; nextRow++) {
                        if (matrix[nextRow][col] < min) {
                            min = matrix[nextRow][col];
                            min_row = nextRow;
                        }
                    }

                    if (row != min_row) {
                        int tmp = matrix[row][col];
                        matrix[row][col] = matrix[min_row][col];
                        matrix[min_row][col] = tmp;
                    }

                }else{
                    int max = matrix[row][col];
                    int max_row = row;

                    for (int nextRow = row + 1; nextRow < n; nextRow++) {
                        if (matrix[nextRow][col] > max) {
                            max = matrix[nextRow][col];
                            max_row = nextRow;
                        }
                    }

                    if (row != max_row) {
                        int tmp = matrix[row][col];
                        matrix[row][col] = matrix[max_row][col];
                        matrix[max_row][col] = tmp;
                    }
                }

            }
        }


        System.out.println("-----------------------");
        System.out.println("Столбцы поочередно отсортированы по возрастанию и убыванию элементов");
        printMatrix(matrix);




    }

        public static void initMatrix(int[][] matrix) {

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * 10);
                }
            }
        }

        public static void printMatrix(int[][] matrix) {

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.format("%5s", matrix[i][j]);
                }
                System.out.println();
            }
        }

}
