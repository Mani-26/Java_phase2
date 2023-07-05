import java.util.*;

public class QueueHWD6{

    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= b; i++) {
            int n = sc.nextInt();
            if (count >= a) {
                if (n % 2 == 0) {
                    q.dequeue();
                    q.enqueue(n);
                    count++;
                }
            } else {
                q.enqueue(n);
                count++;
            }
        }
        sc.close();
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
            throw new IndexOutOfBoundsException("Queue is Empty");
        } else {
            int temp = front.data;
            front = front.next;
            return temp;
        }
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
