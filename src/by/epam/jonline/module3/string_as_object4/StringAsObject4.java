/**
 * С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”
 */

package by.epam.jonline.module3.string_as_object4;

public class StringAsObject4 {
    public static void main(String[] args) {

        String s = "информатика";
        System.out.println(s);

        String res_s = s.substring(7, 8) + s.substring(3, 5) + s.substring(7, 8);
        System.out.println(res_s);


    }
}