import java.util.Scanner;

public class countCharinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String input = sc.nextLine();
        System.out.println("Nhập kí từ cần check");
        char check = sc.next().charAt(0);
        int coutn = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == check) {
                coutn++;
            }
        }
        System.out.println(coutn);
    }
}
