import java.util.*;

public class LinkedListHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.print("Enter the number of nodes to add: ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            int data = sc.nextInt();
            list.append(data);
        }
        System.out.print("Enter the data of the node to delete: ");
        int value = sc.nextInt();
        list.del(value);
        System.out.println();
        System.out.println("Node with data " + value + " is deleted.");
        list.display();
        sc.close();
    }
}

class LinkedList {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int a) {
            data = a;
            next = null;
            prev = null;
        }
    }

    public void append(int a) {
        Node newNode = new Node(a);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void del(int val) {
        Node n = head;
        int count = 0;
        while (n != null) {
            Node h = n.prev;
            if (n.data == val) {
                count++;
                if (h == null) {
                    head = n.next;
                    break;
                }
                h.next = n.next;
                break;
            }
            n = n.next;
        }
        if (count == 0) {
            System.out.println("Element " + val + " not found in the list");
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}