/**
 * 5. Сортировка вставками. Дана последовательность чисел a1,a2...an.
 * Требуется переставить числа в порядке возрастания. Делается это следующим образом.
 * Пусть a1,a2...ai -  упорядоченная последовательность, т.е. a1<=a2<=...<=an.
 * Берется  следующее  число 1+ia  и  вставляется  в  последовательность  так,  чтобы  новая последовательность была тоже возрастающей.
 * Процесс производится до тех пор, пока все элементы от i +1 до n не будут перебраны.
 * Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
 * Двоичный поиск оформить в виде отдельной функции
 */

package by.epam.jonline.module2.sort5;

import java.util.Arrays;

public class Sort5 {
    public static void main(String[] args) {

        int i;
        int temp;
        int high;
        int[] a = new int[]{35, 12, 28, 47, 20, 31};

        System.out.println(Arrays.toString(a));
        System.out.println("Sorted array");
        for (i = 1; i < a.length; i++) {
            
            temp = a[i];
            high = binSearch(a, i, temp);

            // сдвиг отсортированного массива
            for (int k = i; k > high; k--)
                a[k] = a[k - 1];

            a[high] = temp;
        }
        System.out.println(Arrays.toString(a));
    }


    public static int binSearch(int[] a, int i, int temp) {

        int low = 0;
        int high = i;

        // поиск места для текущего элемента
        while (low < high) {
            int mid = (high + low) / 2;

            if (temp <= a[mid])
                high = mid;
            else
                low = mid + 1;
        }
        return high;
    }

}
   




