import java.util.Scanner;

public class PrimerNumber {
    public static void main(String[] args) {
        int count = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số lượng số nguyên tố cần in ra :");
        int input = sc.nextInt();

        while (count < input) {
            if (isPrimeNumber(n)) {
                System.out.printf("%d ",n);
                count++;
            }
            n++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        boolean check = true;
        if (n < 2) {
            check = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}

