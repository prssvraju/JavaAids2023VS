package Gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridL extends JFrame {
    GridLayout gl;
    JButton b1,b2,b3,b4;

    public GridL()
    {
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gl = new GridLayout(2,2);
        setLayout(gl);

        b1 = new JButton("One");
        b2 = new JButton("Two");
        b3 = new JButton("Three");
        b4 = new JButton("Four");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
    public static void main(String args[])
    {
        new GridL();
    }
    
}
