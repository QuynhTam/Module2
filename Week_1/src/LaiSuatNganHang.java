import java.util.Scanner;

public class LaiSuatNganHang {
    public static void main(String[] args) {
        float money;
        int month;
        float interset_total = 0;
        float interset_rate = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số tiền gửi :");
        money = sc.nextFloat();
        System.out.println("Nhập số tháng gửi");
        month = sc.nextInt();
        for (int i = 0; i < month; i++) {
            interset_total = money * (interset_rate / 100) / 12 * month;
        }
        System.out.println("Lãi xuất trong" + month + " là :" + interset_total);
    }
}
