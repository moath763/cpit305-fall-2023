package lecture11.deadlock_detector;

public class Demo {
    public static void main(String[] args) {
        MyClass m = new MyClass(Thread.currentThread());

        Monitor monitor = new Monitor(Thread.currentThread(), m);
        monitor.start();

        m.start();

        try {
            m.join();
        } catch (InterruptedException e) {}

        System.out.println("This is last statement in main thread");
    }
}
