package QueueArray;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = 0;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity)
            status = true;
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0)
            status = true;
        return status;
    }

    public void enQueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
//            tail++;
//
//            if (tail == capacity - 1) {
//                tail = 0;
//            }
            queueArr[tail] = item;
            tail++;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");

        }
    }

    public void deQueue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
//            head++;
//            if (head == capacity - 1) {
//                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
//                head = 0;
//            } else {
//                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
//            }
            int temp = queueArr[0];
            for (int i = 0; i < currentSize - 1; i++) {
                queueArr[i] = queueArr[i + 1];
            }
            queueArr[currentSize - 1] = 0;
            System.out.println("Pop operation done ! removed: " + temp);
            currentSize--;
            tail--;
        }
    }
}
