/**
 * Даны целые числа а1,а2 ,..., аn. Вывести на печать только те числа, для которых аi> i
 */

package by.epam.jonline.module2.array5;

public class Array5 {
    public static void main(String[] args) {

        int[] a = new int[55];

        // Заполнение массива
        System.out.println("Исходный массив:");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 20);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Полученный массив:");
        
        // Вывод массива
        for (int i = 0; i < a.length; i++) {

            if (a[i] > i) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
