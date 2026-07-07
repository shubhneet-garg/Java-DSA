package LinkList;

import java.util.Scanner;

public class DisplayList {
    public static void displayRec(Node head) {
        if(head == null) return;
        System.out.print(head.val+" ");
        displayRec(head.next);
    }
    public static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b; b.next = c;
        c.next = d; d.next = e;
        System.out.println(get(a,2));
//        display(a);
//        displayRec(a);
    }

    private static int get(Node head, int idx) {
        Node temp = head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
}
