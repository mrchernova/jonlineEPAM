package by.epam.jonline.module3.regex1.Step5Sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFromFile {
    static String readFromFile() {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("./src/by/epam/jonline/module3/regex1/Step5Sort/text.txt"));
            return (String) in.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
}
