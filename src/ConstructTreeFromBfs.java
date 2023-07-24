import java.util.LinkedList;
import java.util.Queue;

public class ConstructTreeFromBfs {
    static class Node{
        int val;
        Node left,right;
        Node(int val) {
            this.val=val;
        }
    }
    public static Node constructTree(String arr[]){
        int n= arr.length;
        int x=Integer.parseInt(arr[0]);
        Node root=new Node(x);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<n-1){
            Node temp=q.remove();
            Node lft=new Node(0);
            Node rght=new Node(0);
            if(arr[i].equals("")) lft=null;
            else{
                int l=Integer.parseInt(arr[i]);
                lft.val=l;
                q.add(lft);
            }
            if(arr[i+1].equals("")) rght=null;
            else{
                int r=Integer.parseInt(arr[i+1]);
                rght.val=r;
                q.add(rght);
            }
            temp.left=lft;
            temp.right=rght;
            i+=2;
        }
        return root;
    }
    public static int height(Node root){
        if(root==null) return 0;
        int a=1+height(root.left);
        int b=height(root.right);
        return Math.max(a,b);
    }
    public static void bfsByNthLevel(Node root,int n){
        if(root==null) return;
        if(n==1){
            System.out.print(root.val+" ");
            return;
        }
        bfsByNthLevel(root.left,n-1);
        bfsByNthLevel(root.right,n-1);
    }
    public static void main(String[] args) {
        String arr[]={"1","2","3","4","5","","6","7",""};
        Node root=constructTree(arr);
        int level=height(root);
        for(int i=1;i<=level;i++){
            bfsByNthLevel(root,i);
            System.out.println();
        }
    }
}
