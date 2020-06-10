import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arrA;
        int[] arrB;
        int[] arrC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập  kích thước mảng ");
        int n = sc.nextInt();
        arrA = new int[n];
        for (int i = 0; i < arrA.length; i++) {
            System.out.println("Phần tử thứ " + i + " ");
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }
        //mảng b
        System.out.println("Nhập  kích thước mảng ");
        int m = sc.nextInt();
        arrB = new int[m];
        for (int i = 0; i < arrB.length; i++) {
            System.out.println("Phần tử thứ " + i + " ");
            arrB[i] = sc.nextInt();
        }
        for (int i = 0; i < arrB.length; i++) {
            System.out.print(arrB[i] + " ");
        }
        System.out.println();
        //mảng C
        arrC = new int[arrA.length + arrB.length];
        for (int i = 0; i < arrA.length; i++) {
            arrC[i] = arrA[i];
        }
        for (int i = 0; i < arrB.length; i++) {
            arrC[arrA.length + i] = arrB[i];
        }
        for (int i = 0; i < arrC.length; i++) {
            System.out.print(arrC[i] + " ");
        }
    }

}
//
//    public static void inArr (int[] arr){
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + "\t");
//        }
//    }
//
//    public static void EnterElementArr (int[] arr){
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++){
//            System.out.println("Enter element " + i);
//            arr[i] = input.nextInt();
//        }
//    }
//
//    public static int[] lumpedArray (int[] ...arr){
//        int sumLength = 0;
//        for (int i = 0; i < arr.length; i++){
//            sumLength += arr[i].length;
//        }
//        int[] newArray = new int[sumLength];
//        int index = 0;
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++){
//                newArray[index] = arr[i][j];
//                index++;
//            }
//        }
//        return newArray;
//    }
