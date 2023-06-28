import java.util.*;
public class LinkedList4{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            list.append(data);
            data = sc.nextInt(); 
        }
        sc.close();
        System.out.print("Original order: ");
        list.display();             
        System.out.print("\nReverse order: ");
        list.display1();
    }
}
class LinkedList {
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }
    LinkedList() {
        head = null;
        tail = null;
    }
    public void append(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void display1() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}