import java.util.*;
public class Stack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack();
        int n = sc.nextInt();
        int data;
        for (int i = 0; i < n; i++) {
            data = sc.nextInt();
            stk.push(data);
        }
        sc.close();
        stk.display();
        System.out.print("\nTop Element is ");
        stk.top();
        stk.pop();
        System.out.println();
        stk.display();
    }
}
class Stack{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next  = null;
        }
    }
    public void push(int val){
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void top() {
        System.out.print(head.data);
    }
    public void pop() {
        Node temp = head;
        head= temp.next;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}