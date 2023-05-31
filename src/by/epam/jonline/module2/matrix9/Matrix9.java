/**
 * 9. Задана матрица неотрицательных чисел.
 * Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму
 */

package by.epam.jonline.module2.matrix9;

public class Matrix9 {

    static int sum = 0;

    public static void main(String[] args) {

        int n = 2;
        int m = 10;
        int[][] matrix = new int[n][m];
        int[] a = new int[m];
        int max = 0;
        int k = 0;

        initMatrix(matrix);

        System.out.println("Матрица " + n + "x" + m);
        printMatrix(matrix);

        sumInAllCollumns(matrix, m, a);

        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
            if (a[i] > max) {
                max = a[i];

            }
        }

        System.out.print("\n\nМаксимальная сумма элементов " + max + " и находится в столбце № ");
        for (int i = 0; i < m; i++) {
            if (max == a[i]) {
                k++;
                if (k <= 1) {
                    System.out.print(++i); //+1 для пользователя
                } else {
                    System.out.print(", " + ++i); //+1 для пользователя
                }
            }
        }
        
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
                System.out.format("%2s", matrix[i][j]);
            }
            System.out.println();
        }
    }

    // выводит все суммы
    public static void sumInAllCollumns(int[][] matrix, int m, int[] a) {
        int j = 0;
        for (int i = 0; i < m; i++) {
            int x = sumInEachCollumn(matrix, j, m, a);
            j++;        // для пользователя (начало отсчета не от 0 а от 1) плюс увеличивает счетчик j 
        }

    }

    // считает сумму одного столбца
    public static int sumInEachCollumn(int[][] matrix, int onej, int m, int[] a) {
        sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][onej];
        }
        a[onej] = sum;
        return sum;
    }


}

