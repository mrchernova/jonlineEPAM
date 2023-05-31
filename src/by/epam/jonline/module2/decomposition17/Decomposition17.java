/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию
 */

package by.epam.jonline.module2.decomposition17;

import java.util.Scanner;

public class Decomposition17 {
    public static void main(String[] args) {

        byte k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите челое число");
        int n = sc.nextInt();

        while (n > 0) {
            n = n - sumDigits(n);
            k++;
            System.out.println(n);
        }
        System.out.println("Чтобы получить нуль,");
        System.out.println("необходимо произвести "+ k + " действий");
    }

    public static int sumDigits(int a) {
        int sum = 0;
        int x;
        while (a > 0) {
            x = a % 10;
            a = a / 10;
            sum += x;
        }
        return sum;
    }

}