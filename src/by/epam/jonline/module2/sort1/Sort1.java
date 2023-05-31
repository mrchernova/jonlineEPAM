/**
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
 * Объединить их в один  массив,  включив  второй  массив  между  k-м  и  (k+1)  -  м  элементами  первого,  
 * при  этом  не  используя дополнительный массив
 */

package by.epam.jonline.module2.sort1;

import java.util.Arrays;

public class Sort1 {
    public static void main(String[] args) {
        int[] a = new int[]{32, 11, 5, 19, 6, 7};
        int[] b = new int[]{1000, 1000, 1000};
        int k = 4;


        System.out.println("First array " + Arrays.toString(a));
        System.out.println("Second array " + Arrays.toString(b));
        System.out.println("k = " + k);
        System.out.println("Inserted array b in array a on k position");

        if (k <= a.length) {
            for (int i = 0; i < k; i++) {
                System.out.print(a[i] + " ");
            }

            for (int j = 0; j < b.length; j++) {
                System.out.print(b[j] + " ");
            }

            for (int i = k; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }

        } else {
            System.out.println("натуральное число k не должно быть больше длины первого массива");
        }

    }
}
