/**
 * Дано  натуральное  число  N.  Написать  метод(методы)  для  формирования  массива,  элементами  которого
 * являются цифры числа N.
 */

package by.epam.jonline.module2.decomposition10;

public class Decomposition10 {
    public static void main(String[] args) {
        int n = 123;

        System.out.println("Массив из элементов числа " + n);
        Razlozhenie(n);
    }


    public static void Razlozhenie(int n) {
        int i = 0;
        int res;

        int x = (int) Math.log10(n) + 1; // количество цифр в числе
        int[] a = new int[x];

        while (n > 0) {
            res = n % 10;
            n = n / 10;

            a[i] = res;
            i++;
        }
        PrintArray(a);
    }

    public static void PrintArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }

}
