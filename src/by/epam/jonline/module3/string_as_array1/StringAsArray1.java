/**
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
 */

package by.epam.jonline.module3.string_as_array1;

import java.util.Arrays;

public class StringAsArray1 {
    public static void main(String[] args) {
        String[] s = new String[]{"oneStringArray", "twoString", "строкаТри"};
        System.out.println("Дана строка в camelCase:");
        System.out.println(Arrays.toString(s));

        for (int i = 0; i < s.length; i++) {
            for (int l = 0; l < s[i].length(); l++) {

                int x = (int) s[i].charAt(l); //get ascii of char

                if ((x >= 65 && x <= 90) || (x >= 1040 && x <= 1071)) {
                    s[i] = s[i].substring(0, s[i].indexOf(x)) + "_" + s[i].substring(s[i].indexOf(x));
                    l++;    //string became longer
                }
            }
            s[i] = s[i].toLowerCase();
        }
        System.out.println("Полученная строка в snake_case:");
        System.out.println(Arrays.toString(s));
    }
}
