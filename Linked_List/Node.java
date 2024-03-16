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

