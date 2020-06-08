import java.util.Scanner;

public class IndexBmi {
    public static void main(String[] args) {
        float weight, height, bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println("cân nặng ");
        weight = sc.nextFloat();
        System.out.println("chiều cao");
        height = sc.nextFloat();
        bmi = weight / (height * height);
        System.out.println("BMI :" + bmi);
        if (bmi >= 30) {
            System.out.println("quá béo");
        } else if (bmi >= 25) {
            System.out.println("thừa cân");
        } else if (bmi >= 18.5) {
            System.out.println("Bình thường");
        } else
            System.out.println("Thiếu cân");
    }
}
