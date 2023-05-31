/**
 * Написать метод для нахождения НОД и НОК двух натуральных чисел
 */

package by.epam.jonline.module2.decomposition1;

public class Decomposition1 {
    public static void main(String[] args) {

        int a = 15;
        int b = 10;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("NOK = " + NOK(a, b));
        System.out.println("NOD = " + NOD(a, b));

    }

    //lcm - least common multiple
    public static int NOK(int a, int b) {
        a = (a * b) / NOD(a, b);
        return a;
    }

    //gcd - greatest common divisor
    public static int NOD(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }


}


