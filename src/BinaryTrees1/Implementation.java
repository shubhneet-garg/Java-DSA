package BinaryTrees1;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
class pair{
    Node node;
    int level;
    pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}
public class Implementation {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

//        kTHLevel(a,0,0);
//        levelorder(a);
//        levelorderlinewise(a);
//        System.out.println();
//        System.out.println(size(a));
//        System.out.println(sum(a));
//        System.out.println(product(a));
//        System.out.println(max(a));
//        System.out.println(min(a));
//        System.out.println(level(a));
//        preorder(a);
//        System.out.println();
//        Inorder(a);
//        System.out.println();
//        postorder(a);
//        System.out.println();
    }
    private static int size(Node root) {
        if(root == null) return 0;
        return (1 + size(root.left) + size(root.right));
    }
    private static int level(Node root) {
        if(root == null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }
    private static int min(Node root) {
        if(root == null) return Integer.MAX_VALUE;
        int leftMin = min(root.left);
        int rightMin = min(root.right);
        return Math.min(root.val, Math.min(leftMin, rightMin));
    }
    private static int max(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        int leftMax = max(root.left);
        int rightMax = max(root.right);
        return Math.max(root.val, Math.max(leftMax, rightMax));
    }
    private static int product(Node root) {
        if(root == null) return 1;
        return (root.val * product(root.left) * product(root.right));
    }
    private static int sum(Node root) {
        if(root == null) return 0;
        return (root.val + sum(root.left) + sum(root.right));
    }
    private static void preorder(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void Inorder(Node root) {
        if(root == null) return;
        Inorder(root.left);
        System.out.print(root.val+" ");
        Inorder(root.right);
    }
    private static void postorder(Node root) {
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    private static void levelorder(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }
    private static void levelorderlinewise(Node root){
        Queue<pair> q = new LinkedList<>();
        int currlevel = 0;
        q.add(new pair(root,0));
        while(q.size()>0){
            pair front = q.remove();
            Node node  = front.node;
            int level = front.level;
            if(front.level!=currlevel){
                currlevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(node.left!=null) q.add(new pair(node.left,level+1));
            if(node.right!=null) q.add(new pair(node.right,level+1));
        }
        System.out.println();
    }
    private static void kTHLevel(Node root, int level, int k){
        if(root==null) return;
        if(level==k) System.out.println(root.val+" ");
        kTHLevel(root.left,level+1,k);
        kTHLevel(root.right,level+1,k);
    }
}
