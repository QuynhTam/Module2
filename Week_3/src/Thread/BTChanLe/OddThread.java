package Thread.BTChanLe;

public class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i += 2) {
            System.out.println("Thread OddThread " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Second thread error " + e);
            }
        }
    }
}
