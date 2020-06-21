package Collections.ArrayList;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> stringArrayList = new ArrayList<>();
        for (int i = 0; i < stringArrayList.length(); i++) {
            stringArrayList.add(i, i + 2);
        }
        stringArrayList.add(22);
        System.out.println(stringArrayList.contains(12));
        System.out.println(stringArrayList.indexOf(4));
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.printf("%d ", stringArrayList.get(i));
        }
//        stringArrayList.clear();
//        System.out.println(stringArrayList.get(0));
        System.out.println();

        stringArrayList.add(12);
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.printf("%d ", stringArrayList.get(i));
        }
    }
}
