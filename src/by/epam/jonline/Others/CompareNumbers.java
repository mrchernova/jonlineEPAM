package by.epam.jonline.Others;

public class CompareNumbers {
    public static void main(String[] args) {
        int a = 12;
        int b = 4;
        int c = 45;
        int d = 9;
        int min1,min2, min;
        
        if (a < b) { 
            min1 = a;
        }else{
            min1 = b;
        }

        if (c < d) {
            min2 = c;
        }else{
            min2 = d;
        }

        if (min1 < min2) {
            min = min1;
        }else{
            min = min2;
        }

        System.out.println("min = " + min);
        
    }
}
