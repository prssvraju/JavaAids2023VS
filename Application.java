class CustomerId { 
     // initializing count to zero.  
     static int count = 0;// static variable  
     int id;// instance variable  
     public CustomerId() {  // Every time the constructor runs, it increments count.  
        count = count + 1; 
        id = count;  
    }  
    public int getId() 
    {  return id;  } 
} 
public class Application
{  
    public static void main (String args[]) 
        { 
        CustomerId obj = new CustomerId();  
        System.out.println("Customer ID number:"+obj.getId()); 
        }  
} 
