package by.epam.jonline.module3.regex1.Step3SaveTextArea;

import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;


public class SaveTextArea extends JFrame {
    public SaveTextArea(){
        super("Window with Text Area");
        setBounds(700,500,600,400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Добавим поля в окно
        JPanel contents = new JPanel();

        JTextArea TXTarea = new JTextArea(10, 50);
        TXTarea.setText("Второе многострочное поле");

        // Параметры переноса слов
        TXTarea.setLineWrap(true);
        TXTarea.setWrapStyleWord(true);



        contents.add(new JScrollPane(TXTarea));
        setContentPane(contents);


        JButton btnSave = new JButton("Сохранить текст");
        btnSave.addActionListener(new ListenerSave());
        contents.add(btnSave);







    }





    static class ListenerSave implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Нажатие кнопки! От - " + e.getActionCommand() + "\n");

            try{
                FileWriter writer = new FileWriter("./src/by/epam/jonline/module3/regex1/Step3SaveTextArea/text.txt");
                  writer.write("hello obama");
                writer.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }

}