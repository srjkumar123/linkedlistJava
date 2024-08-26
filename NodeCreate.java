

public class NodeCreate {
    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static Node head;

    public static int size() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public static void insertNode(int position, int value) {
        Node node = new Node(value);
        Node temp = head;
        int size = size();
        if (position < 1) {
            return;
        }
        if (position > size + 1) {
            return;
        }
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;

        }


    }

    public static void insertNode(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }

    }

    public static void deleteNode(int position) {
        int size = size();
        if (position < 1) {
            return;
        } else if (position > size) {
            return;
        } else if (position == size) {
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp.next = null;

            }
        } else if (position == 1) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    public static void deleteValue(int x){

        if (head.value==x){
            head = head.next;

        }
        else {

            Node temp = head;
            while (temp.next!=null){
                if (temp.next.value ==x){
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public static void printLL() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.print(temp.value);
    }

    public static void main(String[] args) {
        insertNode(23);
        insertNode(25);
        insertNode( 23);
        insertNode( 02);
        insertNode(03);
        insertNode( 04);
        insertNode( 05);
        insertNode(06);
        insertNode( 07);

        //printLL();

        //Reverse the Linked list
        Node previous = null;
        Node current = head;
//        while (current!=null){
//            Node nxt = current.next;
//            current.next = previous;
//            previous = current;
//            current = nxt;
//
//        }
//        head = previous;
        printLL();


        //Reverse from B to C position
        int B= 3;
        int C = 6;
        Node temp1 = null;
        Node temp2= head;
        int i = 1;
        while (i<B){
            temp1 = temp2;
            temp2 = temp2.next;
            i++;
        }
        while (B<=C){
            Node nxt = current.next;
            current.next = previous;
            previous = current;
            current = nxt;
            B++;

        }

        if (temp1 !=null){
            temp1.next = previous;
        }
        else {
            head = previous;
        }
        temp2.next = current;
        printLL();
    }


}
