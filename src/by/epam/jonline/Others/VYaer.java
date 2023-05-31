package by.epam.jonline.Others;

public class VYaer {
    public static void main(String[] args) {

        int y = 2009;

        if ((y % 4 == 0) & (y % 100 != 0) || (y % 400 == 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
