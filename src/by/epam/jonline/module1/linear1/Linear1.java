/**
 * Найдите значение функции: z = (( a - 3 ) * b / 2) + c
 */
package by.epam.jonline.module1.linear1;

public class Linear1 {
    public static void main(String[] args) {

        System.out.println("z = (( a - 3 ) * b / 2) + c");
        double a = 4;
        double b = 7;
        double c = 1;
        double z;

        z = ((a - 3) * b / 2) + c;
        System.out.println("Значение функции z = " + z);
    }
}
