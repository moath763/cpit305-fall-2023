package lecture12.interrupt.example1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("thread1");
        MyThread t2 = new MyThread("....... thread2");
        
        t1.start();
        t2.start();

        Scanner scan = new Scanner(System.in);

        scan.nextLine();
        t1.interrupt();

        scan.nextLine();
        t2.interrupt();

    }
}
