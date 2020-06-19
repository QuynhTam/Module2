package Collections.TH_class;

import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<Integer>();
        integerMyList.add(1);
        integerMyList.add(2);
        integerMyList.add(3);
        integerMyList.add(4);
        System.out.println("Elements 4 : " + integerMyList.get(4));
        System.out.println("Elements 1 : " + integerMyList.get(1));
        System.out.println("Elements 2 : " + integerMyList.get(2));
        integerMyList.get(-1);
        System.out.println("Elements 6 : " + integerMyList.get(-1));
    }
}
