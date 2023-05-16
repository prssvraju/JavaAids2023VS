package Gui;

// importing awt libraries  
import java.awt.*;    
import java.awt.event.*; 
import javax.swing.*;   
// class which inherits Frame class and implements KeyListener interface  
public class KeyListenerExample extends JFrame implements KeyListener {    
// creating object of Label class   and TextArea class  
 JLabel l;    
JTextArea area;    
// class constructor  
    KeyListenerExample() {    
          // creating the label  
        l = new JLabel();    
// setting the location of the label in frame  
        l.setBounds (20, 50, 100, 20);    
// creating the text area  
        area = new JTextArea();    
// setting the location of text area   
        area.setBounds (20, 80, 300, 300);    
// adding the KeyListener to the text area  
        area.addKeyListener(this);  
// adding the label and text area to the frame  
        add(l);  
add(area);    
// setting the size, layout and visibility of frame  
        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }    
// overriding the keyPressed() method of KeyListener interface where we set the text of the label when key is pressed  
    public void keyPressed (KeyEvent e) {    
        //l.setText ("Key Pressed");    
    }    
// overriding the keyReleased() method of KeyListener interface where we set the text of the label when key is released  
    public void keyReleased (KeyEvent e) {    
        //l.setText ("Key Released");    

        String text = area.getText();    
        // splitting the string in words  
        String words[] = text.split ("\\s");    
        // printing the number of words and characters of the string   
        l.setText ("Words: " + words.length + " Characters:" + text.length());    


    }    
// overriding the keyTyped() method of KeyListener interface where we set the text of the label when a key is typed  
    public void keyTyped (KeyEvent e) {    
        //l.setText ("Key Typed");    
    }    
  // main method  
    public static void main(String[] args) {    
        new KeyListenerExample();    
    }    
}   