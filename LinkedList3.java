import java.util.*;
public class LinkedList3{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student mark:");
        int data = sc.nextInt();
        while (data != -1) {
            list.append(data);        
            System.out.println("Enter the student mark:");
            data = sc.nextInt(); 
        }
        sc.close();
        System.out.println("The students' marks are:");
        list.display();
        System.out.print("\nThe maximum mark is " + list.max());
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
    public int max() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        int max = head.data;
        Node temp = head.next;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }
}