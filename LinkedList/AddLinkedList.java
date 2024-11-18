package LinkedList;

public class AddLinkedList {
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
    public static int size;

    // Add element in the front position
    public void addFirst(int data){
        //step-1 create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step-2 newNode k next main head
        newNode.next = head;
        //step-3 head main newNode
        head = newNode;
    }

    // Add element in the Last position
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step-2 tail main newNode
        tail.next = newNode;
        //step-3 tail main newNode
        tail = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add element in the Middle position
    public void addMid(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int count =  0;
        while(count < index-1){
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        AddLinkedList ll = new AddLinkedList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMid(2,9);
        ll.print(); // Output: 1->2->3->4->5->
        System.out.println(AddLinkedList.size);
    }
}
