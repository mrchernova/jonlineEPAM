/**
 * 6.  Сортировка Шелла.  Дан  массив  n  действительных  чисел.  Требуется  упорядочить  его  по  возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента a[i] и a[i+1].
 * Если a[i] <= a[i+1], то продвигаются на один элемент вперед.
 * Если a[i] > a[i+1], то производится перестановка и сдвигаются на один элемент назад.
 */

package by.epam.jonline.module2.sort6;

import java.util.Arrays;

public class Sort6 {
    public static void main(String[] args) {

        int tmp;
        int[] a = new int[]{3, 9, 2, 6};
        System.out.println(Arrays.toString(a));

        System.out.println("Shell sort");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1)
                break;
            else {
                while (a[i] > a[i + 1]) {
                    tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;

                    i--;
                    if (i < 0) {
                        i = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
