package Linked_List;

public class Node {
    private int data;
    private Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static int getCount(Node head) {
        int count = 0;
        Node runner = head;
        while (runner != null) {
            count = count + 1;
            runner = runner.next;
        }
        return count;
    }

    public static int getRecursiveCounter(Node head){
        if(head == null){
            return 0;
        }
        return 1 + getRecursiveCounter(head.next);
    }


    public static Node addLast(int data, Node head){
        Node last = new Node(data);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = last;
        return head;
    }

    public static Node modifyAdd(int toBeComparedX, int toBeAddedY, Node head){
        Node current = head;
        Node y = new Node(toBeAddedY);
        Node temp;

        while(current.next.data != toBeComparedX){
            current = current.next;
        }
        temp = current.next.next;
        current.next = y;
        y.next = temp;
        return head;

    }

    public static int getMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node demo = new Node(2);
        demo.next = new Node(3);
        demo.next.next = new Node(4);

        int normalCount = getCount(demo);
        int recursiveCount = getRecursiveCounter(demo);

        System.out.println("Number of nodes in there are " + normalCount);
        System.out.println("Number of node in there recursively " + recursiveCount);
    }
}

