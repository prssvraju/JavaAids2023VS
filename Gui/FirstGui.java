package Gui;
import java.awt.*;
import javax.swing.*;

public class FirstGui {
    
    JFrame f;
    JButton bt;
    FirstGui()
    {
        f=new JFrame("My First Frame");
        bt = new JButton("Click");
        bt.setBounds(40, 40, 100, 80);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(bt);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[])
    {
        FirstGui frame = new FirstGui();
    }
}
