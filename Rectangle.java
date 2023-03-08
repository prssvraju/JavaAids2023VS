import java.util.Scanner;  
public class Rectangle 
{  
    int perimeter(int l, int b) 
    {  
        int pm = 2*(l + b);  
        return pm;
    }  
    int area(int l, int b) 
    {  
        int pm = perimeter(l, b);  
        System.out.println("Perimeter is :" + pm);  
        int ar = l*b;  
        return ar;  
    }  
    public static void main(String[] args)  
    {
        Scanner s = new Scanner(System.in);  
        System.out.println("enter the length of rectangle:");  
        int l = s.nextInt();  
        System.out.println("enter the breadth of rectangle:");  
        int b = s.nextInt();  
        Rectangle obj = new Rectangle();  
        int ar = obj.area(l,b);  
        System.out.println("Area is :" +ar);  
    }  
} 

