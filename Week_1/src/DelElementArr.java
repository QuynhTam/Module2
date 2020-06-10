import java.util.Scanner;

public class DelElementArr {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 4, 5, 6, 7, 8, 9};
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xoá");
        input = sc.nextInt();
        int N = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length-1] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
