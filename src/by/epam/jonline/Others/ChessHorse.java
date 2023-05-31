/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
 */

package by.epam.jonline.Others;

public class ChessHorse {
    public static void main(String[] args) {

        int x1 = 4; //A
        int y1 = 4; //A

        int x2 = 2; //B
        int y2 = 3; //B

        

        if (((Math.abs(x1-x2)==2) & (Math.abs(y1-y2)==1)) || ((Math.abs(x1-x2)==1) & (Math.abs(y1-y2)==2))) {
            System.out.printf("конь");
        } else {
            System.out.printf("не конь");
        }
    }
}
