package by.epam.jonline.module3.regex1.Step5Sort.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton; //это значит глобальная переменная
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("humburger");
        hotdogButton = new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);


        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);




        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==pizzaButton){
            System.out.println("You ordered pizza");

        }
        else if (e.getSource()==hamburgerButton) {
            System.out.println("You ordered hamburger");
        }
        else if (e.getSource()==hotdogButton) {
            System.out.println("You ordered hotdog");
        }

    }
}
