/**
 * Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  если  сумма  его  цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию
 */

package by.epam.jonline.module2.decomposition14;

public class Decomposition14 {
    public static void main(String[] args) {

        int sum;
        int k = 509;

        for (int i = 1; i <= k; i++) {
            sum = sumOfNumbers(i);
            if (i == sum) {
                System.out.println(i + " число Армстронга");
            }
        }
    }

    public static int sumOfNumbers(int a) {
        int n;
        int sum = 0;
        int x = (int) Math.log10(a) + 1;

        while (a > 0) {
            n = a % 10;
            a = a / 10;
            sum += (int) Math.pow(n, x);
        }
        return sum;
    }

}