class Farm
{
    double length;  
    double width;  
    double area(){return length*width;} 
}
public class FarmExe1
{
    // class with main method().  
    public static void main (String args [])  
    {  
        Farm farm1 = new Farm();//defining an object farm1  
        Farm farm2 = new Farm(); //defining an object farm2  
        farm1.width = 20.0;// accessing the variables  
        farm1.length = 40.0;  
        System.out.println ("Area of farm1 = " + farm1.area());  
        farm2 = farm1;  
        System.out.println ("Area of farm2 = " + farm2.area());  
        farm2.width = 25;  
        System.out.println ("Width of farm2 = " + farm2.width);  
        System.out.println ("Width of farm1 = " + farm1.width);  
        System.out.println ("Area of farm1 = " + farm1.area());  
    }  
} 

