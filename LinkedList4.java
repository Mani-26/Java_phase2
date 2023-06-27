import java.util.*;
public class LinkedList4{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            list.append(data);
            list.insert(data);
            data = sc.nextInt(); 
        }
        sc.close();
        list.display();        
        list.display1();
    }
}
class LinkedList {
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
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
    public void insert(int val) {
        Node newNode1 = new Node(val);
        if (head == null) {
            head = newNode1;
        } else {
            newNode1.next = head;
            head = newNode1;
        }
    }
    public void display1() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}