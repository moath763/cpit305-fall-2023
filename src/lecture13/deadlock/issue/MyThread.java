package lecture13.deadlock.issue;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    static int counter = 0;

    private ReentrantLock mutex;

    public MyThread(ReentrantLock mutex) {
        this.mutex = mutex;
    }


    @Override
    public void run() {
        for (int i = 0; i < 100000; ++i) {
            mutex.lock();
            counter++;
            System.out.println(5 / 0);
            mutex.unlock();
        }
    }
    
}
