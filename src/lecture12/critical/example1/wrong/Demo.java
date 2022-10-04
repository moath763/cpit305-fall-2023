package lecture12.critical.example1.wrong;

public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(true);
        MyThread t2 = new MyThread(false);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) { }

        System.out.printf("final value of x is %d\n", MyThread.x);

    }
}
