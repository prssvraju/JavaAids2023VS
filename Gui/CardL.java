package Gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
public class CardL extends Frame implements ActionListener{

    Button b1,b2,b3;
    CardLayout cl;
    public CardL()
    {
        setSize(400,400);
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cl = new CardLayout();
        setLayout(cl);



        b1 = new Button("First");
        b2 = new Button("Second");
        b3 = new Button("three");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        // Panel p = new Panel();
        // Label l = new Label("Raghu");
        // p.add(l);
        // p.add(b1);

        // add(p);

        add(b1);
        add(b2);
        add(b3);

    }
    public void actionPerformed(ActionEvent e)
    {
        cl.next(this);
    }
    public static void main(String args[])
    {
        new CardL();   
    }

    
}
