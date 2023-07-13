import java.util.Scanner;
public class ToPrintNthLevelOfBinaryTree {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public static void nthLevel(Node root,int level){
        if(root==null) return;
        if(level==1){
            System.out.print(root.data+" ");
            return;
        }
        nthLevel(root.left,level-1);
        nthLevel(root.right,level-1);

    }
    public static int height(Node root){
        if(root==null) return 0;
        int leftSubtreeHeight=1+height(root.left);
        int rightSubtreeHeight=1+height(root.right);
        return Math.max(leftSubtreeHeight,rightSubtreeHeight);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        Node i=new Node(9);
        // Linking the nodes
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        g.left=h;
        g.right=i;
//        System.out.print("Enter the level you want to print : ");
//        int level=sc.nextInt();
//        nthLevel(a,level);

//        To print the level order traversal
        for(int var=1;var<=height(a);var++){
            nthLevel(a,var);
            System.out.println();
        }


    }
}
