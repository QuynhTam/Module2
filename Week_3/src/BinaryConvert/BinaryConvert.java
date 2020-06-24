package BinaryConvert;

import java.util.Stack;
import java.util.Scanner;

public class BinaryConvert {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number wanted convert !");
        int numberConvert = sc.nextInt();
        int result = 0;
        while (numberConvert != 0) {
            result = numberConvert % 2;
            numberConvert = numberConvert / 2;
            integers.push(result);
        }
        for (int i = integers.size(); i > 0; i--) {
            System.out.printf("%d ", integers.pop());
        }
    }
}
