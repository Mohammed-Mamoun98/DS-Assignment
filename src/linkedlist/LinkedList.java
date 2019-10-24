package linkedlist;

public class LinkedList {
    public Object data;
    public Node head;

    public static LinkedList list;

    public static void add(int element){
        Node newNode = new Node(element);
        if(list.head.next == null){
            list.head = newNode;
        }
        else {
          Node  last = list.head;
            while(last.next != null){
                last = last.next;
            }

            last.next = newNode;

        }
    }
}
