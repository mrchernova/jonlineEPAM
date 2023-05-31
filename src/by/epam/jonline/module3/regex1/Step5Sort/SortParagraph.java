/**
 * Параграфы отсортированы по количеству в них предложений
 */
package by.epam.jonline.module3.regex1.Step5Sort;

public class SortParagraph {
    public static void sortParagraph(String s) {

        String[] paragraph = s.split("\n");

        Form.outputArea.setText("");
        for (int i = 0; i < paragraph.length; i++) {
            for (int j = i + 1; j < paragraph.length; j++) {

                int tmp = paragraph[i].split("[.!?]").length;
                String tmps = paragraph[i];

                if (tmp > paragraph[j].split("[.!?]").length) {
                    String x = paragraph[j];
                    paragraph[i] = x;
                    paragraph[j] = tmps;
                }

            }
            Form.outputArea.append(paragraph[i] + "\n");
        }

    }
}


