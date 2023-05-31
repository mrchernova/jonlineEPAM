/**
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком.
 * Определить количество предложений в строке X
 */

package by.epam.jonline.module3.string_as_object10;

public class StringAsObject10 {
    public static void main(String[] args) {

        String x = "Qwerty asdfasdf zxc. Aaaaaaa! Hlkdf dddld? Gjjjjj.";
        System.out.println(x);

        String[] sentences = x.split("[.!?]");

        System.out.println("Предложений в строке: " + sentences.length);

    }
}