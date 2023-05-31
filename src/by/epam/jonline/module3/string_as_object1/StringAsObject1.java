/**
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем
 */

package by.epam.jonline.module3.string_as_object1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAsObject1 {
    public static void main(String[] args) {

        String s = "work  with string";
        System.out.println("Дана строка: ");
        System.out.println(s);

        Pattern p = Pattern.compile("\\s+");
        Matcher m = p.matcher(s);

        int max_space = 0;
        while (m.find()) {

            if (max_space < m.group().length()) {
                max_space = m.group().length();
            }
        }
        if (max_space != 0) {
            System.out.println("\nМаксимальное количество пробелов в строке = " + max_space);
        } else {
            System.out.println("В строке нет ни одного пробела");
        }

    }
}
