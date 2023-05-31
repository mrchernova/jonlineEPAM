package by.epam.jonline.module3.regex1.Step1SimpleWindow;
import javax.swing.JFrame;

public class MyWindowApp extends JFrame {
    public MyWindowApp(){
        super("My First Window");
        setBounds(700,500,600,400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyWindowApp app = new MyWindowApp();
        app.setVisible(true);
    }
}