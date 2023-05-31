/**
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”
 */

package by.epam.jonline.module3.string_as_object5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAsObject5 {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("akfjmkelvvdaafle");
        System.out.println("Дана строка:");
        System.out.println(s);

        int count = 0;
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher(s);

        while (m.find()) {
            count++;
        }

        if (count == 0) {
            System.out.println("Буквы 'а' в строке " + s + " нет");
        } else {
            System.out.println("Букв 'а' в строке = " + count);
        }

    }
}