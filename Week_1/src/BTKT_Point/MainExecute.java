package BTKT_Point;

public class MainExecute {
    public static void main(String[] args) {
        PointTwoD p2 = new PointTwoD();
        PointThreeD p3 = new PointThreeD();
        p2.setX(3);
        p2.setY(4);
        System.out.println(p2.toString());
        p3.setX(3);
        p3.setY(4);
        p3.setZ(5);
        System.out.println(p3.toString());
    }
}

