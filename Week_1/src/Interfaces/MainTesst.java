package Interfaces;

public class MainTesst {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(2, 3);
        shapes[1] = new Square(10);
        shapes[2] = new Cirle(10.0);
        for (Shape shape : shapes) {
            if (shape instanceof Colorable)
                System.out.println(((Colorable) shape).howToColor());
            else
                System.out.println(shape.getArea());
        }
    }
}
