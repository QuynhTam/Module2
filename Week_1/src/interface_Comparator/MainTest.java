package interface_Comparator;

import CodeGym.THCircle.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class MainTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3, "blue");
        circles[1] = new Circle();
        circles[2] = new Circle(4, "yellow");
        System.out.println("after-soft");
        for (Circle x : circles) {
            System.out.println(x.getRadius());
        }
        Comparator comparator = new CircleComparator();
        Arrays.sort(circles, comparator);
        System.out.println("after-soft");
        for (Circle x : circles) {
            System.out.println(x.getRadius());
        }
    }
}
