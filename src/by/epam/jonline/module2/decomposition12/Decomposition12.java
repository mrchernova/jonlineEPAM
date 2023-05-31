/**
 * Даны натуральные числа К и N.  Написать метод(методы)  формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N
 */

package by.epam.jonline.module2.decomposition12;

import java.util.ArrayList;
import java.util.Arrays;

public class Decomposition12 {
    public static void main(String[] args) {

        int k = 3;
        int n = 40;

        System.out.println("k = " + k);
        System.out.println("n = " + n);

        System.out.println("Массив, элементами которого являются числа, сумма цифр которых равнв K и которые <N");
        toArray(k, n);
    }

    public static void toArray(int k, int n) {
        int x;
        ArrayList<Integer> alist = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            int sum = 0;
            int a = i;

            while (a > 0) {
                x = a % 10;
                a = a / 10;
                sum += x;
            }

            if (sum == k)
                alist.add(i);

        }
        System.out.println(Arrays.toString(alist.toArray()));
    }

}