package SearchBinary;

public class SearchBinary {
    public static void main(String[] args) {
        int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(binarySearch(list, 16));
//        binarySearch(list, 16);
    }
    public static int binarySearch(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;
        while (right >= left) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
