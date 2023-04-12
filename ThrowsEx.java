public class ThrowsEx {
    public static void main(String args[])
    {

        ThrowsEx obj = new ThrowsEx();
        obj.div(6,0);
        System.out.println("Next code");
    }

    public int div(int a, int b) throws ArithmeticException
    {
    // handling with try catch    
    //     int res=0;
    //     try{
    //         res = a/b;
    //     }
    //     catch(ArithmeticException e)
    //     {
    //         e.printStackTrace();
    //     }
    //    return res;

    // handling with throws 
        return a/b;
    }
    
}
