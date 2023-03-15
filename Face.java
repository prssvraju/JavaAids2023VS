interface SurfaceArea { // interface
    double Compute(double x);
}// end of interface

class Square implements SurfaceArea// class Square
{
    public double Compute(double x) {
        return (x * x);
    }
}// end of class Square

class Circle implements SurfaceArea// class Circle
{
    public double Compute(double x) {
        return (3.141 * x * x);
    }
}// End of class Circle

class Face {
    public static void main(String arg[])
    {  
        Square sqr = new Square();// object of class square  
        Circle cirl = new Circle (); //class Circle object  
        SurfaceArea Area;// object reference of interface  
        // Assigning Square class reference to Area  
        Area = sqr;  
        System.out.println("Area of square =" + Area.Compute(10));
        // Assigning Circle class reference to Area  
        Area = cirl;  
        System.out.println("Area of circle ="+Area.Compute(10));
      }
}
