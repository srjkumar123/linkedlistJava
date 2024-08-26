package MiddleElement;

import java.util.HashSet;
import java.util.Set;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Middle {

    static boolean detectLoop(Node head) {
        Set<Node> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }

    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static int getLinkedListSize(Node head) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    static Node findMiddleElement(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = head;
        for (int i = 2; i <= 101; i++) {
            temp.next = new Node(i);
            temp = temp.next;
        }

        printLinkedList(head);

        int size = getLinkedListSize(head);
        System.out.println("Size: " + size);

        Node middle = findMiddleElement(head);
        System.out.println("Middle element: " + middle.data);
    }
}
