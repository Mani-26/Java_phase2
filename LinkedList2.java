import java.util.*;
public class LinkedList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int data = sc.nextInt();
        while(data != -1){
            list.append(data);
            data = sc.nextInt();
        }
        int pos = sc.nextInt();
        int value = sc.nextInt();
        sc.close();
        System.out.println("Before Insertion:");
        list.display();
        list.mid(pos, value);
        System.out.println("\nAfter Insertion:");
        list.display();
    }
}
class LinkedList{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    LinkedList(){
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
    public void mid(int posi, int valuee) {
        int pos = posi;
        int value = valuee;
        Node temp = head;
        Node newNode = new Node(value); 
        for (int i = 0; i < pos-1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void add(String string) {
    }
    public String get(int n) {
        return null;
    }
}