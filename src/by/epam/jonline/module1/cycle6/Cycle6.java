/**
 * Вывести на экран соответствий между символами и их численными обозначениями
 * в памяти компьютера
 */

package by.epam.jonline.module1.cycle6;

public class Cycle6 {
    public static void main(String[] args) {

        int code;

        for (code = 32; code <= 126; code++) {
            System.out.println(code + " = " + (char) code);
        }
    }
}
