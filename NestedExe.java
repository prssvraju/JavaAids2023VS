
//Illustration of invoking inner class method by Outer.inner class object 

class Outer1  
{  
    private double length;// declaration of variables  
    private double width;  
    Outer1 (double l, double w)// constructor 1  
    {length = l;  width = w;}  
    public double area(){return length* width;}// definition of method  
    Inner inner = new Inner();// creating new object  
    class Inner  
    {
        double r = 10;  
        void displayInner() 
        {  
            System.out.println ("The cost of fencing = " + r*2* (length + width));  
        }  
    }  
}  
public class NestedExe 
{// class with main method  
    public static void main (String args [])
    {  
        Outer1 obj = new Outer1 (20, 10);// using constructor  
        obj.inner.displayInner();// accessing the method  
        System.out.println ("obj_Area = " + obj.area());  
    }  
} 

