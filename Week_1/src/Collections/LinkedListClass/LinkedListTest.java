package Collections.LinkedListClass;

import javax.xml.soap.Node;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList newNode = new LinkedList();
        newNode.addFirst(5);
        newNode.addFirst(8);
        newNode.addLast(6);
        newNode.addLast(7);
        newNode.add(4, 9);
//        newNode.removeFirst();
//newNode.remove(2);
        newNode.printList();
        System.out.println(newNode.size());
//        newNode.size();
//        System.out.println(newNode.size());
//        System.out.println(newNode.getFirst());
//        newNode.getLast();
//        System.out.println(newNode.getLast());
//        System.out.println(newNode.get(4));
//        newNode.remove(2);
//        System.out.println(newNode.remove(3));
//        newNode.printList();
        newNode.indexOf(5);
        System.out.println(newNode.indexOf(9));
        System.out.println(newNode.contains(7));
    }
}
