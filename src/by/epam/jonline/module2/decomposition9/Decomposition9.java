/**
 * Даны числа X,Y,Z,T - длины сторон четырехугольника.
 * Написать метод вычисления его площади, если угол
 * между сторонами длиной X и Y - прямой
 */

package by.epam.jonline.module2.decomposition9;

public class Decomposition9 {
    public static void main(String[] args) {
        double X = 6;
        double Y = 4;
        double Z = 5;
        double T = 3;
        double C;
        double S;

        C = Gipotenuza(X, Y);

        S = S_tr(X, Y, C) + S_tr(Z, T, C);

        System.out.print("Площадь четырехугольника = ");
        System.out.printf("%.2f", S);
    }

    public static double Gipotenuza(double b, double a) {
        double c;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }

    // нахождение площади прямоугольного треугольника по трем сторонам
    public static double S_tr(double a, double b, double c) {
        double s;
        double p;

        p = (a + b + c) / 2;
        s = Math.sqrt((p * (p - a) * (p - b) * (p - c)));

        return s;
    }
}
