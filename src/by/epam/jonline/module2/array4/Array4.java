/**
 * Даны действительные числа а1,а2,..., аn. Поменять местами наибольший и наименьший элементы.
 */

package by.epam.jonline.module2.array4;

public class Array4 {
    public static void main(String[] args) {

        double[] a = new double[5];

        double minel = a[0];
        double maxel = a[0];
        int mini = 0;
        int maxi = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = (Math.random() * 20 - 10);

            a[i] = Math.round(a[i] * 1000.0) / 1000.0;

            System.out.print("[" + a[i] + "] ");

            if (a[i] < minel) {
                minel = a[i];
                mini = i;
            }
            if (a[i] > maxel) {
                maxel = a[i];
                maxi = i;
            }
        }

        System.out.println("\n");
        System.out.println("min element = " + minel + " [" + mini + "]");
        System.out.println("max element = " + maxel + " [" + maxi + "]");

        System.out.println("\nnew array");

        a[mini] = maxel;
        a[maxi] = minel;

        for (int j = 0; j < a.length; j++) {
            System.out.print("[" + a[j] + "] ");

        }

    }
}
