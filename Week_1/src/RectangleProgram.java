import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Width :");
        width = sc.nextFloat();
        System.out.println("Input Height :");
        height = sc.nextFloat();
        float retangle = width * height;
        System.out.println("Rectangle Area :" + retangle);
    }
}
