/*
read file and find min element excepted from array
 */
package by.epam.jonline.Others;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Arrays;

public class CheckPointTestTask {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = null;
        try {
            /* creating file >>
            File f = new File("data.txt");
            if (!f.exists())
                f.createNewFile();

            PrintWriter pw = new PrintWriter(f);
            pw.println("work");
            pw.println("hello");
            pw.close();
            *///creating file <<

            br = new BufferedReader(new FileReader("data.txt"));
            String s;
            while ((s = br.readLine()) != null) { // будет считываться строка пока не закончится

                System.out.println(s);

                int[] a = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();


                Arrays.sort(a);

                int min = 1;
                for (int i = 0; i < a.length; i++) {

                    if (a[i] == min) {
                        if (a[i] == a[i + 1]) continue;
                        ++min;
                    } else {
                        System.out.println("min число:  " + min);
                        break;
                    }
                }


            }


        } catch (IOException e) { //если не получится создать файл, то выводится это исключение
            System.out.println("Error: " + e);
        } finally { //закрывает класс br
            try {
                br.close();

            } catch (IOException e) {
                System.out.println("Error: " + e);
            }

        }


        // answer
        int[] a = new int[]{1, 3, 6, 2};

        System.out.println();
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
        int min = 1;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == min) {
                if (a[i] == a[i + 1]) continue;
                ++min;
            } else {
                System.out.println("min число:  " + min);
                break;
            }
        }


    }

}
