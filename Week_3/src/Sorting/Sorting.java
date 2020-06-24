package Sorting;

public class Sorting {
    public static void main(String[] args) {
        int[] array = {2, 3, 2, 5, 6, 20, 1, -2, 3, 14, 12};
        for (int x : array) {
            System.out.printf("%d ", x);
        }
        System.out.println();
//        bubbleSort(array);
//        selectionSort(array);
        insertionSort(array);
        for (int x : array) {
            System.out.printf("%d ", x);
        }
    }

    //sắp xếp nổi bọt
    public static int[] bubbleSort(int[] arr) {
        boolean check = true;
        for (int i = 0; i < arr.length - 1; i++) {
            check = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = true;
                }
            }
            if (check == false)
                break;
        }
        return arr;
    }

    //sắp xếp chọn
    public static int[] selectionSort(int[] arr) {
        int iMin;
        for (int i = 0; i < arr.length - 1; i++) {
            iMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[iMin]) {
                    int temp = arr[j];
                    arr[j] = arr[iMin];
                    arr[iMin] = temp;
                }
            }
        }
        return arr;
    }

    //sắp xếp chèn
    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

}
