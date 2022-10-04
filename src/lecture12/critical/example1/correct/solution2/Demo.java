package lecture12.critical.example1.correct.solution2;

import java.util.concurrent.locks.ReentrantLock;

public class Demo {
    public static void main(String[] args) {
        ReentrantLock r = new ReentrantLock();
        MyThread t1 = new MyThread(true, r);
        MyThread t2 = new MyThread(false, r);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) { }

        System.out.printf("final value of x is %d\n", MyThread.x);

    }
}
