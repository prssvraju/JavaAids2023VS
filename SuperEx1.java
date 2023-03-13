class Sup 
{  
    private int j;  
    public int k;  
    Sup (int x, int y)// constructor of class A  
    {j = x;  k = y;} 
    int getJ(){return j;}  
    void displaySup()
    {
        System.out.println("j = "+j +"\tk = "+k);  
        System.out.println("j*k = " + (j* k));
    }  
}  
class Sub extends Sup// inheriting class sup  
{
    private int m;  
    Sub(int x, int y, int z)// constructor of subclass  
    {
        super (x,y);// use of super in constructor of B  
        m = z;
    }  
    void displaySub()
    {
        System.out.println("Product m*j*k = " + (m* getJ()*super.k));
    }  
}// End of class Sub  // class with method main  
public class SuperEx1 
{  
    public static void main(String[] args) 
    {  
        Sup objSup = new Sup (10,20);  
        objSup.displaySup();  
        Sub objSub = new Sub(5,10,8);  
        objSub.displaySub();// Accessing the method  
    } 
} 

