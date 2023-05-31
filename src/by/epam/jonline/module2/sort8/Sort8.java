/**
 * Даны дроби
 * Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания
 */

package by.epam.jonline.module2.sort8;

public class Sort8 {

    public static void main(String[] args) {

        int[][] arrayFractions = new int[][]{{9, 1, 2, 5}, {2, 16, 12, 5}};
        int maxd;
        int nok;

        System.out.println("Given fractions:");
        printArray(arrayFractions);

        maxd = maxDenArray(arrayFractions);
        
        nok = NOK(arrayFractions, maxd);
        System.out.println("\nNOK = " + nok);

        setCommonDenominator(arrayFractions, nok);

        System.out.println("\nFractions with common denominator:");
        printArray(arrayFractions);


        System.out.println("\nSort fractions:");
        
        int minn;
        int i = 0;
        int temp;
        
        while (i < arrayFractions[0].length) {
            minn = minNumArray(arrayFractions[0], i);

            // sort [chois] numerators [from min to max]
            temp = arrayFractions[0][i];
            arrayFractions[0][i] = arrayFractions[0][minn];
            arrayFractions[0][minn] = temp;

            //print sort array
            System.out.print(arrayFractions[0][i] + "/" + arrayFractions[1][i] + "  ");
            i++;
        }
   
    }
    


    // search min numerators 
    public static int minNumArray(int[] array, int x) {
        int min = array[x];
        int k = x;
        for (int i = x; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
                k = i;
            }
        }
        return k;
    }


    public static void setCommonDenominator(int[][] a, int n) {
        int x;
        for (int i = 0; i < a[0].length; i++) {

            x = n / a[1][i]; //x - число, на которое будет домножаться числитель

            a[0][i] = a[0][i] * x;
            a[1][i] = n;

        }
    }


    //find NOK for all denominators
    public static int NOK(int[][] a, int md) {

        int count = 0;  //check if MAX divided into each denominator without fraction part
        int k = 1;      // index multiply

        while (count != a[1].length) { //This count should be equal with length array 
            count = 0;
            for (int i = 0; i < a[1].length; i++) {
                if ((md * k) % a[1][i] == 0) {
                    count++;
                } else {
                    k++;
                    break;
                }
            }
        }
        return md * k; // this is NOK
    }

    
    // max in denominators    
    public static int maxDenArray(int[][] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[1][i] > max) {
                max = a[1][i];
            }
        }
        return max;
    }


    public static void printArray(int[][] a) {
        for (int i = 0; i < a[0].length; i++) {
            System.out.print(a[0][i] + "/" + a[1][i] + "  ");
        }
        System.out.println();
    }

}