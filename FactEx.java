class Fact {

 int factorial(int n)
 {
    if(n==1)
    {
        return 1;
    }
    else
    {
        return n*factorial(n-1);
    }
 }   
}
public class FactEx
{
    public static void main(String args[])
    {
        Fact f = new Fact();
        System.out.println(f.factorial(5));
    }
}