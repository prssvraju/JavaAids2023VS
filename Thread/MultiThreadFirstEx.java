package Thread;
class A
{
    public void show()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("The value of i in A is"+i);
            try{Thread.sleep(1000);}catch(Exception e){e.printStackTrace();}
        }
    }
}
class B
{
    public void show()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("The value of i in B is"+i);
            try{Thread.sleep(1000);}catch(Exception e){e.printStackTrace();}
        }
    }
}
class MultiThreadFirstEx
{
    public static void main(String args[])
    {
        A t1 = new A();
        B t2 = new B();
        t1.show();
        t2.show();
    }
}