package SearchBinary;

public class BinaryRules {
    public static void main(String[] args) {
        int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//        System.out.println(binarySearch(list, 16));
        System.out.println(binarySearch(list, 0, list.length - 1, 7)) ;
    }

    public static int binarySearch(int arr[], int left, int right, int key) {
        int mid = (left + right) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return binarySearch(arr, left, mid - 1, key);

        } else {
            return binarySearch(arr, mid + 1, right, key);
        }
    }
}
