package by.epam.jonline.Others;

public class NNum {
    public static void main(String[] args) {
        int a = 1089;
        
        if ((a >= 1000) & (a <= 9999)) {
            if ((a % 17 == 0) || (a % 7 == 0)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
