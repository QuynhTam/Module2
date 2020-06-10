import java.util.Scanner;

public class sumRowArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows Number :");
        int rows = sc.nextInt();
        System.out.println("Enter Columm Number :");
        int columm = sc.nextInt();
        int[][] arr = new int[rows][columm];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Do you want sum row ?");
        int enter = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][enter];
        }
        System.out.println("Sum of rows " + enter + " is : " + sum);
    }
}
