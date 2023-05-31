package by.epam.jonline.module3.regex1.Step4ReadWrite;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.*;



public class Form extends JFrame {
    public Form() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700, 500, 600, 400);
        JPanel content = new JPanel();

        JTextArea TXTarea = new JTextArea(13, 50);
        content.add(new JScrollPane(TXTarea));
        setContentPane(content);

        TXTarea.setLineWrap(true);
        TXTarea.setWrapStyleWord(true);




        JButton btnSave = new JButton("Save");
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFile(TXTarea.getText());
            }
        });
        content.add(btnSave);


        JButton btnRead = new JButton("Read");
        btnRead.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String s = readFromFile();
                TXTarea.setText(s);
            }
        });
        content.add(btnRead);

    }

    static String readFromFile() {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("./src/by/epam/jonline/module3/regex1/Step4ReadWrite/text.txt"));
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


    static void saveToFile(String text) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("./src/by/epam/jonline/module3/regex1/Step4ReadWrite/text.txt"));
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