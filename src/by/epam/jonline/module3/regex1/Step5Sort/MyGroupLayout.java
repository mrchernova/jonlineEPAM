package by.epam.jonline.module3.regex1.Step5Sort;

// Пример использования менеджера расположения GroupLayout

import javax.swing.*;

import static javax.swing.GroupLayout.Alignment.*;

public class MyGroupLayout extends JFrame
{
    public MyGroupLayout()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Список компонентов формы
        JLabel      label           = new JLabel("Поиск строки :");
        JTextField  textField       = new JTextField();
        JCheckBox   cbCaseSensitive = new JCheckBox("Учет регистра");
        JCheckBox   cbWholeWords    = new JCheckBox("Целое слово"  );
        JCheckBox   cbBackward      = new JCheckBox("Поиск назад"  );
        JButton     btnFind         = new JButton("Найти"   );
        JButton     btnCancel       = new JButton("Отменить");

    //    cbCaseSensitive.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    //    cbWholeWords   .setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    //    cbBackward     .setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        // Определение менеджера расположения
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);             // отступы
        layout.setAutoCreateContainerGaps(true);    // отступы



        // Создание горизонтальной группы
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addComponent(label)
                .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(textField)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(LEADING)
                                        .addComponent(cbCaseSensitive)
                                        .addComponent(cbBackward))
                                .addGroup(layout.createParallelGroup(LEADING)
                                        .addComponent(cbWholeWords))))
                .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(btnFind)
                        .addComponent(btnCancel))
        );

        layout.linkSize(SwingConstants.HORIZONTAL, btnFind, btnCancel);



        // Создание вертикальной группы
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(label)
                        .addComponent(textField)
                        .addComponent(btnFind))
                .addGroup(layout.createParallelGroup(LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(BASELINE)
                                        .addComponent(cbCaseSensitive)
                                        .addComponent(cbWholeWords))
                                .addGroup(layout.createParallelGroup(BASELINE)
                                        .addComponent(cbBackward)))
                        .addComponent(btnCancel))
        );

        setTitle("Поиск");
        pack();
    }
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new MyGroupLayout().setVisible(true);
            }
        });
    }
}
