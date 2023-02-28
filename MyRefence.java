class Prog1 {
    int n;
    Prog1(int x)
    {
        n=x;
    }
    public int updateVal(Prog1 obj)
    {
        obj.n = obj.n+2;
        return obj.n;
    }
}
class PassValue
{
    int fun(int n)
    {
        return n+2;
    }
}


public class MyRefence
{
    public static void main(String args[])
    {
        Prog1 refObj1= new Prog1(10);
        System.out.println("The value of n is "+refObj1.updateVal(refObj1));
        System.out.println("The value of n is "+refObj1.updateVal(refObj1));

        Prog1 refObj2= new Prog1(20);
        System.out.println("The value of n is "+refObj2.updateVal(refObj2));
        System.out.println("The value of n is "+refObj2.updateVal(refObj2));

       
        PassValue pv = new PassValue();
        System.out.println("===Call By Value====");
        int x=10;
        System.out.println("Function Call"+pv.fun(x));
        System.out.println("Inside class"+x);
        x=20;
        System.out.println("Function Call"+pv.fun(x));
        System.out.println("Inside class"+x);
    }
}
