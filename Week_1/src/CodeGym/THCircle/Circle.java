package CodeGym.THCircle;

import javax.lang.model.element.NestingKind;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius * radius * Math.PI;
    }

    public double getArea() {
        return 2 * radius * Math.PI;
    }
}
