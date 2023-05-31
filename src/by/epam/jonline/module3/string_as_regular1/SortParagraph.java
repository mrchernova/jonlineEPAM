package by.epam.jonline.module3.string_as_regular1;

import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortParagraph {
    public static void main(String[] args) {


        String s = "A1 code 2 learn java tutorial. qqqqqqq. qqq111.\n" +
                "A2 code tutorial. www? www! wwww.\n" +
                "A3 learn java tutorial.";

        System.out.println(sortParagraph(s));
    }

        // сортировка абзацев по количеству предлжений
        public static StringBuilder sortParagraph (String str){
            String[] paragraph = str.split("\n"); //разделит всю строку на несколько
            System.out.println(paragraph.length + " - counts of paragraphs");
            for (int i = 0; i < paragraph.length - 1; i++) {

                for (int j = i + 1; j < paragraph.length; j++) {
                    int countI = countSentences(paragraph[i]);
                    int countJ = countSentences(paragraph[j]);
                    if (countI > countJ) {
                        String temp = paragraph[i];
                        paragraph[i] = paragraph[j];
                        paragraph[j] = temp;
                    }
                }
            }
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < paragraph.length; i++) {
                result.append(paragraph[i] + "\n");
            }
            return result;
        }

    // находим количество предложений в 1-ном абзаце
    public static int countSentences (String str){
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 1; i < chars.length; i++) {
            if ((chars[i] == '.') || (chars[i] == '!') || (chars[i] == '?')) {
                count++;
            }
        }
        return count;
    }

    }

