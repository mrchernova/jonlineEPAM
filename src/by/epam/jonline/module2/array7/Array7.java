/**
 * Даны действительные числа a1,a2...an (! a1,a2...a2n).
 * Найти max(a1 + a2n, a2 + a2n-1, ... an + an+1)
 */

package by.epam.jonline.module2.array7;

public class Array7 {
    public static void main(String[] args) {
        int n = 7;
        int nn = n * 2;

        double maxsum;

        double[] a = new double[nn];
        double[] sum = new double[n];

        System.out.println("Даны действительные числа:");
        for (int i = 0; i < a.length; i++) {
            a[i] = (Math.random() * 20);
            a[i] = Math.ceil(a[i] * 10) / 10;
            System.out.print("[" + a[i] + "] ");
        }


        System.out.println("\n\nmax(a1 + a2n, a2 + a2n-1, ... , an + an+1) = ");
        for (int i = 0; i < a.length; i++) {
            if (i < nn) {
                sum[i] = a[i] + a[nn - 1];
                sum[i] = Math.ceil(sum[i] * 10) / 10;
                System.out.print("[" + sum[i] + "] ");
                nn--;
            }
        }
        maxsum = sum[0];
        for (int i = 0; i < sum.length; i++) {
            if (maxsum < sum[i]) {
                maxsum = sum[i];
            }
        }

        System.out.println("\n\nmax = " + maxsum);

    }
}
