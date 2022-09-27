package lecture11.deadlock;

public class Demo {
    public static void main(String[] args) {
        MyClass m = new MyClass(Thread.currentThread());

        m.start();

        try {
            m.join();
        } catch (InterruptedException e) {}

        System.out.println("This is last statement in main thread");
    }
}
