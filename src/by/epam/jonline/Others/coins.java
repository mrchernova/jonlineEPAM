package by.epam.jonline.Others;

public class coins {
    public static void main(String[] args) {

        int vsego = 0;
        int n = 107;
        int a = 0;

        while (n / 25 != 0) {
            a++;
            vsego++;
            n = n - 25;
        }
        System.out.println(a + " монеты по 25");

        a = 0;
        while (n / 10 != 0) {
            a++;
            vsego++;
            n = n - 10;
        }
        System.out.println(a + " монеты по 10");

        a = 0;
        while (n / 5 != 0) {
            a++;
            vsego++;
            n = n - 5;
        }
        System.out.println(a + " монеты по 5");

        a = 0;
        while (n / 1 != 0) {
            a++;
            vsego++;
            n = n - 1;
        }
        System.out.println(a + " монеты по 1");
        System.out.println("vsego monet = " + vsego);

    }

}
