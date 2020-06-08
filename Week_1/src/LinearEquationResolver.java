import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a :");
        a = sc.nextInt();
        System.out.println("Input b :");
        b = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else
                System.out.println("Phương trình vô nghiệm");
        } else {
            float c = (-b) / a;
            System.out.println("Phương trình có nghiệm :" + c);
        }
    }
}
