package lecture11.timedwaiting;


public class Demo {
    public static void main(String[] args) {

        MyThread myThread = new MyThread(Thread.currentThread());

        System.out.printf("%s: %s\n", myThread.getName(), myThread.getState());
        
        myThread.start();
        System.out.printf("%s: %s\n", myThread.getName(), myThread.getState());

        try {
            myThread.join(5000);
        } catch (InterruptedException ignore) { }

        System.out.printf("%s: %s\n", myThread.getName(), myThread.getState());
    }
}