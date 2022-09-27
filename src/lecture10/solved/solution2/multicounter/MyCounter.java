package lecture10.solved.solution2.multicounter;

public class MyCounter extends Thread {

    public static int counter = 0;
    private static Object obj = new Object();
    private String name;

    public MyCounter(String name) {
        this.name = name;
    }
    

    @Override
    public void run() {
        for (int i = 0; i < 1000_000; i++) {
            synchronized (obj) {
                counter += 1;
            } 
        }

        System.out.printf("%s: I'm finish!!\n", name);
    }
}
