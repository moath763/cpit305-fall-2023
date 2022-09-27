package lecture11.deadlock_monitor;

public class MyClass extends Thread {
    
    private Thread main_thread;

    public MyClass(Thread main_thread) {
        this.main_thread = main_thread;
    }

    @Override
    public void run() {
        try {
            main_thread.join();
        } catch (InterruptedException ignore) {}

        System.out.println("Main thread finish");
    }
    
}
