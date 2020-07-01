package Thread.PrimaryNumber;

public class MainTest {
    public static void main(String[] args) {
        LazyPrimeFactorization lpf = new LazyPrimeFactorization();
        OptimizedPrimeFactorization opf = new OptimizedPrimeFactorization();
        Thread threadFirst = new Thread(lpf);
        Thread threadSecond = new Thread(opf);
        threadFirst.start();
        threadSecond.start();
    }

}
