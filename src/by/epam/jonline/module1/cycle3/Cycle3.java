/**
 * Найти сумму квадратов первых ста чисел
 */

package by.epam.jonline.module1.cycle3;

public class Cycle3 {
    public static void main(String[] args) {
        int i;
        double x = 0;
        for (i = 1; i <= 100; i++) {
            x = x + Math.pow(i, 2);
        }
        System.out.println("Сумма квадратов первых 100 чисел = " + (int) x);
    }
}
