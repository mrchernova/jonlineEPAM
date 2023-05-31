/**
 * Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах
 * в следующей форме: HHч MMмин SSс
 */
package by.epam.jonline.module1.linear5;

import java.util.Scanner;

public class Linear5 {
    public static void main(String[] args) {

        int T, h, m, s;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число T ");
        T = sc.nextInt();
        h = T / 3600;
        m = (T - h * 3600) / 60;
        s = (T - h * 3600) - 60 * m;
        System.out.printf("%02dч %02dмин %02dс", h, m, s);

    }
}

