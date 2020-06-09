import java.util.Scanner;

public class KiemTraSoNt {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra :");
        number = sc.nextInt();
        System.out.println(number + " Là số nguyên tố ? " + isPrimeNumber(number));

    }

    public static boolean isPrimeNumber(int n) {
        boolean check = true;
        if (n < 2)
            check = false;
        else {
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
