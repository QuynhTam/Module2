package CodeGym.Triangle;
import java.util.Scanner;
public class MainExecute {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter info of triangle ");
        System.out.println("Color :");
        triangle.setColor(sc.nextLine());
        System.out.println("Side 1 :");
        triangle.setSide1(sc.nextDouble());
        System.out.println("Side 2 :");
        triangle.setSide2(sc.nextDouble());
        System.out.println("Side 3 :");
        triangle.setSide3(sc.nextDouble());
        System.out.println("Area is triangle :"+triangle.getArea());
        System.out.println("Perimeter is triangle :"+triangle.getPerimeter());
        System.out.println(triangle.toString());

    }
}
