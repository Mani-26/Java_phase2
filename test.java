import java.util.*;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        linkedlist list = new linkedlist();
        int data;
        while ((data = sc.nextInt()) != -1) {

            list.insert(data);
        }

        list.display();
    }
}

class linkedlist {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            newnode.next = newnode;
        } else {
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;

        }
    }

    void display() {
        Node temp = head;
        if (temp == null) {
            return;
        } else {

            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);

        }

    }
}
