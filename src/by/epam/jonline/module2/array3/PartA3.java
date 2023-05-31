package by.epam.jonline.module2.array3;

public class PartA3 {
    public static void main(String[] args) {

        byte n = 4;

        double[] a = new double[n];
   
        for (int i = 0; i < a.length; i++) {

            a[i] = Math.random() * 4 - 2;                       
            System.out.println("a[i] " + a[i]);

            double scale = Math.pow(10, 3);                     
            System.out.println("scale " + scale);

            double res = Math.floor(a[i] * scale) / scale;     
            System.out.println("res " + res);
            
            System.out.println();


            
        }
     
    }
}
