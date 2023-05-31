/**
 * Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (x,y) принадлежит закрашенной области,
 * и false -  в противоном случае
 */
package by.epam.jonline.module1.linear6;

import java.util.Scanner;

public class Linear6 {
    public static void main(String[] args) {

        int x, y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число х ");
        x = sc.nextInt();

        System.out.println("Введите целое число y ");
        y = sc.nextInt();

        if ((x <= 2 & x >= -2) & (y >= 0 & y <= 4) || (x >= -4 & x <= 4) & (y <= 0 & y >= -3)) {
            System.out.println("Точка с координатами (" + x + "," + y + ") принадлежит области");
        } else {
            System.out.println("Точка с координатами (" + x + "," + y + ") не принадлежит области");
        }


    }
}
