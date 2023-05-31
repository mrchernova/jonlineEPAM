/**
 * Написать  программу,  определяющую  сумму  n  -  значных  чисел,  содержащих  только  нечетные  цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию
 */

package by.epam.jonline.module2.decomposition16;

public class Decomposition16 {
    public static void main(String[] args) {

        byte n = 4; //  number must contain n digits
        int a;
        int countEvenDig;

        int min = (int) Math.pow(10, (n - 1)); // min number from n digits
        int max = (int) Math.pow(10, n) - 1; // max number from n digits
        System.out.println(min + " " + max);

        for (int i = min; i <= max; i++) {

            a = sumOddDigits(i);
            countEvenDig = countEvenDigitsInSum(a);
            if (a != -1) {
                System.out.println("число=" + i + "   сумма цифр=" + a + "   четных цифр в сумме=" + countEvenDig);
            }

        }

    }

    public static int sumOddDigits(int a) {
        int sum = 0;
        boolean f = false; //flag on even digit

        while (a > 0) {
            int x = a % 10;
            a = a / 10;

            if (x % 2 != 0) {
                sum += x;
            } else {
                f = true;
            }
        }
        if (f) sum = -1;
        return sum;
    }


    public static int countEvenDigitsInSum(int b) {
        int count = 0;

        while (b > 0) {
            int x = b % 10;
            b = b / 10;

            if (x % 2 == 0) count++;
        }
        return count;
    }

}