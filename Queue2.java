import java.util.*;
public class Queue2 {
    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int data;
        for (int i = 0; i < n; i++) {
            data = sc.nextInt();
            q.enqueue(data);
        }
        sc.close();
        System.out.println(q.dequeue());
    }
}

class Queue {
    Node front;
    Node rear;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(int val) {
        Node newNode = new Node(val);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (front == null) {
            System.out.print("Queue is Empty");
        }
        int temp = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return temp;
    }
}