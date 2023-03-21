class FarmT  {
    double length;// declaration of variables  
    double width;  
    FarmT (double l, double w) //Constructor method  
    {
        System.out.println( "Constructor called");  
        length = l;  width = w;
    }  
    double area() {return length*width;}  
}// end of class \
class FarmExe// class with main method  
{
    public static void main (String args [])  
    {
        FarmT farm1 = new FarmT(50.0, 20.0); //creating new object  
        double farmArea=0;  
        farmArea = farm1.area();  
        System.out.println ("Area of farm1 = " + farmArea);  
    }  
} 


    
