/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать
 */

package by.epam.jonline.module3.string_as_object8;


public class StringAsObject8 {
    public static void main(String[] args) {

        String s = "qwerty asdfasdf zxc";
        String max_word = "";

        String[] word = s.split(" ");

        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > max_word.length()) {
                max_word = word[i];
            }
        }
        System.out.println(max_word);

    }
}