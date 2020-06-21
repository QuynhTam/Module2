package Collections.LinkedList;

import javax.xml.soap.Node;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);
        ll.add(0, 2);
        ll.add(1, 3);
        ll.add(2, 4);
        ll.add(3, 5);
        ll.printList();
        System.out.println(ll.get(3));
    }

}
