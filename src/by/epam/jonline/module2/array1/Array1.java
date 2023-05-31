/**
 * В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
 */

package by.epam.jonline.module2.array1;

public class Array1 {
    public static void main(String[] args) {

        int[] a = {24, 8, 13};
        double k = 4;
        int sum = 0;
        double d;

        for (int i = 0; i < a.length; i++) {
            d = a[i] % k;
            
            if (d == 0) {
                sum = sum + a[i];
            }
        }
        System.out.println(sum);
    }
}
