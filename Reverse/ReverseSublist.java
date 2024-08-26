package Reverse;

public class ReverseSublist {


    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node head;
    //==============SIZE OF LL====================
    public static int size(){
        int size = 0;
        Node temp = head;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }



    public static void addNode(int data){
        Node node = new Node(data);

        if (head == null){
            head = node;
        }
        else {
            Node temp = head;
            while (temp.next !=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public static void addNode(int position, int data) {
        Node node = new Node(data);
        Node temp = head;
        int size = size();
        if (position < 1) {
            return;
        } else if (position > size + 1) {
            return;
        } else if (position == 1) {
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

    public static void printList(){
        Node temp = head;
        while (temp.next !=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
    public static void main(String[] args) {



        for (int i = 1; i <= 10; i++) {
           addNode(i);
        }


         //PRINT LIST
          printList();

          //Rverse Sublist
        int B= 3;
        int C = 7;
        Node dummy = new Node(0);
        dummy.next = head;
        Node pre = dummy;
        int i=1;
        while (i<B){
            pre = pre.next;
            i++;
        }

        Node start = pre.next;
        Node end = start.next;

        for (int j = 1; j <=C-B ; j++) {
           start.next = end.next;
           end.next = pre.next;
           pre.next = end;
           end = start.next;
        }
        if (B==1){
            head = pre.next;
        }
        System.out.println("\n=======================");
        printList();






    }
}
