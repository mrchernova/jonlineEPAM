package by.epam.jonline.module3.string_as_regular1;

import javax.swing.*;
import java.awt.*;

public class Main {


    public static void main(String[] args) {

        JFrame frame = new JFrame("hello Obama!");


        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //     FlowLayout flow = new FlowLayout();
        //     frame.setLayout(flow);

        BorderLayout bl = new BorderLayout();
        frame.setLayout(bl);


        JButton b1 = new JButton("1. Sort Paragraph");
        b1.setBounds(50, 50, 150, 50);
        frame.add(b1);


        JTextField tf = new JTextField();
        tf.setText("hello Obama!");
tf.setBounds(10,10,200,100);
        frame.add(tf);

    }

}