/**
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

package by.epam.jonline.module1.cycle1;

import java.util.Scanner;

public class Cycle1 {
    public static void main(String[] args) {

        int n = 0;
        long sum = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число ");
        
        while (!sc.hasNextInt()) {
            System.out.println("Это не целое число. Введите число еще раз");
            sc.next();
        }
            n = sc.nextInt();
            while (n < 0) {
                System.out.println("Введите положительное число ");
                n = sc.nextInt();
            }

        for (int i = 0; i <= n; ++i) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
        
    }
}
