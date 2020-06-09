import java.util.Scanner;

public class PrimerNumberLesstThenN {
    private int n;

    public static void main(String[] args) {
        int input;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number :");
        input = sc.nextInt();
        while (n < input) {
            if (isPrimeNumber(n)) {
                System.out.printf("%d ", n);
            }
            n++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        boolean check = true;
        if (n < 2)
            check = false;
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}
