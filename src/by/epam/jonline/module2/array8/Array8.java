/**
 * Дана  последовательность  целых  чисел a1, a2, ..., an
 * Образовать  новую  последовательность, выбросив  из исходной те члены, которые равны min(a1, a2, ..., an)
 */

package by.epam.jonline.module2.array8;

public class Array8 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];
        int min;

        System.out.println("Даны целые числа:");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print("[" + a[i] + "] ");
        }
        min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("\n min = " + min);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != min) {

                b[i] = a[i];

                System.out.print("[" + b[i] + "] ");
            }
        }

    }
}
