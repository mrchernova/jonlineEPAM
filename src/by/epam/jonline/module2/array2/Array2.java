/**
 * Дана последовательность действительных чисел а1,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 */

package by.epam.jonline.module2.array2;

public class Array2 {
    public static void main(String[] args) {

        double[] a = {1.3, 92, -3, 4, 0};

        double z = 2;
        int x = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > z) {
                a[i] = z;
                x++;
            }
        }
        System.out.println("Количество замен в последовательности равна " + x);
    }
}
