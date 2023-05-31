package by.epam.jonline.module3.regex1.Step5Sort.Test2SortWord;

import java.util.Arrays;

// сортировка по количеству слов в предложении
public class second {
    public static void main(String[] args) {

        StringBuilder text = new StringBuilder(
                "В этой статье речь пойдет про одну. "
                        + "Из немногих социальных программ, ориентированную на пользователей, "
                        + "которые проводят много времени на различных форумах. Скачать "
                        + "Tapatalk для андроид и установить себе на телефон можно "
                        + "воспользовавшись. Гугл плеймаркетом, все очень просто и займет "
                        + "по времени не более пяти минут.");

        // эта штука разбивает текст на строки
        String s[] = text.toString().trim().split("[.!?]\\s*");

        // создаются массивы с количеством полученных строк
        int arr[] = new int[s.length];
        System.out.println(Arrays.toString(arr));
        int k[] = new int[s.length];
        System.out.println(Arrays.toString(k));




        for (int i = 0; i <= s.length - 1; i++) {
            int t = 0;
            String w[] = s[i].toString().trim().split(" "); // разбивает строку на слова
            for (int j = 0; j <= w.length - 1; j++) {
                t++;
            }
            arr[i] = t;
            k[i] = t;

            System.out.println(Arrays.toString(w)); // массив со словами
            System.out.println(Arrays.toString(arr)); // заносит количество слов
            System.out.println(Arrays.toString(k)); // заносит количество слов
        }

        System.out.println(arr.length); //4

       // выводит ошибку, если строки одинаковой длины
  /*      for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Предложения не могут быть одинаковой длинны!");
                    System.exit(0);
                }
            }
        }
*/

        int min = 0, tt = 0, index = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            min = arr[i];
            index = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            if (index != i) {
                tt = arr[i];
                arr[i] = arr[index];
                arr[index] = tt;
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                if (arr[i] == k[j]) {
                    System.out.println(s[j]);
                }
            }
        }
    }
}
