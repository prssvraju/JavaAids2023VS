import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseAdapterExample extends MouseAdapter  {
    JLabel l;
    JFrame f;

    MouseAdapterExample() {
        f = new JFrame("Mouse Adaptor");
        l = new JLabel();
        f.addMouseListener(this);
        l.setBounds(20, 50, 100, 20);
        f.add(l);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
        //l.setText("Mouse Clicked");

        // creating the Graphics object and fetching them from the Frame object using getGraphics() method  
        Graphics g = f.getGraphics();    
// setting the color of graphics object  
        g.setColor (Color.BLUE);    
// setting the shape of graphics object  
        g.fillOval (e.getX(), e.getY(), 30, 30);    
    }
    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}