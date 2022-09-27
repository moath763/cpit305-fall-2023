package lecture11.deadlock_monitor;

public class Monitor extends Thread {
    private Thread main_thread;
    private Thread myClass;

    public Monitor(Thread main, Thread my) {
        this.main_thread = main;
        this.myClass = my;
    }

    @Override
    public void run() {
        while (true) {
            System.out.printf("%s: %s\t %s: %s\n", main_thread.getName(), main_thread.getState(), 
            myClass.getName(), myClass.getState());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {}
        }
    }
    
}
