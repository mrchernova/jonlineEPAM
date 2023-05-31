/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * ((sin[x]+cos[y]) / (cos[x]-sin[y])) * tg[xy]
 */

package by.epam.jonline.module1.linear3;

public class Linear3ver2 {
    public static void main(String[] args) {

        double x = 30;
        double y = 30;
        
        double xy = x*y;
        double tgxy = Math.sin(xy) / Math.cos(xy);

        double answer = ((Math.sin(x)+Math.cos(y))*tgxy) / (Math.cos(x)-Math.sin(y));
        System.out.println(answer);
        
       
    }
}
