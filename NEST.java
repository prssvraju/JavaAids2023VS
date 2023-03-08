//Illustration of nested member classes 

class Outer
{  
    private double length;// declaration of variables  
    private double width;  
    Outer (double x, double y)// Constructor method  
    {length = x;  width = y;} 
     double area(){ return length* width;}// definition of method  
     void displayOuter() 
     {  
        Inner iner = new Inner();// iner is object of inner class  
        iner.displayInner();  
    }  
    class Inner  
    {
        double rate = 10.0;// declaration of variables  
        double perimeter = 2*( length + width);  
        double fencingCost = rate * perimeter; 
         void displayInner()
         {// definition of another method  
            System.out.println ("The cost of fencing = " + fencingCost);
        }  
    }  
}  
class NEST  
{
    public static void main (String args [])  
    {  
        Outer obj = new Outer (40.0, 20.0); 
         obj.displayOuter();// accessing the method  
         System.out.println ("Area of Obj = " + obj.area());  
    }  
} 

