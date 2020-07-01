package Thread.PrimaryNumber;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int count = 0;
        int n = 0;
        int j = 1;
        while (count < 20) {
            boolean check = true;
            if (n < 2)
                check = false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("OptimizedPrimeFactorization " + j + " => " + n);
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
