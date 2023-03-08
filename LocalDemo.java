public class LocalDemo 
{  
    public static void main(String[] args) 
    {  
        class Local
        {// local class defined  
            private int x;// declaring instance variable  
            Local(int a) {x = a;}// constructor of local class  
            public void display()
            {
                System.out.println("Cube of "+x+" = "  + Math.pow(x,3));
            }  
        }// End of local class  
        Local local = new Local(20);// creating an object  
        local.display();  
    }  
} 

