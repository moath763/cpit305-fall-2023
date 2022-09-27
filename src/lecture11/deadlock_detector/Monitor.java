package lecture11.deadlock_detector;

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
            if (main_thread.getState() == State.WAITING && myClass.getState() == State.WAITING) {
                System.out.println("Deadlock detected!");
                main_thread.interrupt();
            }
            if (main_thread.getState() == State.TERMINATED && myClass.getState() == State.TERMINATED) {
                break;
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {}
        }
    }
    
}
