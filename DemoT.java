abstract class Demo
{  
    abstract public void display();  
    public int sum(int x, int y)  
    {  
        int a = x;  int b = y;  
        return (a+b);  
    }  
}  
class DemoT extends Demo
{  
    public void display()
    {  
        System.out.println("Hello, It is Abstract Method");
    }  
    public static void main(String args[])
    {  
        DemoT d = new DemoT();  
        d.display();  
        System.out.println("The sum of given numbers is:" +d.sum(10,15));
    }  
} 

