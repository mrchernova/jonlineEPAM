/**
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */

package by.epam.jonline.module2.matrix12;

public class Matrix12 {

    public static void main(String[] args) {

        int n = 4;
        int[][] matrix = new int[n][n];

        initMatrix(matrix);
        printMatrix(matrix);

        for (int row = 0; row < n; row++) {
            for (int cell = 0; cell < n; cell++) {

                if (row % 2 == 0) {

                    int min = matrix[row][cell];
                    int min_cell = cell;

// находится минимальный элемент в строке
                    for (int nextCell = cell + 1; nextCell < n; nextCell++) {
                        if (matrix[row][nextCell] < min) {
                            min = matrix[row][nextCell];
                            min_cell = nextCell;
                        }
                    }
                    // если текущая ячейка не минимальна, тогда
                    //временной переменной присвоить текущее
                    //а на место текущего поставить минимальный
                    // так отсортируем всю строку

                    if (cell != min_cell) {
                        int tmp = matrix[row][cell];
                        matrix[row][cell] = matrix[row][min_cell];
                        matrix[row][min_cell] = tmp;
                    }

                } else {
                    int max = matrix[row][cell];
                    int max_cell = cell;

                    for (int nextCell = cell + 1; nextCell < n; nextCell++) {
                        if (matrix[row][nextCell] > max) {
                            max = matrix[row][nextCell];
                            max_cell = nextCell;
                        }
                    }

                    if (cell != max_cell) {
                        int tmp = matrix[row][cell];
                        matrix[row][cell] = matrix[row][max_cell];
                        matrix[row][max_cell] = tmp;
                    }
                }
            }


        }
        System.out.println("-----------------------");
        System.out.println("Строки поочередно отсортированы по возрастанию и убыванию элементов");
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
