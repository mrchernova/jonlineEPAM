/**
 * Вычислить площадь правильного шестиугольника со стороной а,
 * используя метод вычисления площади треугольника
 */

package by.epam.jonline.module2.decomposition3;

public class Decomposition3 {
    public static void main(String[] args) {

        int a = 5;
        double S;

        System.out.println("Дана сторона а = " + a);
        System.out.println("Площадь правильного шестиугольника вычисляется по формуле S=6(a*a * (sqrt(3)/4) )");
        S = 6 * S_triangle(a);

        System.out.println("Площадь равна " + S);
    }

    public static double S_triangle(int a) {
        double s_tr;
        s_tr = Math.pow(a, 2) * (Math.sqrt(3) / 4);
        return s_tr;
    }
}
