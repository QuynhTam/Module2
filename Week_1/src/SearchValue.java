import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class SearchValue {
    public static void main(String[] args) {
        String studens[] = {"hải", "tùng", "quỳnh", "thành", "hiệp", "thịnh", "tuyển", "Long", "nghĩa"};
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("NHập vào tên cần tìm :");
        input = sc.nextLine();
        boolean check = false;
        int i;
        for (i = 0; i < studens.length; i++) {
            if (input.equals(studens[i])) {
                System.out.println("Đã tìm thấy sinh viên " + studens[i] + " ở vị trí thứ " + i);
                check = true;
                break;
            }
        }
        if (!check)
            System.out.println("Không tìm thấy");
    }
}
