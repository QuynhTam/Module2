import java.util.Scanner;

public class SearchMax {
    public static void main(String[] args) {
        int arr[];
        int size;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng");
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử thứ " + i + " ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        int index=0;
        for (j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
                index=j;
            }
        }
        System.out.println("Phần tử lớn nhất là :" + max + " vị trí thứ " + index);
    }
}
