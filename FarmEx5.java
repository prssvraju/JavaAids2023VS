class Farm5  
{
    private double length;// declaration of variables  
    private double width;
    Farm5 (double l, double w) //Parametric constructor  
    {
        System.out.println("Constructor1 called");  
        length = l;  width = w;
    }  
    Farm5 (double w)// Constructor with one parameter  
    {
        System.out.println("Constructor2 called");
        length = 60.0;// Length has default value 60  
        width = w;
    }  
    Farm5()// Constructors with default values  
    {
        System.out.println("Constructor3 called");
        length = 60.0; //Both the dimensions have default values  
        width = 20.;
    }  
    double area(){return length*width;}  
}// End of class Farm  
class FarmExe5 
{// class with main method  
    public static void main (String args [])
    {  
        Farm5 farm1 = new Farm5(50.0, 20.0);// calls constructor1  
        Farm5 farm2 = new Farm5 (30.0);// calls constructor2  
        Farm5 farm3 = new Farm5();// creating an object, calls constructor3 
        double farmArea1,farmArea2,farmArea3;
        farmArea1 = farm1.area();  
        farmArea2 = farm2.area();  
        farmArea3 = farm3.area();  
        System.out.println ("Area of farm1 = " + farmArea1);  
        System.out.println ("Area of farm2 = " + farmArea2);  
        System.out.println ("Area of farm3 = "+ farmArea3);
    }
}

