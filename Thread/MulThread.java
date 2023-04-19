package Thread;

import java.io.IOError;
import java.io.IOException;

class OneT extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Inside Thread 1");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Exitng Thread 1");
    }
}

class TwoT extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Inside Thread 2");
            try {
                sleep(100, i);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Exitng Thread 2");
    }
}


public class MulThread {
    public static  void main(String args[])
    {
        OneT firstthread =  new OneT();
        TwoT secondthread = new TwoT();
        Thread obj = new Thread(firstthread,"FistThread");
        System.out.println(obj.getName());
        System.out.println("Thread One Started");
        firstthread.start();
        System.out.println("Thread Two Started");
        secondthread.start();
        System.out.println("End of main program");
    }
    
}
