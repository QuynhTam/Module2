import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        int usd, vnd, choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Đổi USD sang VNĐ");
        System.out.println("2.Đổi VNĐ sang USD");
        System.out.println("Chọn 1 or 2 để đổi tiền :");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhập số tiền cần đổi :");
                usd = sc.nextInt();
                System.out.println(usd + " USD = " + usd * 23000 + " VND");
                break;
            case 2:
                System.out.println("Nhập số tiền cần đổi :");
                vnd = sc.nextInt();
                System.out.println(vnd + " VND = " + vnd / 23000 + " USD");
                break;
            default:
                System.out.println("CHọn lựa không hợp lệ");
        }
    }
}