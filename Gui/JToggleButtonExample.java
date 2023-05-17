import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;  
import javax.swing.JFrame;  
import javax.swing.*;  
  
public class JToggleButtonExample extends JFrame implements ItemListener {  
    public static void main(String[] args) {  
        new JToggleButtonExample();  
    }  
    private JToggleButton button; 
    private JCheckBox checkBox1 ;
    private JLabel l;
    JToggleButtonExample() {  
        setTitle("JToggleButton with ItemListener Example");  
        setLayout(new FlowLayout()); 
        l = new JLabel("Message"); 
        button = new JToggleButton("ON");  
        JCheckBox checkBox1 = new JCheckBox("Java Programing");  
        add(l); 
        add(button); 
        add(checkBox1); 
        button.addItemListener(this); 
        checkBox1.addItemListener(this); 
        setSize(400, 400);  
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
    public void itemStateChanged(ItemEvent eve) {  
        if (button.isSelected()) 
        {
            button.setText("OFF");  
            l.setText("JToggle Button OFF");  
        } 
        else  
        {
            button.setText("ON");  
            l.setText("JToggle Button ON");  
        }
       
        if(checkBox1.isSelected())
        {
            l.setText("CheckBox Button ON");  
        }
        else
        {
            l.setText("CheckBox Button OFF");  
        }
    }  
   
    
}  