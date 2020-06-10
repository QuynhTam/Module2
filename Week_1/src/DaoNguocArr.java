import java.util.Scanner;

public class DaoNguocArr {
    public static void main(String[] args) {
        int size;
        int arr[];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử mảng :");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size phải nhỏ hơn 20");
        } while (size > 20);
        arr = new int[size];
        //nhập mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
        //in mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //đảo ngược phần tử mảng
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        //in mảng sau khi đảo ngược
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
