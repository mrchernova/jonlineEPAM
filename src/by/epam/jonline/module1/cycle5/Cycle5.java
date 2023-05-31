/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых >=e
 */

package by.epam.jonline.module1.cycle5;

public class Cycle5 {
    public static void main(String[] args) {
        double e = 0.67;
        double sum = 0;
        double a;

        int n = 15;
        int i;

        for (i = 1; i <= n; i++) {
            a = ((1 * Math.pow(3, i)) / (Math.pow(2, i) * Math.pow(3, i))) + ((1 * Math.pow(2, i)) / (Math.pow(3, i) * Math.pow(2, i)));


            if (Math.abs(a) >= e) {
                sum = sum + Math.abs(a);
            }

        }
        System.out.println("Сумма ряда рвна: " + Math.abs(sum));
    }
}
