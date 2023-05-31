package by.epam.jonline.Others;

public class Chess2 {
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;

        if ((Math.abs(x1 - x2) < 2) & (Math.abs(y1 - y2) < 2)) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }


    }
}
