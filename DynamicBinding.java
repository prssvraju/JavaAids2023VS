//Example of dynamic binding 
class VehicleNew
{  
    public void display()  
    {
        System.out.println("vehicle details");  
    }
}  
class DynamicBinding extends VehicleNew
{// inheriting super class  
    public void display()  
    {
        System.out.println("car details");  
    }  
    public void color()
    {
        System.out.println("Color of car is Black");  
    }  
    public static void main (String[]args)
    {// main class  
        VehicleNew c= new DynamicBinding();// creating an object  
        c.display();  
    }  
} 

