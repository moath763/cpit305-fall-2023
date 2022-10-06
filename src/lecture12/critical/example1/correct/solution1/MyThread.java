package lecture12.critical.example1.correct.solution1;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    static int x = 0;
    boolean is_incremntal;
    static ReentrantLock L = new ReentrantLock();

    public MyThread(boolean is_incremntal) {
        this.is_incremntal = is_incremntal;
        System.out.println(L);
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
