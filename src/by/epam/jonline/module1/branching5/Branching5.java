/**
 * Вычислить значение функции F(x)
 * F(x) = Math.pow(x, 2) - 3 * x + 9, если x <= 3
 * F(x) = 1 / (Math.pow(x, 3) + 6), если x > 3
 */

package by.epam.jonline.module1.branching5;

public class Branching5 {
    public static void main(String[] args) {
     
        int x = 4;
        double z;

        System.out.println("x = " + x);

        if (x <= 3) {
            z = Math.pow(x, 2) - 3 * x + 9;
        } else {
            z = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("Значение функции F(x) = " + z);
    }
}
