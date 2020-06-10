import javax.swing.*;
import java.util.Scanner;

public class DoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.ĐỔi độ C sang độ F");
        System.out.println("2.ĐỔi độ F sang độ C");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("NHập số :");
                int doc = sc.nextInt();
                System.out.println(celsiusToFahrenheit(doc));
                break;
            case 2:
                System.out.println("NHập số :");
                int dof = sc.nextInt();
                System.out.println(fahrenheitToCelsius(dof));
        }
    }

    public static double celsiusToFahrenheit(double doC) {
        double fahrenheit = (9.0 / 5) * doC + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double doF) {
        double celsius = (5.0 / 9) * (doF - 32);
        return celsius;
    }

}
