import java.util.Scanner;

public class Queue3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int a;
        while ((a = sc.nextInt()) != 0) {
            if (a == 1) {
                int data = sc.nextInt();
                q.enqueue(data);
                System.out.println("Enqueued value: " + data);
            }
            if (a == 2) {
                int del = q.dequeue();
                System.out.println("dequeued value: " + del);
            }
        }
        sc.close();
        System.out.print("Queue elements: ");
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
        Node newnode = new Node(val);
        if (front == null) {
            front = newnode;
            rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
        }
    }
    public int dequeue() {
        if (front == null) {
            throw new IndexOutOfBoundsException("queue is empty");
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