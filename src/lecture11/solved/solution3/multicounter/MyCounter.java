package lecture11.solved.solution3.multicounter;

import java.util.concurrent.locks.ReentrantLock;

public class MyCounter extends Thread {

    public static int counter = 0;
    private static ReentrantLock mutex = new ReentrantLock();
    private String name;

    public MyCounter(String name) {
        this.name = name;
    }
    

    @Override
    public void run() {
        for (int i = 0; i < 1000_000; i++) {
            mutex.lock();
            counter += 1;
            mutex.unlock();
        }

        System.out.printf("%s: I'm finish!!\n", name);
    }
}
