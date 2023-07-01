import java.util.*;
public class Stack3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack();
        String str = sc.next();
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                int c = (int)str.charAt(i)-48;
                stk.push((float)c);
            } 
            else {
                float m = stk.pop();
                float n = stk.pop();
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
        System.out.printf("%.1f", (double)stk.pop());
    }
}
class Stack{
    Node head = null;
    class Node{
        float data;
        Node next;
        Node(float val){
            data = val;
            next  = null;
        }
    }

    public void push(float val){
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public float pop() {
        Node temp = head;
        head= temp.next;
        return temp.data;
    }
}