import java.util.Scanner;

public class sumArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số dòng : ");
        int rows = sc.nextInt();
        System.out.println("Số cột");
        int columms = sc.nextInt();
        int[][] arr = new int[rows][columms];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("Tổng đường chéo chính là  : "+sum);
    }
}