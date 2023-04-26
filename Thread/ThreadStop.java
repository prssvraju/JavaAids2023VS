package Thread;

class Thread1 extends Thread
{
    public void run()
    {
        try{
            sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}
class Thread2 extends Thread
{
    public void run()
    {
        try{
            sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}
public class ThreadStop {
    public static void main(String args[])
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        // To see Wating State
        // t1.start();
        // try
        // {
        //     t1.join();
        // }
        // catch(InterruptedException e)
        // {
        //     e.printStackTrace();
        // }

        t2.start();
        System.out.println("State fo T2 "+t2.isAlive()+"State :"+t2.getState());
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("State fo T1 "+t1.isAlive()+"State :"+t1.getState());
        System.out.println("Exit main Thread");
 
    }
}
