/**
 * Задан массив D. Определить следующие суммы: D[1]+D[2]+D[3]; D[3]+D[4]+D[5]; D[4]+D[5]+D[6].
 * Пояснение. Составить метод(методы)  для вычисления суммы трех последовательно расположенных
 * элементов массива с номерами от k до m
 */

package by.epam.jonline.module2.decomposition8;

import java.util.Arrays;

public class Decomposition8 {
    public static void main(String[] args) {

        int[] d = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int k = 1;
        int m = k + 2;

        System.out.print("Дан массив D: ");
        System.out.println(Arrays.toString(d));

        System.out.println("k = " + k);
        System.out.println("m = " + m);

        if ((m > d.length) && (k < 1)) {
            System.out.println("Сложение невозможно. Выход за пределы массива");
        } else {
            System.out.println("Сумма элементов от D[" + k + "] до D[" + m + "] = " + Sum3x(d, k));
        }
    }

    public static int Sum3x(int[] a, int k) {
        int sum = 0;
        --k;

        for (int i = k; i < k + 3; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

}