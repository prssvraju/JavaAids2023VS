class X  
{
    X ()
    {System.out.println("Constructor of X called.");
  }
}  
class Y extends X// inheriting class X  
{
    Y () 
    {
        System.out.println("Constructor of Y called.");
    }  
}  
class Z extends Y// inheriting class Y  
{
    Z ()
    {
        System.out.println("Constructor of Z called.");
    }
} 
public class XYZ// class with main method  
{
    public static void main (String args[])
    {  
        System.out.println("Constructors called for constructing object of Z class.");
        Z objZ = new Z();
        System.out.println("Constructors called for constructing object of Y class.");
        Y objY = new Y();  
    }
} 

