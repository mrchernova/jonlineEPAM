package by.epam.jonline.module3.regex1.Step4ReadWrite;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class BuildFormCyberforum extends JFrame {

    private JPanel content;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BuildFormCyberforum frame = new BuildFormCyberforum();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }



    public BuildFormCyberforum() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);




        content = new JPanel();

        content.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(content);
        content.setLayout(null);

        textField = new JTextField();
        textField.setBackground(Color.ORANGE);
        textField.setBounds(10, 11, 86, 20);
        content.add(textField);
        textField.setColumns(10);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(106, 10, 89, 23);
        btnSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFile(textField.getText());
            }
        });

        content.add(btnSave);

        final JTextArea TXTarea = new JTextArea();
        TXTarea.setBackground(Color.CYAN);
        TXTarea.setBounds(205, 14, 219, 190);
        content.add(TXTarea);





        JButton btnRead = new JButton("Read");
        btnRead.setBounds(10, 42, 89, 23);
        btnRead.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str = readFromFile();
                TXTarea.setText(str);
            }
        });
        content.add(btnRead);
    }

    static String readFromFile() {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("text.txt"));
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
            out = new ObjectOutputStream(new FileOutputStream("text.txt"));
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
