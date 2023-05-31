/**
 * Написать метод, для вычисления суммы факториалов всех нечетных чисел от 1 до 9
 */

package by.epam.jonline.module2.decomposition7;

public class Decomposition7 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {

                System.out.println("Факториал числа " + i + " = " + Factorial(i));
                sum = Sum(i, sum);
                System.out.println("sum = " + sum);
            }
        }

    }


    public static int Factorial(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }

    public static int Sum(int num, int sum) {
        sum = Factorial(num) + sum;
        return sum;
    }

}
