package Gui;
import javax.swing.*;
public class SecondGui extends JFrame {

    SecondGui()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton bt = new JButton("CLick");
        bt.setBounds(30, 30, 100, 50);
        add(bt);
        setLayout(null);
        add(bt);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new SecondGui();
    }
}
