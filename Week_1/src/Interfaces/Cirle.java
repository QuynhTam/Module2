package Interfaces;

public class Cirle extends Shape implements Colorable {
    private double radius = 1;

    public Cirle() {
    }

    public Cirle(String color, boolean filled) {
        super(color, filled);
    }

    public Cirle(double radius) {
        this.radius = radius;
    }

    public Cirle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

//    public double getArea() {
//        return radius * radius * Math.PI;
//    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}
