package TH_rectangle;

public class Execute {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        System.out.println(rectangle.display());
        System.out.println("Diện tích " + rectangle.getArea());
        System.out.println("Chu vi " + rectangle.getPerimeter());
    }
}
