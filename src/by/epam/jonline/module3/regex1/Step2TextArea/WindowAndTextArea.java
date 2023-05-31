package by.epam.jonline.module3.regex1.Step2TextArea;

import javax.swing.*;

public class WindowAndTextArea extends JFrame {

    public WindowAndTextArea(){

        super("Window with Text Area");
        setBounds(700,500,600,400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        JTextArea area2 = new JTextArea(10, 50);
        area2.setText("Второе многострочное поле");
        // Параметры переноса слов
        area2.setLineWrap(true);
        area2.setWrapStyleWord(true);

        // Добавим поля в окно
        JPanel contents = new JPanel();

        contents.add(new JScrollPane(area2));
        setContentPane(contents);





    }


}