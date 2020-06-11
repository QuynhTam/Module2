package BTStopWatch;

public class StopWatchExecute {
    public static void main(String[] args) {
        int array[] = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        StopWatch sw = new StopWatch();
        sw.start();
        selectionSort(array);
        sw.stop();
        System.out.println("Thời gian chạy hết chương trình là : " + sw.getElapsedTime()+" ms");
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }

    public static int[] selectionSort(int... array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
