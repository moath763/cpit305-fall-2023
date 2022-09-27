package lecture11.threadstatus2;


public class Demo {
    public static void main(String[] args) {

        MyThread myThread = new MyThread(Thread.currentThread());

        System.out.printf("%s: %s\n", myThread.getName(), myThread.getState());
        
        myThread.start();
        System.out.printf("%s: %s\n", myThread.getName(), myThread.getState());

        try {
            myThread.join();
        } catch (InterruptedException ignore) { }

        System.out.printf("%s: %s\n", myThread.getName(), myThread.getState());
    }
}