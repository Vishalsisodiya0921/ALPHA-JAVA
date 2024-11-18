package LinkedList;

public class FirstLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step1 = create node
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        //step2 = make the new node's next point to the current head
        newNode.next = head;

        //step3 = update the head to point to the new node
        head = newNode;

        
    }
    public static void main(String[] args) {
        FirstLL ll = new FirstLL();
        ll.addFirst(1);
        ll.addFirst(2);
        // ll.head = new Node(1);
        // ll.head.next = new Node(2); 
    }
}
