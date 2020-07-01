package Thread.PrimaryNumber;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int count = 0;
        int n = 2;
        int j = 1;
        while (count < 20) {

            int dem = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    dem++;
                }
            }
            if (dem < 2) {
                System.out.println("LazyPrimeFactorization " + j + " => " + n);
                count++;
                j++;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n++;
        }
    }
}
