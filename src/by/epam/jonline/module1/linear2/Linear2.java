/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * ((b+ Math.sqrt(Math.pow(b,2) + (4*a*c)))/(2*a)) - Math.pow(a,3)*c + Math.pow(b,-2)
 */
package by.epam.jonline.module1.linear2;

public class Linear2 {
    public static void main(String[] args) {

        System.out.println("z = ((b + Math.sqrt(Math.pow(b,2) + (4 * a * c))) / (2 * a)) - Math.pow(a,3) * c + Math.pow(b,-2)");
        double a = 5;
        double b = 1.1;
        double c = 1;
        double z;

        if (a == 0) {
            System.out.println("dividing by zero");

        } else {
            z = ((b + Math.sqrt(Math.pow(b, 2) + (4 * a * c))) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.format("%.3f", z);
        }

    }


}
