package BTKT_Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter() * this.height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder width height = " + getHeight() + " which is a subclass of " + super.toString();

    }
}
