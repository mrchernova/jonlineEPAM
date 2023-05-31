/**
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить
 */

package by.epam.jonline.module3.string_as_array5;

public class StringAsArray5 {
    public static void main(String[] args) {

        //  String s = "  String and basics of   text processing  ";
        String s = "  10    2     ";
        System.out.println("Дана строка:");
        System.out.println(s);
        char[] c = s.toCharArray();


        int len = s.length();
        boolean first = true;

        System.out.println("После удаления пробелов:");
        for (int i = 0; i < len; i++) { // len-1 для i+1

            if (first == true) {
                // если c[i] != " " значит оно буква и флаг  first  перевести в false
                if (c[i] != ' ') {
                    first = false;
                    System.out.print(c[i]);
                } else {
                    len--;
                }

            } else {
                System.out.print(c[i]);
                // если внутри строки несколько пробелов подряд, то вот это
                while ((c[i] == ' ') && (c[i + 1] == ' ')) {
                    i++;
                    len--;
                }
            }

        }

    }
}