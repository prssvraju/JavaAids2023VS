interface InterFace// interface definition  
{
    public void display();// abstract method  
}  
public class AnonymousDemo1 
{  
    public static void main (String args[])  
    {//inner anonymous class definition  
        InterFace f = new InterFace ()
        {// creating reference of interface  
            public void display() 
            {
                System.out.println( "Anonymous class implements interface."); 
            } 
         };// The anonymous implementor of Interface closes  
         f.display(); //The reference f calls the method display()  
    }
} 

