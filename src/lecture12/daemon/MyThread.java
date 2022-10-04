package lecture12.daemon;

public class MyThread extends Thread {
    private String s;

    public MyThread(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        if (s.equalsIgnoreCase("First Thread")) {
            int i = 0;
            while (true) {
                System.out.printf("%5d: %s\n", i, s);
                i++;
            }
        } else {
            for (int i = 0; i < 10000; i++) {
                System.out.printf("%5d: %s\n", i, s);
            }
        }
    }
    
}
