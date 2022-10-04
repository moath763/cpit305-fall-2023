package lecture12.critical.example1.correct.solution2;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    static int x = 0;
    boolean is_incremntal;
    ReentrantLock L;

    public MyThread(boolean is_incremntal, ReentrantLock L) {
        this.is_incremntal = is_incremntal;
        this.L = L;
    }

    @Override
    public void run() {
        int num_iteration = 1000000;
        if (is_incremntal) {
            for (int i = 0; i < num_iteration; i++) {
                L.lock();
                x++;
                L.unlock();
            }
        } else {
            for (int i = 0; i < num_iteration; i++) {
                L.lock();
                x--;
                L.unlock();
            }
        }
    }
    
}
