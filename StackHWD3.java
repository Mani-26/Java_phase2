import java.util.*;

public class StackHWD3 {
    public static void main(String[] args) {
        Stack stk = new Stack();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int n = 0;
        String str1 = "", str2 = "";
        for (int i = 0; i < str.length(); i++) {
            stk.push(str.charAt(i));
        }
        while (n <= (str.length() / 2) - 1) {
            str1 += str.charAt(n);
            str2 += stk.pop();
            n++;
        }
        if (str2.equals(str1)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}

class Stack {
    Node head;

    class Node {
        char data;
        Node next;

        Node(char val) {
            data = val;
            next = null;
        }
    }

    public void push(char str) {
        Node newNode = new Node(str);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public char pop() {
        Node temp = head;
        head = head.next;
        return temp.data;
    }
}