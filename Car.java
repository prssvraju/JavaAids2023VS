//Illustration of static binding  
class Vehicle
{ 
    public void display()  
    {
        System.out.println("vehicle details");  
    } 
} 
class Car extends Vehicle
{// inheriting super class  
    public void color()
    {
        System.out.println("Color of car is Black");  
    }  
    public static void main (String[]args)
    { 
        Car c= new Car();// creating an object 
        c.color();  
    }  
} 

