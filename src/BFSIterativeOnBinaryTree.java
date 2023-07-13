import java.util.LinkedList;
import java.util.Queue;
public class BFSIterativeOnBinaryTree {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public static void bfsTraversal(Node root){
        Queue<Node > q=new LinkedList<>();
        if(root==null) return;
        q.add(root);
        while(!q.isEmpty()){ // can use here q.size()
            Node temp=q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.data+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        // Linking the nodes
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        bfsTraversal(a);
    }
}
