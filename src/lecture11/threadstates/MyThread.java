package lecture11.threadstates;

public class MyThread extends Thread {
    private Thread main_thread;

    public MyThread(Thread main_thread) {
        this.main_thread = main_thread;
    }



    @Override
    public void run() {
        int x = 0;
        for (int i = 0; i < 1000000; i++) {
            x++;
        }
        System.out.println(x);
        System.out.printf("%s: %s\n", main_thread.getName(), main_thread.getState());
    }
    
}
