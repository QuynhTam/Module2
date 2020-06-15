package Point;

public class MainPoint {
    public static void main(String[] args) {
        Point p1 = new Point(4,5);
        System.out.println(p1.toString());
        MoveablePoint p2 = new MoveablePoint(1,1,3,4);
        System.out.println(p2.toString());
        System.out.println(p2.move());
    }
}
