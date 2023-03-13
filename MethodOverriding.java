class X
{  
    void display ()
    { 
        System.out.println("This is class X.");
    }  
}// super class X ends  
class Y extends X// inheriting class X  
{
    void display ()
    { 
        System.out.println("This is class Y.");
    }  
}// Subclass Y ends  
class Z extends Y// inheriting class Y  
{
    void display ()
    { 
        System.out.println("This is class Z.");
    }  
}// Subclass z ends  
public class MethodOverriding 
{  
    public static void main (String Str[])
    {  
        X objX = new X();// defines object of class X  
        Y objY = new Y();// defines object of class Y  
        Z objZ = new Z(); //Defines object of class Z  
        objX.display();// Accessing the method  
        objY.display();  
        objZ.display();  

        objX = new Y(); //objX is assigned reference of class Y  
        objX.display();// Method display called by objX  
        objX = new Z();// objX assigned reference of class Z  
        objX.display();// Method display called by objX  
    }  
} 

