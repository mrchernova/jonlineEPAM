/**
 * Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую
 * последовательность (например, 1234, 5789).
 * Для решения задачи использовать декомпозицию
 */

package by.epam.jonline.module2.decomposition15;

public class Decomposition15 {
    public static void main(String[] args) {

        byte n = 4; //  number must contain n digits
        int a;

        int min = (int) Math.pow(10, (n - 1)); // min number from n digits
        int max = (int) Math.pow(10, n) - 1; // max number from n digits
        System.out.println(min + " " + max);

        System.out.println("Числа,  цифры  в  которых  образуют  строго  возрастающую последовательность");
        for (int i = min; i <= max; i++) {

            a = checkOnIncreasing(i);
            if (a > -1) {
                System.out.print(i + " ");
            }
        }
    }


    public static int checkOnIncreasing(int a) {
        int c = (a % 10) + 1; // точка отсчета - последняя цифра числа. +1 чтобы if  в первый раз был true

        while (a > 0) {
            int x = a % 10;
            a = a / 10;

            if (x < c) {
                c = x;
            } else {
                a = -1;
            }
        }
        return a;
    }
}