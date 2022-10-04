package lecture12.daemon;

public class Demo {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("First Thread");
        MyThread t2 = new MyThread("............ Second Thread");
        MyThread t3 = new MyThread("............ ............. 3rd Thread");
        MyThread t4 = new MyThread("...... 4th Thread");


        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
}
