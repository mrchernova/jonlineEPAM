/**
 * 8. В числовой матрице поменять местами два столбцалюбых столбца, т. е. все элементы одного столбца
 * поставить на соответствующие им позиции другого, а его элементы второго переместить в первый.
 * Номера столбцов вводит пользователь с клавиатуры
 */

package by.epam.jonline.module2.matrix8;

import java.util.Scanner;

public class Matrix8 {
    public static void main(String[] args) {

        int n = 5;
        int st1;
        int st2;
        
        int[][] matrix = new int[n][n];

        initMatrix(matrix);
        printMatrix(matrix);


        System.out.println("Введите номера столбцов, которые  нужно поменять местами");
        
        System.out.print("Введите номер первого столбца >> ");
        st1 = checkScanner(n);
       
        System.out.print("Введите номер второго столбца >> ");
        st2 = checkScanner(n);

        System.out.println("Матрица после замены столбцов:");
        searchAndReplace(matrix, st1, st2);
    }

    public static void initMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = (int) (Math.random() * 20 - 10);
            }
        }
    }


    /*----------------------------------------------------------------------------------------------------------------------*/

    public static int checkScanner(int n) {
        int num;

        Scanner scNum = new Scanner(System.in);
        while (!scNum.hasNextInt()) {
            System.out.println("Это не число. Введите еще раз");
            scNum.next();
        }
        num = scNum.nextInt();

        boolean ok = false;
        while (!ok) {
            if ((num > 0) & (num <= n)) {
                ok = true;
            } else {
                System.out.println("Еще раз номер столбца");
                num = scNum.nextInt();
            }
        }
        return num;
    }


    public static void searchAndReplace(int[][] matrix, int st1, int st2) {
        st1--;
        st2--;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if (j == st1) {
                    System.out.format("%3s", matrix[i][st2]);
                } else {
                    if (j == st2) {
                        System.out.format("%3s", matrix[i][st1]);
                    } else {
                        System.out.format("%3s", matrix[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }
    /*----------------------------------------------------------------------------------------------------------------------*/

    public static void printMatrix(int[][] matrix) {

       for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.format("%3s", matrix[i][j]);
            }
            System.out.println();
        }
    }

}

