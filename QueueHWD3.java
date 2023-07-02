import java.util.*;

public class QueueHWD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        System.out.print("Queue size is ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            q.enqueue(sc.nextInt());
        }
        q.display();
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

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}