package Collections.LinkedListClass;

public class LinkedList {
    private Node head;
    private int numNode = 0;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public LinkedList() {
    }

    public LinkedList(Object data) {
        this.head = new Node(data);
    }

    //thêm vào đầu danh sách
    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        numNode++;
    }

    //thêm vào cuối danh sách
    public void addLast(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            numNode++;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            numNode++;
        }

    }

    //Thêm phần từ vào vị trí index
    public void add(int index, Object data) {
        if (index == 0)
            addFirst(data);
        else if (index >= numNode)
            addLast(data);
        else {
            Node current = head;
            Node newNode = new Node(data);
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node temp = current.next;
            current.next = newNode;
            newNode.next = temp;
            numNode++;
        }
    }
//Hiển thị danh sách

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    //số phần tử của danh sách
    public int size() {
        return this.numNode;
    }

    //lấy phần tủ đầu tiên
    public Object getFirst() {
        return head.data;
    }

    //Lấy phần tử cuối
    public Object getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    //Lấy phần tử ở vị trí index
    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    //xoá phần tử đầu
    public Object removeFirst() {
        if (numNode == 0)
            return null;
        else {
            Node temp = head;
            head = head.next;
            numNode--;
            return temp.data;
        }
    }

    //xoá phần tử cuối
    public Object removeLast() {
        if (numNode == 0)
            return null;
        else if (numNode == 1) {
            Node temp = head;
            head = null;
            numNode = 0;
            return temp.data;
        } else {
            Node temp = head;
            for (int i = 0; i < numNode - 2; i++) {
                temp = temp.next;
            }
            temp.next = null;
            numNode--;
            return temp.data;
        }
    }

    //xoá phần tử ở vị trí index
    public Object remove(int index) {
        Node previos = head;
        if (index < 0 || index > numNode) {
            return null;
        } else if (index == 0)
            return removeFirst();
        else if (index == numNode)
            return removeLast();
        else {
            for (int i = 0; i < index - 1; i++) {
                previos = previos.next;
            }
            Node current = previos.next;
            previos.next = current.next;
            numNode--;
            return current.data;
        }
    }

    //lấy vị trí của phần tử
    public int indexOf(Object data) {
        Node temp = head;
        int index = 0;
        for (int i = 0; i < numNode; i++) {
            if (temp.data.equals(data)) {
                index = i;
                break;
            }
            temp = temp.next;
        }
        return index;
    }

    //kiểm tra phần tử có trong danh sách không
    public boolean contains(Object data) {
        boolean check = false;
        Node temp = head;

        for (int i = 0; i < numNode; i++) {
            if (temp.data.equals(data)) {
                check = true;
                break;
            }
            temp = temp.next;
        }
        return check;
    }
}
