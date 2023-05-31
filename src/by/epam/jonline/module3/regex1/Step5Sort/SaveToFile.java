package by.epam.jonline.module3.regex1.Step5Sort;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveToFile {
    static void saveToFile(String text) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("./src/by/epam/jonline/module3/regex1/Step5Sort/text.txt"));
            out.writeObject(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
