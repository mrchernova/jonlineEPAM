//https://otus.ru/nest/post/956/

/**
 * На плоскости заданы своими координатами  n  точек. Написать метод, определяющий,
 * между какими из пар точек самое большое расстояние. Координаты точек занести в массив
 */

package by.epam.jonline.module2.decomposition4;

import java.util.Arrays;

public class Decomposition4 {
    public static void main(String[] args) {
        int[][] a = new int[][]{{-7, 5}, {-3, -5}, {2, 1}, {6, -6}};

        double max = Length(a[0][0], a[0][1], a[1][0], a[1][1]); //за первоначальное максимальное расстояние возьмем расстояние между первыми двумя точками
        double l;

        int x1max = a[0][0];
        int x2max = a[0][1];
        int y1max = a[1][0];
        int y2max = a[1][1];

        int k = 0;

        System.out.println("Даны координаты точек:");
        System.out.print(Arrays.deepToString(a).replace("],", "] "));
        System.out.println();

        while (k != a.length) {

            for (int i = k; i < a.length - 1; i++) {
                for (int j = 0; j < a[0].length - 1; j++) {

                    System.out.println("\n[" + a[k][j] + "," + a[k][j + 1] + "] " + " [" + a[i + 1][j] + "," + a[i + 1][j + 1] + "]");

                    l = Length(a[k][j], a[k][j + 1], a[i + 1][j], a[i + 1][j + 1]);
                    System.out.println("Расстояние между точками = " + l);

                    if (l > max) {
                        max = l;
                        x1max = a[k][j];
                        y1max = a[k][j + 1];

                        x2max = a[i + 1][j];
                        y2max = a[i + 1][j + 1];
                    }

                }
            }

            k++;
        }

        System.out.println("\nМаксимальное расстояние между точками: " +
                "[" + x1max + "," + y1max + "] [" + x2max + "," + y2max + "]");
        System.out.println("Расстояние = " + max);

    }


    public static double Length(int x1, int y1, int x2, int y2) {
        double d;

        d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return d;
    }

}