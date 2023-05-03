package Gui;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout.Constraints;

public class GridBL extends JFrame{

    GridBagLayout gbl;
    JButton b1,b2,b3,b4,b5;
    GridBagConstraints gbc;

    public GridBL()
    {
        gbl = new GridBagLayout();
        gbc = new GridBagConstraints();

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(gbl);

         b1 = new JButton("one");
         b2 = new JButton("two");
         b3 = new JButton("three");
        // b4 = new JButton("four");
        // b5 = new JButton("five");

        // gbc.gridx =0;
        // gbc.gridy =0;
        // add(b1,gbc);

        // gbc.gridx =1;
        // gbc.gridy =1;
        // add(b2,gbc);

        // gbc.gridx =2;
        // gbc.gridy =2;
        // add(b3,gbc);

        // gbc.gridx =3;
        // gbc.gridy =3;
        // add(b4,gbc);

        // gbc.gridx =4;
        // gbc.gridy =4;
        // add(b5,gbc);


        // addGB(new JButton("North"), 1,0);
        // addGB(new JButton("West"), 0, 1);
        // addGB(new JButton("Center"),1, 1);
        // addGB(new JButton("East"), 2,1);
        // addGB(new JButton("South"),1,2);

        // gbc.gridx = 1;
        // gbc.gridy = 0;
        // add(new JButton("North"),gbc);

        // gbc.gridx = 0;
        // gbc.gridy = 1;
        // add(new JButton("west"),gbc);

        // gbc.gridx = 1;
        // gbc.gridy = 1;
        // add(new JButton("center"),gbc);

        // gbc.gridx = 2;
        // gbc.gridy = 1;
        // add(new JButton("East"),gbc);

        // gbc.gridx = 1;
        // gbc.gridy = 2;
        // add(new JButton("South"),gbc);


        gbc.gridx = 0;
        gbc.gridy = 0;
        add(b1,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;    
        add(b2,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;    
        gbc.gridwidth =2;
        gbc.insets= new Insets(40,0,0,0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(b3,gbc);

    }
    // public void addGB(Component c,int x,int y)
    // {
    //     gbc.gridx = x;
    //     gbc.gridy = y;
    //     add(c,gbc);
    // }

    public static void main(String args[])
    {
        new GridBL();
    }
    
}
