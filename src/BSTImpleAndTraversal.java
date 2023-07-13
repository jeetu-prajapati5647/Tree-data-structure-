public class BSTImpleAndTraversal {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public static void inorderTraversalINBst(Node root){
        if(root==null) return;
        inorderTraversalINBst(root.left);
        System.out.print(root.data+" ");
        inorderTraversalINBst(root.right);

    }
    public static void main(String[] args) {
        Node a=new Node(20);
        Node b=new Node(15);
        Node c=new Node(25);
        Node d=new Node(12);
        Node e=new Node(16);
        Node f=new Node(21);
        Node g=new Node(35);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        inorderTraversalINBst(a);

    }
}
