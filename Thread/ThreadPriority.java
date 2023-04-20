package Thread;

class One extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread One: i =" + i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Exiting from the Thread One");
    }
}

class Two extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("From Thread Two: j =" + j);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Exiting from the Thread Two ");
    }
}

class Three extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("From Thread Three: k =" + k);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Exiting from the Thread Three ");
    }
}

class ThreadPriority {
    public static void main(String ar[]) {
        One a = new One();
        Two b = new Two();
        Three c = new Three();
        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.NORM_PRIORITY);
        c.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start Thread One");
        a.start();

        System.out.println("Start Thread Two");
        b.start();

        System.out.println("Start Thread Three");
        c.start();

        System.out.println("Exit from main()");
    }
}
