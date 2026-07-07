package LinkList;
class Node{ // user defined data type
    int val;
    Node next;
    Node (int val){
        this.val = val;
    }
}
class Linkedlist{ // user defined data structure
    Node head;
    Node tail;
    int size;
    void addAtTail(int val){
         Node temp = new Node(val);
         if(tail == null) head = tail = temp;
         else{
             tail.next = temp;
             tail = temp;
         }
         size++;
    }
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void deleteAtHead(int val){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        head = head.next;
        size--;
    }
    void display(){
        if(head == null) return ;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10); ll.display();
        ll.addAtTail(20); ll.display();
        ll.addAtTail(30); ll.display();
        ll.addAtTail(40); ll.display();
        ll.addAtHead(50); ll.display();
        ll.addAtHead(60); ll.display();
        ll.deleteAtHead(60); ll.display();
    }
}
