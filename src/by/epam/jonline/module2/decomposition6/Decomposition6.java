/**
 * Написать метод, проверяющий, являются ли данные три числа взаимно простыми
 */

package by.epam.jonline.module2.decomposition6;

import java.util.Arrays;

public class Decomposition6 {
    public static void main(String[] args) {
        int[] array = new int[3];

        initArray(array);
        System.out.println(Arrays.toString(array));

        if (NOD3(array) == 1) {
            System.out.println("Числа взаимно простые");
        }else {
            System.out.println("Числа не взаимно простые");
        }
    }

    public static void initArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 20);
        }
    }

    public static int NOD3(int[] a) {
        int t = a[0];
        for (int i = 1; i < a.length; i++) {
            t = NOD(t, a[i]);
        }
        return t;
    }

    public static int NOD(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

}