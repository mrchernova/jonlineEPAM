/**
 * Дан  массив  действительных  чисел,  размерность  которого N.
 * Подсчитать,  сколько  в  нем  отрицательных, положительных и нулевых элементов
 */

package by.epam.jonline.module2.array3;

public class Array3 {
    public static void main(String[] args) {

        byte otr = 0;
        byte nul = 0;
        byte pol = 0;

        byte n = 4;

        double[] a = new double[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random() * 4 - 2;

            a[i] = Math.ceil(a[i] * 10) / 10;

            System.out.print("[" + a[i] + "] ");

            if (a[i] == 0) {
                nul++;

            } else {
                if (a[i] > 0) {
                    pol++;
                } else {
                    otr++;
                }
            }
        }
        System.out.println();
        System.out.println(otr + " отрицательных элементов");
        System.out.println(nul + " нулевых элементов");
        System.out.println(pol + " положительных элементов");
    }
}
