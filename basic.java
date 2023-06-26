import java.util.*;

public class basic {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc=new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            list.insertatbegin(data);
        }
        sc.close();
        list.display();
    }
}

class LinkedList{
    Node head;
    class Node{
        int data;
        Node next; //pointer  -> will denote the address of the next node 
        // the value next is refer the any object of node class
        Node(int val){
            data = val;
            next = null;
        }
    }


LinkedList(){
    head = null;
}
public void insertatbegin(int val){
    Node newNode = new Node(val);
    // the node will create a object in a memory and it will reference that will be stored in new node  so new node is a reference variable
    if(head == null){
        head = newNode;
    }
    else{
        // list is not empty
        newNode.next = head;
        head = newNode;
    }
}
public void display() {// traversing
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data+ " ");
        temp = temp.next;//jump
    }
    }
}