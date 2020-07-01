package Thread.BTChanLe;

public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 100; i += 2) {
            System.out.println("Thread EvenThread " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                System.out.println("Second thread error " + e);
            }
        }

    }
}
