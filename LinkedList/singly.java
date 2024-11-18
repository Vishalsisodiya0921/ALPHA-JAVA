package LinkedList;
public class singly {
    public ListNode head;
    private static class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        singly sll = new singly();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth  = new ListNode(11);
        sll.head.next = second; // 10 -> 1
        second.next = third; // 10-> 1 -> 8
        third.next = fourth; // 10 -> 1 -> 8 -> 11 -> null
        System.out.println("Original Linked List: ");
        sll.display();
    }
}

// class ListNode:
//     def __init__(self, data):
//         self.data = data
//         self.next = None

// class SinglyLinkedList:
//     def __init__(self):
//         self.head = None

//     def display(self):
//         current = self.head
//         while current:
//             print(current.data, end="->")
//             current = current.next
//         print("null")

// # Creating a linked list and displaying it
// if __name__ == "__main__":
//     sll = SinglyLinkedList()
//     sll.head = ListNode(10)
//     second = ListNode(1)
//     third = ListNode(8)
//     fourth = ListNode(11)

//     sll.head.next = second  # 10 -> 1
//     second.next = third     # 10 -> 1 -> 8
//     third.next = fourth     # 10 -> 1 -> 8 -> 11 -> null

//     print("Original Linked List:")
//     sll.display()

