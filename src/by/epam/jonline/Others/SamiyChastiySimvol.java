package by.epam.jonline.Others;

public class SamiyChastiySimvol {
    public static void main(String[] args) {

        String str = "aaabcbba";
        char[] c = str.toCharArray();
        int x;
        int max = 1;
        String maxchar = "";

        for (int i = 0; i < str.length(); i++) {
            x = 0;
            for (int j = i; j < str.length(); j++) {

                if (c[i] == c[j]) {

                    x++;
                    System.out.print(c[i] + " and " + c[j] + " " + x + " | ");
                    if (x >= max) {
                        max = x;
                        maxchar = Character.toString(c[i]);
                    }

                }

            }
            System.out.println();
        }
        System.out.println("max " + max + ". maxchar " + maxchar);

    }
}

