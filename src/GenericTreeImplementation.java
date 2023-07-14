import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenericTreeImplementation {
    static class Node{
        int data;
        List<Node> child;
        Node(int data){
            this.data=data;
            child=new ArrayList<Node>();
        }
    }
    public static void formTree(Node root){
        root.child.add(new Node(2));
        root.child.add(new Node(3));
        root.child.add(new Node(45));
        root.child.get(0).child.add(new Node(5));
        root.child.get(0).child.add(new Node(56));
        root.child.get(0).child.add(new Node(6577));
    }
    public static int bfs(Node root,int maxVal){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node temp=q.peek();
            int n=temp.child.size();
            for(int i=0;i<n;i++){
                q.add(temp.child.get(i));
            }
           maxVal=Math.max(maxVal,temp.data);
            q.remove();
        }
        return maxVal;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        formTree(root);
        int maxVal=Integer.MIN_VALUE;
        System.out.println(bfs(root,maxVal));

    }
}
