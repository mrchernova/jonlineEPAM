/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n  -  заданное натуральное число больше 2.
 * Для решения задачи использовать декомпозицию
 */

package by.epam.jonline.module2.decomposition13;

import java.util.ArrayList;

public class Decomposition13 {
    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<>();

        int n = 50;

        System.out.println("Массив простых чисел в диапазоне [" + n + ".." + 2 * n + "]");
        System.out.println(initSimpleArray(alist, n));


        System.out.println("Все пары «близнецов» из отрезка");
        checkTwins(alist);
    }

    public static ArrayList<Integer> initSimpleArray(ArrayList<Integer> alist, int n) {
        for (int i = n; i <= 2 * n; i++) {
            int k = 0;
            for (int s = 1; s <= i; s++) {
                if (i % s == 0) k++;
            }
            if (k == 2) alist.add(i);
        }
        return alist;
    }


    public static void checkTwins(ArrayList<Integer> alist) {
        for (int i = 0; i < alist.size() - 1; i++) {
            if ((alist.get(i) - alist.get(i + 1) == -2)) {
                System.out.println(alist.get(i) + " и " + alist.get(i + 1));
            }
        }
    }

}