package by.epam.jonline.module3.regex1.Step5Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortParagraph_old {
    public static void sortParagraph(String s) {
        String[] paragraphs = s.split("\n");
        String[] sentences = {};
        List<String> listOfSentences = new ArrayList<String>();
        List<String> listOfParagraphs = new ArrayList<String>();

        for (int i = 0; i < paragraphs.length; i++) {
            sentences = paragraphs[i].split("[.!?]");


            //     Form.outputArea.append(Arrays.toString(new String[]{paragraphs[i]}) + "\n");    //выводит предложение с точкой
       //     Form.outputArea.append(Arrays.toString(sentences) + "\n");                      //выводит предложение без точки



            for (int j = 0; j < sentences.length; j++) {

            }
            Form.outputArea.append("Предложений в абзаце: " + sentences.length + "\n");


        }
        listOfParagraphs = Arrays.asList(paragraphs);
        Collections.sort(listOfParagraphs); //сортирует по алфавиту

        listOfParagraphs.forEach(System.out::println);

    }
}
