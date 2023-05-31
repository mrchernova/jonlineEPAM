package by.epam.jonline.Others;

import java.util.Scanner;

public class LecM1W5 {
    public static void main(String[] args) {
        int a;
        int b;
        int sum;

        Scanner sc = new Scanner(System.in);


      
        a = enterFromConsole("a >> ");
        b = enterFromConsole("b >> ");


        sum = sum(a,b);

        System.out.println("a + b = " + sum);

    }
    
    public static int sum(int x1, int x2){
        int sum;
        sum = x1 + x2;
        return sum;  // return x1+x2
    }

    public static int enterFromConsole(String message) {
        Scanner sc = new Scanner(System.in);

        int value;

        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print(message);
        }
        value = sc.nextInt();
        return value;


    }


}
