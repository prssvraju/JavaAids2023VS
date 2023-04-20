package Thread;

class One extends Thread {
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            if(i==1)
            {
                Thread.yield();
                System.out.println("From Thread One: i =" + i);
            }
        }
        System.out.println("Exiting from the Thread One");
    }
}

class Two extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("From Thread Two: j =" + j);
            if (j == 3)
                stop();
        }
        System.out.println("Exiting from the Thread Two");
    }
}

class LifeCycleMethods {
    public static void main(String args[]) {
        One a = new One();
        Two b = new Two();
        System.out.println("Thread One Started");
        a.start();
        System.out.println("Thread Two Started");
        b.start();
        System.out.println("Exiting from the main");
    }
}
