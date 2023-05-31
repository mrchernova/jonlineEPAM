/**
 * 3. Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an.Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 */

package by.epam.jonline.module2.sort3;

import java.util.Arrays;

public class Sort3 {
    public static void main(String[] args) {

        int[] a = new int[]{0, 2, 4, 8, 10, 80};

        int max;
        int i = 0;
        int temp;

        System.out.println("a " + Arrays.toString(a));


        System.out.println("\nSorted result");
        while (i < a.length) {
            max = searchMax(a, i);

            // меняем местами max и следующий элементы
            temp = a[i];
            a[i] = a[max];
            a[max] = temp;

            //вывод массива
            System.out.print(a[i] + " ");

            i++;
        }

    }

    public static int searchMax(int[] array, int x) {
        int max = array[x];
        int k = x;
        for (int i = x; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                k = i;
            }
        }
        return k;
    }

}
