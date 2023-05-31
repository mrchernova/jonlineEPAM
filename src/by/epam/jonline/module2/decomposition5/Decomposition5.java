/**
 * Составить программу, которая в массива A[N] находит второе по величине число
 */

package by.epam.jonline.module2.decomposition5;

import java.util.Arrays;

public class Decomposition5 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 7, 5, 3, 7};
        System.out.println(Arrays.toString(a));

        System.out.println("Максимальное по величине число в массиве равно " + MAX(a));
        int max = MAX(a);
        int secondMax = 0;

        // Находим первое попавшееся число < max и назначаем его как secondMax
        for (int i = 0; i < a.length; i++) {
            if (a[i] < max) {
                secondMax = a[i];
                break;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if ((a[i] >= secondMax) && (a[i] < max)) {
                secondMax = a[i];
            }
        }
        System.out.println("Второе по величине число в массиве равно " + secondMax);
    }

    public static int MAX(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

}