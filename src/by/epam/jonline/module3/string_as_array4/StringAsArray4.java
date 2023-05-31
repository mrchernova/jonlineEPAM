/**
 * В строке найти количество чисел
 */

package by.epam.jonline.module3.string_as_array4;

public class StringAsArray4 {
    public static void main(String[] args) {

        String s = "Str123ng and basics 0154f text pr0cessing 4 5";     // answer 5
        System.out.println("Дана строка");
        System.out.println(s);

        char[] c = s.toCharArray();
        int count = 0;
        boolean isDigit = false;

        for (int i = 0; i < s.length(); i++) {
            if (!isDigit) {
                //if c[i] is digit then count+1 and flag isDigit = true
                if (((int) s.charAt(s.indexOf(c[i])) >= 48) && ((int) s.charAt(s.indexOf(c[i])) <= 57)) {
                    isDigit = true;
                    count++;
                }

            } else {
                // if flag isDigit = true, check if c[i] still digit.
                if (((int) s.charAt(s.indexOf(c[i])) >= 48) && ((int) s.charAt(s.indexOf(c[i])) <= 57)) {
                    //do nothing
                } else {
                    isDigit = false;
                }
            }
        }

        System.out.println("\nКоличество чисел в строке");
        System.out.println(count);

    }
}
