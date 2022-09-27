package lecture11.threadstates;


public class Demo {
    public static void main(String[] args) {

        MyThread myThread = new MyThread(Thread.currentThread());

        System.out.printf("%s: %s\n", myThread.getName(), myThread.getState());
        
        myThread.start();

        System.out.printf("%s: %s\n", myThread.getName(), myThread.getState());
    }
}