import java.util.*;

public class QueueHWD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        for (int i = 0; i < 5; i++) {
            q.enqueue(sc.nextInt());
        }
        sc.close();
        q.display();
        q.dequeue();
        q.dequeue();
        System.out.println();
        q.display();
        do{
            q.dequeue();
        }
        while (q.dequeue() !=0); 
        System.out.println();
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
            return 0;
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
        if (temp==null) {
            System.out.println("Queue is empty");
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}