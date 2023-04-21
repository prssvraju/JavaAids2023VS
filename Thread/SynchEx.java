package Thread;

class Table
{
    public  synchronized void  printTable(int n)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(n * i);  
            try
            {  
                Thread.sleep(500);  
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie);
            }  
        }
        //need to remove synchronized key word in front of method
        // synchronized(this)
        // {
        //     for(int i=0;i<5;i++)
        //     {
        //         System.out.println(n * i);  
        //         try
        //         {  
        //             Thread.sleep(500);  
        //         }
        //         catch(InterruptedException ie)
        //         {
        //             System.out.println(ie);
        //         }  
        //     }
        // }

    }    
}

class MyThread1 extends Thread
{
    Table t;
    MyThread1(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(1);
    }
}

class MyThread2 extends Thread
{
    Table t;
    MyThread2(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(20);
    }
}

public class SynchEx {
    
    public static void main(String[] args) 
    {
    // Creating an object of Table class.	
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
          t1.start(); 
          t2.start();
     }

}
