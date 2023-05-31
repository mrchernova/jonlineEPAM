/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
 */

package by.epam.jonline.module1.branching3;

public class Branching3 {
    public static void main(String[] args) {

        int x1 = 1; //A
        int y1 = 2; //A

        int x2 = 5; //B
        int y2 = 3; //B

        int x3 = 1; //C
        int y3 = 4; //C

        if ((y2 - y1) * (x3 - x1) - (x2 - x1) * (y3 - y1) == 0) {
            System.out.printf("Точки c координатами А(%s,%s), B(%s,%s), C(%s,%s) лежат на одной прямой",x1,y1,x2,y2,x3,y3);
        } else {
            System.out.printf("Точки c координатами А(%s,%s), B(%s,%s), C(%s,%s) не лежат на одной прямой",x1,y1,x2,y2,x3,y3);
        }
    }
}
