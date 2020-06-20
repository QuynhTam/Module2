package Collections.ArrayList;

import java.util.Arrays;

public class ArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    //Constructs an empty list with an initial capacity of ten.
    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //Constructs an empty list with the specified initial capacity.
    public ArrayList(int initCapacity) {
        elements = new Object[initCapacity];
    }

    public void ensureCapacity() {
        if (size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public void ensureCapacity(int minCapacity) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, minCapacity);
        }
    }

    //thêm phần tủ tại vị trí index
    public void add(int index, E element) {
        ensureCapacity();
        for (int i = index; i < size; i++) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    //trả về phần tử tại vị trí index
    public E get(int index) {
        E temp = (E) elements[index];
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index : " + index + " Size : " + this.size);
        else
            return temp;
    }

    // xoá phần tử tại vị trí index
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index " + index + " out of bounds" + "size " + size);
        else {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
        }
        size--;
        return (E) elements[index];
    }

    // Lấy chiều dài mảng
    public int length() {
        return this.elements.length;
    }

    //lấy số phần tử của mảng
    public int size() {
        return this.size;
    }

    //kiểm tra xuất hiện của phần tử
    public boolean contains(E elment) {
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(elment)) {
                check = true;
                break;
            }
        }
        return check;
    }

    //Lấy vị trí của phần tử
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    //sao chép mảng
    public E clone() {
        Object elementsNew = Arrays.copyOf(elements, size);
        return (E) elementsNew;
    }

    //Xoá toàn bộ phần tử
    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    //
    public boolean add(E element) {
        ensureCapacity();
        elements[size ] = element;
        return true;
    }
}
