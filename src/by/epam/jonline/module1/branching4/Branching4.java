/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие
 */

package by.epam.jonline.module1.branching4;

public class Branching4 {
    public static void main(String[] args) {

        int A = 10;
        int B = 20;

        int x = 10;
        int y = 5;
        int z = 21;

        System.out.printf("Кирпич %sx%sx%s \n", x, y, z);
        System.out.printf("Отверстие %sx%s \n", A, B);

        if (((A >= x) & (B >= y)) || ((A >= y) & (B >= x)) ||
                ((A >= x) & (B >= z)) || ((A >= z) & (B >= x)) ||
                (((A >= z) & (B >= y)) || ((A >= y) & (B >= z)))) {

            System.out.println("Кирпич пройдет через отверстие");
        } else {
            System.out.println("Кирпич не пройдет");
        }
    }
}
