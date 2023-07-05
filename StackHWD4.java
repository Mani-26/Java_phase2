import java.util.*;

public class StackHWD4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack();
        String s1 = sc.nextLine();
        sc.close();
        for (int i = 0; i < s1.length(); i++) {
            stk.push(s1.charAt(i));
        }
        stk.printstack();
    }
}
class Stack {
    Node head = null;

    class Node {
        char data;
        Node next;

        Node(char val) {
            data = val;
            next = null;
        }
    }

    void push(char data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    void printstack() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}