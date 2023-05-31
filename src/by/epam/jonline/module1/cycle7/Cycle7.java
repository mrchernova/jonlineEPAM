/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа
 */

package by.epam.jonline.module1.cycle7;

import java.util.Scanner;

public class Cycle7 {
    public static void main(String[] args) {
        int m, n;
        int i, j;
        int a;
        boolean del;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите через пробел промежуток от m до n ");
        m = sc.nextInt();
        n = sc.nextInt();

        for (i = m; i <= n; i++) {
            a = i;
            System.out.print("Делители для числа " + a + " = ");
            del = false;
            for (j = 2; j < a; j++)
                if (a % j == 0) {
                    System.out.print(j + " ");
                    del = true;
                }
            if (!del) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
