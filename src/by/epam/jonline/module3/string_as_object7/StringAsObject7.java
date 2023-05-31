/**
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef"
 */

package by.epam.jonline.module3.string_as_object7;

public class StringAsObject7 {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("abc cde def");

        for (int letter = 0; letter < s.length(); letter++) {
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    s.deleteCharAt(i);
                } else {
                    if (s.charAt(letter) == s.charAt(i)) {
                        count++;
                        if (count > 1) {
                            s.deleteCharAt(i);
                        }
                    }
                }
            }

        }

        System.out.println(s);
    }
}
