/**
 * Задана последовательность N вещественных чисел.
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

package by.epam.jonline.module2.array6;

public class Array6 {
    public static void main(String[] args) {
        double[] a = new double[10];
        double sum;

        // Заполнение массива
        System.out.println("Исходный массив:");

        for (int i = 0; i < a.length; i++) {
            a[i] = (Math.random() * 2);

            a[i] = Math.ceil(a[i] * 10) / 10;

            System.out.print(a[i] + "  ");
        }
        sum = a[1];
        for (int i = 2; i < a.length; i++) {
            boolean flag = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    flag = false;           // false обозначает, что число составное составное 
                }
            }

            if (flag) {
                sum = sum + a[i];
            }
        }
        System.out.println("\nСумма чисел с простыми порядковыми номерами:");
        System.out.println(Math.ceil(sum * 10) / 10);
    }
}
