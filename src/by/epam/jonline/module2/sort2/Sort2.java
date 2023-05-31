/**
 * 2. Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm. 
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
 * Дополнительный массив не использовать. 
 */

package by.epam.jonline.module2.sort2;

import java.util.Arrays;

public class Sort2 {
    public static void main(String[] args) {
        int[] a = new int[]{7, 11, 15, 19, 66, 700};
        int[] b = new int[]{5, 25, 50, 66, 88, 99, 100};

        System.out.println("a " + Arrays.toString(a));
        System.out.println("b " + Arrays.toString(b));


// найти наибольший элемент массива
        int maxA = maxElement(a);
        int maxB = maxElement(b);

// новая последовательность чисел
        System.out.println("New array");
        if (maxA > maxB) {
            compareArrays(a, b);
        } else {
            compareArrays(b, a);
        }

    }

    public static int maxElement(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void compareArrays(int[] array1, int[] array2) {
        int k = 0; // чтобы избежать повторений, когда подставится элемент из меньшего массива 

        for (int i = 0; i < array1.length; i++) {
            if (k == array2.length) {
                System.out.print(array1[i] + " ");       // выводятся оставшиеся элементы, когда закончится меньший массив 

            } else {
                for (int j = k; j < array2.length; j++) {

                    if (array1[i] <= array2[j]) {
                        System.out.print(array1[i] + " ");
                        break;
                    } else {
                        System.out.print(array2[j] + " ");
                        k++;
                        if (k == array2.length) {
                            i--;
                            break;
                        }
                    }
                }

            }
        }
    }

}
