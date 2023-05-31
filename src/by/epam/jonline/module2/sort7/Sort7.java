/**
 * Пусть даны две неубывающие последовательности действительных чисел.
 * требуется указать те места, на которые нужно вставлять элементы последовательности в первую 
 * последовательность так, чтобы новая последовательность оставалась возрастающей
 */

package by.epam.jonline.module2.sort7;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Sort7 {
    public static void main(String[] args) {

        int[] a = new int[]{13, 14, 100, 100};
        int[] b = new int[]{1, 10, 11};
        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;

        System.out.println("array a " + Arrays.toString(a));
        System.out.println("Elements which should be inserted " + Arrays.toString(b));

        System.out.println("\nResult array c ");
        for (int x = 0; x < c.length; x++) {

            if (i >= a.length) c[x] = b[j++];         // когда закончится массив a вывести оставшееся из b
            else {
                if (j >= b.length) c[x] = a[i++];   // когда закончится массив b вывести оставшееся из a    
            }

            if (i < a.length && j < b.length) { // если оба массива пройдены, вывести ответ с
                if (a[i] <= b[j]) {
                    c[x] = a[i];
                    i++;

                } else {
                    c[x] = b[j];
                    j++;
                }
            }
        }

        System.out.println(Arrays.toString(c));
    }

}
