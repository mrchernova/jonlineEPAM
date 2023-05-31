package by.epam.jonline.module3.regex1.Step4ReadWrite;

import javax.swing.*;
import java.io.IOException;
import java.io.OutputStream;

public class CustomTextArea extends OutputStream {
    private JTextArea textArea;

    public CustomTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) throws IOException {

        textArea.append(String.valueOf((char)b));                           // redirects data to the text area
        textArea.setCaretPosition(textArea.getDocument().getLength());      // scrolls the text area to the end of data
        textArea.update(textArea.getGraphics());                            // keeps the textArea up to date
    }
}
