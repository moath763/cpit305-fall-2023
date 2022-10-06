package lecture13.deadlock.issue;

import java.util.concurrent.locks.ReentrantLock;

public class Demo {
    public static void main(String[] args) {
        ReentrantLock m = new ReentrantLock();

        MyThread t1 = new MyThread(m);
        MyThread t2 = new MyThread(m);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) { }

        System.out.printf("counter: %d", MyThread.counter);
    }
}
