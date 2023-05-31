/**
 * В строке найти количество цифр
 */

package by.epam.jonline.module3.string_as_array3;

public class StringAsArray3 {
    public static void main(String[] args) {

        String s = "Str123ng and basics 0154f text pr0cessing 4 5";
        System.out.println("Дана строка");
        System.out.println(s);

        char[] c = s.toCharArray();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (((int) s.charAt(s.indexOf(c[i])) >= 48) && ((int) s.charAt(s.indexOf(c[i])) <= 57)) {   //48-57 0-9
                count++;
            }
        }

        System.out.println("\nКоличество цифр в строке");
        System.out.println(count);

    }
}
