/**
 * Проверить, является ли заданное слово полиндромом
 */

package by.epam.jonline.module3.string_as_object3;

public class StringAsObject3 {
    public static void main(String[] args) {

        String s = "javavaj";
        StringBuffer sb = new StringBuffer(s);

        sb = sb.reverse();

        if (s.equals(String.valueOf(sb))) {
            System.out.println(s + " - полиндром");
        } else {
            System.out.println(s + " - не полиндром");
        }

    }
}
