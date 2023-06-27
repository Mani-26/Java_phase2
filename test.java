import java.util.*;
class linkedlist{
    node head;
    node tail;
    node head2;
   
    class node {
        int data;
        node next;   //next is the add of the next node th value next is refer the any obj os node class//
        node (int val){
            data =val;
            next=null;
        }
    }
    linkedlist(){
        head = null;
        tail=null;
    }
    public void append(int val){
    node newnode= new node(val);     //the new node will create a obj in a mem and it is the 
                                          // reference that will be sorted in the new node 
                                          
    if(head== null){
        head=newnode;
        tail=newnode;
    }
    else{
       tail.next=newnode;
       tail=newnode;
    }
}
public void display(){
    node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    
}
 public void rev(int val){
 node newnode= new node(val);  
                                          
    if(head2== null){
        head2=newnode;
    }
    else{
        newnode.next=head2;
        head2=newnode;
    }
}
  public void display2(){
    node temp2=head2;
    
    while(temp2!=null){
        System.out.print(temp2.data+" ");
        temp2=temp2.next;
    
    }
}

}
public class test
{
	public static void main(String[] args) {
	    linkedlist list = new linkedlist();
        Scanner sc=new Scanner (System.in);
        int data;

        while((data=sc.nextInt())!= -1){
          
            list.append(data);
            list.rev(data);
        }
        sc.close();
        System.out.println("Original Order:");
        list.display();
        
        System.out.println("\nReverse Order:");
           
         list.display2();
        
        
        
	}
}