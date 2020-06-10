import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.tam giác vuông, có cạnh góc vuông ở botton-left");
        System.out.println("2.tam giác vuông, có cạnh góc vuông ở top-left");
        System.out.println("3.Hình chữ nhật");
        System.out.println("4.Tam giác cân");
        System.out.println("Nhập lựa chọn của bạn");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.printf("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = i; j < 5; j++) {
                        System.out.printf("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.printf(" * ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 0; i <= 9; i += 2) {
                    for (int j = 9; j > i; j -= 2)
                        System.out.print(" ");
                    for (int j = 0; j <= i; j++)
                        System.out.printf("*");
                    System.out.println();
                }
                break;
            default:
                System.out.println("Nhập không hợp lệ");
        }
    }
}
