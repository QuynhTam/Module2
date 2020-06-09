import java.util.Scanner;

public class UocSoChung {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = sc.nextInt();
        System.out.println("Nhập số b :");
        b = sc.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("Không có ước số chung");
        } else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Ươc số chung lớn nhất là :" + a);
        }
    }
}
