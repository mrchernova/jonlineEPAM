/**
 * Сформировать случайную матрицу MxN, состоящую из 0 и 1,
 * причем в каждом столбце число 1 равно № столбца
 */

package by.epam.jonline.module2.matrix14;

public class Matrix14 {
    public static void main(String[] args) {
        int n = 6; // n >= m - иначе единиц не хватит для определения номера столбца
        int m = 6;
        int k;

        int[][] matrix = new int[n][m];
        int[] array = new int[n];

        initMatrix(matrix);

        // Матрица создана. Для проверки надо пройтись по столбцам и посчитать количество 1
        for (int j = 0; j < m; j++) {
            k = 0;
            for (int i = 0; i < n; i++) {


                /*Счетчик. Считает количество 1 в столбце*/
                if (matrix[i][j] == 1) k++;

            }
                /*Если столбец в метрице не удовлетворяет условию, придется его заменить.
                Создавать массив до тех пор, пока количество 1 не совпадет с номером заменяемого столбца*/
                while (k != j+1) {
                    k = 0;
                    for (int newi = 0; newi < array.length; newi++) {
                        array[newi] = (int) (Math.random() * 2);

                        // Счетчик. Считает количество 1 в массиве
                        if (array[newi] == 1) k++;

                    }
                    // Меняем столбец в матрице на массив с правильным количеством элементов. Если оно правильно
                    if (k == j+1) {
                        for (int insi = 0; insi < n; insi++) {
                            matrix[insi][j] = array[insi];
                        }
                    }
                }

        }
        System.out.println("Матрица, в которой количество 1 равно номеру столбца");
        printMatrix(matrix);

    }


    public static void initMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
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
