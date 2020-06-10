import java.util.Scanner;

public class insertArr {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 2, 1, 1, 1, 2, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần chèn");
        int input = sc.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int index = sc.nextInt();
        if (index < 0 || index > arr.length - 1) {
            System.out.println("không chèn được");
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = input;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
