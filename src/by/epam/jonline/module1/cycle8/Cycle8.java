/**
 * Даны два числа.
 * Определить цифры, входящие в запись как первого, так и второго числа
 */
package by.epam.jonline.module1.cycle8;

public class Cycle8 {
    public static void main(String[] args) {
        int a = 1236;
        int b = 17681;
        int bb = b;

        int x = 0;
        int y = 0;

        String s = "";

        System.out.println("Первое число = " + a);
        System.out.println("Второе число = " + b);

        while (a > 0) {
            x = a % 10;
            a = a / 10;
            b = bb;

            while (b > 0) {
                y = b % 10;

                if (x == y) {
                    s = s + x;
                }

                b = b / 10;
            }
        }

        System.out.println("Цифры, входящие в оба числа: " + s);                // Надо БЕЗ повторений



    }
}
