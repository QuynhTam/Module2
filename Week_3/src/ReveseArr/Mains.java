package ReveseArr;

import java.util.Stack;

public class Mains {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Mảng trước khi đảo ngược");

        for (int x : array) {
            System.out.printf("%d ", x);
        }
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println();
        System.out.println("Mảng sau khi đảo ngược");

        for (int x : array) {
            System.out.printf("%d ", x);
        }

    }
}
