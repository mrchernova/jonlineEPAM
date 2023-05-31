/**
 * 3. Дана матрица. Вывести k-строку и p-столбец матрицы
 */

package by.epam.jonline.module2.matrix3;

import java.util.Random;

public class Matrix3 {
    public static void main(String[] args) {
        int n = 4;      // строки
        int m = 3;      // столбцы

        int[][] matrix = new int[n][m];
          
        int k = 1;      // строка
        int p = 1;      // столбец

        
        if (((p > m) || (p <= 0)) || ((k > n) || (k <= 0))) {                                                         // p-1 и  k-1 - для удобства пользователя
            System.out.println("\nОшибка. Значения не соответствуют размеру матрицы");
            System.exit(0);
        }

        initMatrix(matrix);
        printMatrix(matrix);
        
        System.out.println();
        System.out.println(k + " - строка(k) равна: ");
        kRow(matrix, k-1);
        
        System.out.println();
        System.out.println(p + " - столбец(p) равен: ");
        pColumn(matrix, p-1);
       
    }

    // init array -------------------------------------------------------------------------------------------
    public static void initMatrix(int[][] matrix) {
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(10);
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

    public static void pColumn(int[][] matrix, int p) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][p] + " ");
        }
    }

    public static void kRow(int[][] matrix, int k) {
        for (int j = 0; j < matrix[k].length; j++) {
            System.out.print(matrix[k][j] + " ");
        }
    }
}
