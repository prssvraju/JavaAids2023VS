class Outer1 
{ // Enveloping class  
    static private double length;// declaration of variables  
    static private double width;  
    Outer1( double x, double y)// constructor  
    {length = x;  width = y;  }  
    double area (){ return length* width;  }  
    static class Inner2// nested class  
    {  
        private double rate;  
        Inner2(double r ){ rate = r;} 
         void displayInner() 
         {  
            System.out.println ("The cost of fencing = " + rate*2* (length + width));
        }  
    }// End of class Inner2  
}// End of class Outer1  
// Below is class with main method  public 
class NestedStatic 
{
    // class with main method 
     public static void main (String args [])
     {  
        Outer1.Inner2 inn1 = new Outer1.Inner2(10);// object  
        Outer1 Obj = new Outer1 (40,30);  
        System.out.println ("Obj_Area = " + Obj.area());  
        inn1.displayInner();  
    }
} 

