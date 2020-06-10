public class minArr {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Phần tử nhỏ nhất là :" + minValue(array));
    }
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
