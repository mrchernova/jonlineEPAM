/**
 * Замените в строке все вхождения 'word' на 'letter'.
 */

package by.epam.jonline.module3.string_as_array2;

public class StringAsArray2 {
    public static void main(String[] args) {

        String s1 = "Microsoft word, wordPad, wordpress";
        String s2 = "word";

        char[] c2 = s2.toCharArray();

        System.out.println(s1);

        for (int i = 0; i < s1.length(); i++) {

            char[] c1 = s1.toCharArray();

            if (c1[i] == c2[0]) {
                int k = i;
                int count = 0;

                // check if string contain 'word'
                for (int j = 0; j < s2.length(); j++) {
                    if (c2[j] == c1[k]) {
                        k++;
                        count++;
                    } else {
                        break;
                    }
                }

                if (count == s2.length()) {
                    // return to 'w' position and replace word
                    s1 = s1.substring(0, i) + "letter" + s1.substring(i + c2.length);
                }

            }

        }
        System.out.println(s1);

    }
}