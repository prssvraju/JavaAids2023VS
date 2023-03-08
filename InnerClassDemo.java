class Outer
{  
    private double length;// declaration of variables  
    private double width;  
    Outer (double l, double w)// constructor 1  
    {length = l;  width = w;}  
    public double area(){return length* width;}// definition of method  
    class Inner  
    {
        int r;
        Inner (int x){r = x;}  
        Inner(){r = 12;}  
        void displayInner() 
        {  
            System.out.println ("The cost of fencing = " + r*2* (length + width));
        }  
    } //The inner class ends  
}// the outer class ends  
//below is class with main method  
public class InnerClassDemo 
{  
    public static void main (String args [])
    {// class with main method  
        Outer outer = new Outer (30,20);// using constructor 2  
        System.out.println("The Area of farm); " +outer.area()); 
        //Correction Needed 
        Outer.Inner inner1 = outer.new Inner(15);  
        inner1.displayInner();  // creates object  
        Outer obj = new Outer (20, 10);  
        //Correction Needed
        Outer.Inner inner2 = obj.new Inner();  
        inner2.displayInner();  
        System.out.println ("obj_Area = " + obj.area());  
    }  
} 

