/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * ((sin[x]+cos[y]) / (cos[x]-sin[y])) * tg[xy]
 */

package by.epam.jonline.module1.linear3;

public class Linear3 {
    public static void main(String[] args) {

        double degreesx = 30;
        double degreesy = 30;

        System.out.println("x = " + degreesx);
        System.out.println("y = " + degreesy);
        
        double radiansx = Math.toRadians(degreesx);
        double sinx = Math.sin(radiansx);
        double cosx = Math.cos(radiansx);

        double radiansy = Math.toRadians(degreesy);
        double siny = Math.sin(radiansy);
        double cosy = Math.cos(radiansy);
        
        double tgxy = (sinx / cosx) * (siny / cosy);
        double z = (sinx / cosx) * (siny / cosy) * tgxy;
        System.out.format("Значение выражения \n((sin[x] + cos[y]) / (cos[x] - sin[y])) * tg[xy] = %.3f", z);
        
    }
}
