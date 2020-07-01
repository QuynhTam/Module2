package Thread.TH;

public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Second thread error " + e);
            }
        }
    }
}
