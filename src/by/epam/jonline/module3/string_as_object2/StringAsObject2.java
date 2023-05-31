/**
 * В строке вставить после каждого символа 'a' символ 'b'
 */

package by.epam.jonline.module3.string_as_object2;



public class StringAsObject2 {
    public static void main(String[] args) {

        String s = "String and basics of text processinga";
        System.out.println("Дана строка: ");
        System.out.println(s);

        System.out.println("\nСтрока, после добавления символа 'b' после каждого символа 'a'");
        System.out.println(s.replaceAll("[a]", "$0b"));

    }
}