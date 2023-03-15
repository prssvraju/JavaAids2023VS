interface One {double pi = 3.14;}// interface defined  
interface Two {double radius = 10.0;}  
interface Three {double area ();}  
class Circle implements One, Two, Three// implements three  interface  
{
    public double area ()
    { 
        return pi*radius*radius;  
    }
}// end of class Circle  
class InterFace// class with main method  
{
    public static void main(String args[])  
    {  
        Circle c = new Circle ();  
        System.out.println("Area of circle c = " + c.area());  
    }  
} 

