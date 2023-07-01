
import java.util.*;
public class LinkedList1hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Doubly dlist = new Doubly();
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter element " + i + " : ");
            int a = sc.nextInt();
            dlist.append(a);
        }
        System.out.println("Enter the element to delete: ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Before deletion:");
        dlist.display();
        dlist.delete(b);
        System.out.println("After deletion:");
        dlist.display();
    }
}
class Doubly{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int a){
            data = a;
            next = null;
            prev = null;
        }
    }
    Doubly(){
        head = null;
        tail = null;
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
    public void delete(int b) {
        if (head == null) {
            return; 
        }

        Node current = head;
        while (current != null) {
            if (current.data == b) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                    current.next = null;
                } else if (current == tail) {
                    tail = current.prev;
                    tail.next = null;
                    current.prev = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    current.prev = null;
                    current.next = null;
                }
                return; // Node deleted, exit the method
            }
            current = current.next;
        }
        System.out.println("Element not found in the list."); // Element not found
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}