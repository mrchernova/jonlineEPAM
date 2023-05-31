/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

package by.epam.jonline.module1.linear4;

import java.util.Scanner;

public class Linear4 {
    public static void main(String[] args) {
        double n;
        double x;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите действительное число в формате nnn.ddd ");

        // Проверка на число
        while (!sc.hasNextDouble()) {
            System.out.println("Это не число. Введите число в формате nnn.ddd еще раз");
            sc.next();
        }

        // Проверка на размер числа. Оно должно быть положительным и <= 999.999
        n = sc.nextDouble();
        while ((n > 999.999) || (n < 0)) {
            System.out.println("Ваше число >999.999. Попробуйте еще раз ");
            n = sc.nextDouble();
        }
        
        // Обрезка вещественной части до трех знаков
        n = Math.floor(n * 1000) / 1000;    
        System.out.format("Вы ввели: %.3f\n", n);

        //Обмен местами
        x = (n * 1000) % 1000 + (int) n / 1000.0;

        System.out.print("Результат обмена дробной и целой части: ");
        if (x == 0) {
            System.out.println("000.000");
        } else if (x < 10) {
            System.out.println("00" + x);
        } else if (x < 100) {
            System.out.println("0" + x);
        } else {
            System.out.format("%03.3f", x);
        }
    }
}


