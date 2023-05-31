/**
 * Вычислить значения функции на отрезке [a,b] с шагом h 
 */
package by.epam.jonline.module1.cycle2;

import java.util.Scanner;

public class Cycle2 {
    public static void main(String[] args) {

        int a, b;
        int h;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Используйте натуральные числа!");
        System.out.println("Введите через пробел отрезок [a,b] ");
        a = sc.nextInt();
        b = sc.nextInt();
       
        System.out.println("Задайте шаг h");
        h = sc.nextInt();

        while (a <= b) {
            if (a <= 2) {
                System.out.println("y(" + a + ") = " + -a);
            } else if (a > 2) {
                System.out.println("y(" + a + ") = " + a);
            }
            a = a + h;
        }
    }
}
