package lecture12.interrupt.example1;

public class MyThread extends Thread {
    private String s;

    public MyThread(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        int i = 0;
        while (!Thread.currentThread().isInterrupted()) {
            System.out.printf("%5d: %s\n", i, s);
            i++;
        }

        if (Thread.currentThread().isInterrupted()) {
            System.out.printf("%s is interrupted", s);
        }
    }
    
}
