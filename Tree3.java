import java.util.*;
public class Tree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bst = new BinaryTree();
        int data;
        while ((data = sc.nextInt()) != -1) {
            bst.append(data);
        }
        sc.close();
        bst.display(bst.root);
    }
}
class BinaryTree{
    Node root ;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            data = val;
            left = null;
            right = null;
        }
    }
    BinaryTree(){
        root=null;
    }
    public void append(int val){
        Node newNode = new Node(val);
        if(root==null){
            root = newNode;
        }
        else{
            Node temp = root;
            while(true){
                if(val<temp.data){
                    if(temp.left!=null){
                        temp = temp.left;
                    }
                    else{
                        temp.left = newNode;
                        break;
                    }
                }
                else {
                    if(temp.right!=null){
                        temp = temp.right;
                    }
                    else{
                        temp.right = newNode;
                        break;
                    }
                }
            }
        }
    }
     void display(Node temp){
        if(temp!=null){
            System.out.print(temp.data+" ");
            display(temp.left);
            display(temp.right);
        }
    }
}