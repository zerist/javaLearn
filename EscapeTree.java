import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class EscapeTree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        ArrayList<Node> tree = new ArrayList<>();
        for(int i=0; i<n; i++){
            Node node = new Node(i + 1);
            tree.add(node);
        }
        for(int i=0; i<n * 2; i++){
            int x = input.nextInt();
            int y = input.nextInt();
            Node parent = new Node(0), child = new Node(0);
            for(int k=0; k<tree.size(); k++){
                if(tree.get(k).val == y){
                    parent = tree.get(k);
                }
                if(tree.get(k).val == x){
                    child = tree.get(k);
                }
            }
            if(parent.val != 0 && child.val != 0) {
                parent.add(child);
            }
        }

        Node root = new Node(0);
        for(int i=0; i<tree.size(); i++){
            if(tree.get(i).val == 1){
                root = tree.get(i);
            }
        }

        ArrayList<Integer> data = new ArrayList<>();
        for(int i=0; i<data.size(); i++){
            Node nd = root.childrenNode.get(i);

        }
        System.out.println(Collections.min(data));
    }



    static class Node{
        ArrayList<Node> childrenNode = new ArrayList<>();
        int val;

        public Node(int n){
            this.val = n;
        }

        public void add(Node t){
            this.childrenNode.add(t);
        }


    }
}
