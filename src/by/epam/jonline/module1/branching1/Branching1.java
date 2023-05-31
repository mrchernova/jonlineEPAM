/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным.
 */

package by.epam.jonline.module1.branching1;

public class Branching1 {
    public static void main(String[] args) {
        int a = 91;
        int b = 55;
        int c;

        c = 180 - a - b;

        if (c > 0) {
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Прямоугольный треугольник");
            } else {
                System.out.println("Треугольный треугольник");
            }
        } else {
            System.out.println("Не треугольник");
        }
    }
}
