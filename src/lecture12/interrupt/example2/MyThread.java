package lecture12.interrupt.example2;

public class MyThread extends Thread {
    private String s;

    public MyThread(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.printf("%s\n", s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }

        if (Thread.currentThread().isInterrupted()) {
            System.out.printf("%s is interrupted", s);
        }
    }
    
}
