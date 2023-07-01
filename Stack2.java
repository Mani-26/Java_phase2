import java.util.*;
public class Stack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack();
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                int c = (int)str.charAt(i)-48;
                stk.push(c);
            } 
            else {
                int m = stk.pop();
                int n = stk.pop();
                switch (str.charAt(i)) {
                    case '*':
                        stk.push(m * n);
                        break;
                    case '+':
                        stk.push(m + n);                   
                        break;
                    case '-':
                        stk.push(n - m);                       
                        break;
                    case '/':
                        stk.push(n / m);                      
                        break;
                }
            }
        }
        sc.close();
        System.out.print(stk.pop());
    }
}
class Stack{
    Node head = null;
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
    public int pop() {
        Node temp = head;
        head= temp.next;
        return temp.data;
    }
}