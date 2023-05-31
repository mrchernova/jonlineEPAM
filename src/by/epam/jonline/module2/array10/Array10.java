/**
 * 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
 * (освободившиеся элементы заполнить нулями).Примечание. Дополнительный массив не использовать.
 */

package by.epam.jonline.module2.array10;

public class Array10 {
    public static void main(String[] args) {

        int n = 3;
        int k = 0;
        int[] a = new int[n];


        System.out.println("Дан массив:");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            k++;
            i++;

        }
        
        if (n % 2 != 0) {
            k--;
        }

        for (int i = a.length - k; i < a.length; i++) {
            a[i] = 0;
            System.out.print(a[i] + " ");
        }

    }
}
