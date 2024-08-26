package FindLoop;

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
public class Main {
    static boolean detectLoop(Node head){
        Set<Node> set = new HashSet<>();

        while (head!=null){

            if (set.contains(head)) return true;
            set.add(head);

            head = head.next;
        }
        return false;
    }



    public static void main(String[] args) {
      Node head = new Node(1);
      int i = 2;
      Node temp = head;
      while (i<=20){
          Node n = new Node(i);
          temp.next = n;
          temp = temp.next;
          i++;
      }

      //==================================================================================
        //PRINT LL

        Node temp1 = head;
        while (temp1.next !=null){
            System.out.print(temp1.data+" ");
            temp1 = temp1.next;
        }
        System.out.print(temp1.data);

        //==============================================================================
        //SIZE
        Node temp2 = head;
        int size = 0;
        while (temp2 !=null){
            size++;
            temp2 = temp2.next;
        }
        System.out.println();
        System.out.println("Size: "+size);

        //========================================================================
        //create loop
        Node temp3 = head;
        int j = 1;
        for (int k = 1; k <6 ; k++) {

            temp3 = temp3.next;
        }
        temp3.next = head;

//        Node temp4 = head;
//        while (temp4.next !=null){
//            System.out.print(temp4.data+" ");
//            temp4 = temp4.next;
//        }
//        System.out.print(temp4.data);

        if (detectLoop(head)) {
            System.out.println("Loop found");
        }
        else {
            System.out.println("Loop not found");
        }


    }
}
