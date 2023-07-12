// Implementation for binary tree
public class BasicTreeImplementation {
    static class Node{
        int data;
        Node left,right;
        Node(int val){
//            By default left and right are pointing to null
            this.data=val;
        }
    }
    // Recursive way to traverse the tree
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        // Linking the nodes
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        // Traversing the binary tree
        preOrder(a);

    }
}
