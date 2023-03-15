//Illustration of method overriding and use of super class 
class X 
{  
    void display ()
    {
        System.out.println("This is class X.");
        System.out.println();
    }  
}  
class Y extends X// inheriting class X  
{
    void display ()
    {
        System.out.println("This is class Y.");
        super.display();// executes method of super class X  
        System.out.println();
    }  
}  
class Z extends Y// inheriting class Y  
{
    void display ()
    { 
        System.out.println("This is class Z.");
        super.display();
    }// Executes Y definition  
}  
public class OSuper// class with main method  
{
    public static void main (String Str[])
    {  
        X objX = new X();  
        Y objY = new Y();  
        Z objZ = new Z();  
        objX.display();// Accessing the method  
        objY.display();  
        objZ.display();  
    }
} 

