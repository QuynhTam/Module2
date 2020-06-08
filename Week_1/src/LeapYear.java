import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("NHập vào năm cần kiểm tra :");
        year = sc.nextInt();
        boolean result = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    result = true;
                }
            } else
                result = true;
        }
        if (result)
            System.out.println(year + " Là năm nhuận");
        else
            System.out.println(year + " Không phải là năm nhuận");
    }
}
