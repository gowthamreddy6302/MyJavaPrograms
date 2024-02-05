package Multi_Threading;

public class MyThreads extends Thread {
    String ThreadName;

    public MyThreads(String s) {
        ThreadName = s;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(ThreadName + " " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN THREAD STARTS");
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        ThreadGroup threadGroup = new ThreadGroup("FIRST-THREAD-GROUP");
        MyThreads myThreads = new MyThreads("FIRST-THREAD");
        Thread tr = new Thread(threadGroup, myThreads);
        tr.setName("FIRST-THREAD");
        tr.setPriority(7);
        tr.setDaemon(true);
        System.out.println(tr);
        tr.start();
        try {
            tr.join();
        } catch (Exception e) {
        }

        // SECOND-THREAD


        Thread thread1 = Thread.currentThread();
        System.out.println(thread1);
        MyThreads myThreads1 = new MyThreads("SECOND-THREAD");
        Thread tr1 = new Thread(threadGroup, myThreads1);
        tr1.setName("SECOND-THREAD");
        tr1.setPriority(Thread.MIN_PRIORITY);
        tr1.start();
        try {
            tr1.join();
        } catch (Exception e) {
        }
        System.out.println("IS MAIN THREAD DAEMON " + thread.isDaemon());
        System.out.println("IS FIRST THREAD DAEMON " + tr.isDaemon());
        System.out.println("IS SECOND THREAD DAEMON " + tr1.isDaemon());
        System.out.println("MAIN THREAD ENDS");
    }
}
