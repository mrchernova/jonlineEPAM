/**
 * Написать метод, определяющий, в каком из данных двух чисел больше цифр
 */

package by.epam.jonline.module2.decomposition11;

public class Decomposition11 {
    public static void main(String[] args) {
        long a = 10002345;
        long b = 567891011;

        System.out.println("Даны числа:");
        System.out.println(a + " и " + b);

        MoreOrLess(a, b);
    }

    public static void MoreOrLess(long a, long b) {

        int ai = Count(a);
        int bi = Count(b);

        if (ai == bi)
            System.out.println("В обоих числах одинаковое количество цифр");
        else {
            if (ai > bi)
                System.out.println("В числе " + a + " цифр больше");
            else
                System.out.println("В числе " + b + " цифр больше");
        }
    }

    public static int Count(long x) {
        int i = 0;
        while (x > 0) {
            x = x / 10;
            i++;
        }
        return i;
    }

}