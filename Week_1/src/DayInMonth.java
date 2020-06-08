import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        int date;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tháng cần kiểm tra ngày :");
        date = sc.nextInt();
        switch (date) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + date + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + date + " có 30 ngày");
                break;
            default:
                System.out.println("tháng " + date + " có 28 hoặc 29 ngày");
                break;
        }
    }
}
