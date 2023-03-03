// Illustration of accessing a method of nested class through objects of enveloping class  and nested class where inner class is declared private 

class Outer  
{
    private double length; //declaration of variables  
    private double width;  
    Outer (double x, double y) //constructor of Outer  
    {length = x;  width = y;}  
    double area(){return length* width;}// definition of method  
    void displayOuter()  
    {
        Inner iner = new Inner();  
        iner.displayInner();
    }// accessing the method  
    private class Inner  
    {
        public void displayInner()
        {  
            System.out.println ("The cost of fencing = " + (10*2*(length + width)));
        }  
    }  
}  
class NestExe1// class with the main method  
{
    public static void main (String Str [])  
    {  
        Outer obj1 = new Outer (40.0, 20.0);  
        Outer obj2 = new Outer(10.0, 5.0); 
        //Second Outer object  
        obj2.displayOuter();// accessing the methods 
        obj1.displayOuter();  
        System.out.println ("Area of Obj1 = " + obj1.area());  
    }  
} 

