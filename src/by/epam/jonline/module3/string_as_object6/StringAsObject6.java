/**
 * Из заданной строки получить новую, повторив каждый символ дважды
 */

package by.epam.jonline.module3.string_as_object6;

public class StringAsObject6 {
    public static void main(String[] args) {
        String s = "salo";
        String ss = "";

        System.out.println("string 1: " + s);
        char[] c = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            ss = ss + s.charAt(i) + s.charAt(i);
        }
        System.out.println("string 2: " + ss);
    }
}
