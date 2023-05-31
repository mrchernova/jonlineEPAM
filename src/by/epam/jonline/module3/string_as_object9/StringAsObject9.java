/**
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
 * Учитывать только английские буквы
 */

package by.epam.jonline.module3.string_as_object9;

public class StringAsObject9 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("F_hd wewe_EEE_df");
        System.out.println(sb);

        int countSmall = 0;
        int countBig = 0;

        for (int i = 0; i < sb.length(); i++) {

            if ((sb.charAt(i) >= 'A') && (sb.charAt(i) <= 'Z')) {
                countBig++;
            }
            if ((sb.charAt(i) >= 'a') && (sb.charAt(i) <= 'z')) {
                countSmall++;
            }
        }
        System.out.println("Количество прописных букв = " + countBig);
        System.out.println("Количество строчных букв = " + countSmall);


    }
}