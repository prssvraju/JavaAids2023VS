package Thread;

class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Inside Thread : : MyThread");
            try{Thread.sleep(100);}catch(Exception e){}
        }

    }
}

class MyRunnable implements Runnable
{

    @Override
    public void run() {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Inside Thread : : MyRunnable");
            try{Thread.sleep(100);}catch(Exception e){}
        }
    }
    
}
public class ThreadCreation {
    public static void main(String args[])throws Exception
    {
        //lamada function
        new Thread(()->method1()).start();
        //method refernce
        new Thread(ThreadCreation::method1).start();
        
        Thread T1= new Thread(()->{
            for(int i=0;i<=5;i++)
            {
                System.out.println("Inside Thread : : T1");
                try{Thread.sleep(100);}catch(Exception e){}
            }
        });
        Thread T2= new Thread(()->{
            for(int i=0;i<=5;i++)
            {
                System.out.println("Inside Thread : : T2");
                try{Thread.sleep(100);}catch(Exception e){}
            }
        });
        Thread T3 = new Thread(new MyThread());
        Thread T4 = new Thread(new MyRunnable());

        T3.start();
        T4.start();


        T1.start();
        T2.start();
        //T1.join();
        //T2.join();
        System.out.println("Bye");

    }
    static void method1()
    {
        System.out.println("Inside therad called by method");
    }
    
}
