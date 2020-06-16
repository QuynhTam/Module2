package Comparable;

import java.util.Arrays;

public class MainTesst {
    public static void main(String[] args) {
        ComparableCircle circle[]=new   ComparableCircle[3];
        circle[0]=new ComparableCircle(10);
        circle[1]=new ComparableCircle(5);
        circle[2]=new ComparableCircle(8);
        System.out.println("Befor sort :");
        for (ComparableCircle x:circle){
            System.out.println(x.getRadius());
        }
        System.out.println("after Sort :");
        Arrays.sort(circle);
        for (ComparableCircle x:circle){
            System.out.println(x.getRadius());
        }
    }
}
