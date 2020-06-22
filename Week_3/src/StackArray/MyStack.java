package StackArray;

import com.sun.org.apache.xerces.internal.dom.AbortException;

public class MyStack {
    private int[] arr;
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("mảng đầy");
        }
        arr[index] = element;
        index++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("không có gì để xoá");
        }
        int temp = arr[index - 1];
        index--;
        return temp;
    }

    public int size() {
        return this.index;
    }

    public boolean isEmpty() {
        if (index == 0)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (index == size)
            return true;
        else
            return false;
    }
}
