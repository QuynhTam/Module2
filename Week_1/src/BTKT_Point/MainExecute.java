package BTKT_Point;

import java.util.jar.JarOutputStream;

public class MainExecute {
    public static void main(String[] args) {
        PointTwoD p2 = new PointTwoD();
        PointThreeD p3 = new PointThreeD();
        p2.setX(3);
        p2.setY(4);
        p3.setX(5);
        p3.setY(6);
        p3.setZ(7);
        System.out.println(p2);
        System.out.println(p3);
        float arr2[]={3,4,5};
        for (float x:arr2){
            System.out.print(x+" ");
        }

    }
}

