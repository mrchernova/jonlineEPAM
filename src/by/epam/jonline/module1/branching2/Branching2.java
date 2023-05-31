/**
 * Найти max{ min(a,b), min(c,d) }
 */

package by.epam.jonline.module1.branching2;

public class Branching2 {
    public static void main(String[] args) {
        int a = 12;
        int b = 3;
        int c = 0;
        int d = 0;
        System.out.printf("Даны переменные:\n a = %s\n b = %s\n c = %s\n d = %s \n",a,b,c,d);
        System.out.println("Найти max{ min(a,b), min(c,d) }");
        System.out.println("max = " + Math.max(Math.min(a, b), Math.min(c, d)));
    }
}
