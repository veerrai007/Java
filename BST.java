import java.util.*;

public class BST {

    static class Node {
    
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }  
    }

    public static Node insert(Node root,int val){

        if (root==null) {
            root = new Node(val);
            return root;
        }

        if (root.data>val) {
            root.left=insert(root.left, val);
        }
        else{
            root.right=insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root){
        if (root==null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static Boolean search(Node root,int key){

        if (root==null) {
            return false;
        }
        if (root.data>key) {
            return search(root.left, key);
        }
        else if (root.data==key) {
            return true;
        }
        else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root,int val){
        if (root.data>val) {
            root.left=delete(root.left, val);
        }
        else if(root.data<val){
            root.right=delete(root.right, val);
        }
        else{
            //case 1
            if (root.left==null && root.right==null) {
                return null;
            }
            //case 2
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case 3
            else{
                Node IS = inorderSucceser(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
        }
        return root;
    }

    public static Node inorderSucceser(Node root){
        while (root.left!=null) {
            root=root.left;
        }
        return root;
    }

    //Print numbers between of range X and Y

    public static void printInRange(Node root,int x,int y){
        if (root==null) {
            return;
        }
        if (root.data>=x && root.data<=y) {
            printInRange(root.left, x, y);
            System.out.println(root.data+" ");
            printInRange(root.right, x, y);
        }
        else if(root.data>=y){
            printInRange(root.left, x, y);
        }
        else{
            printInRange(root.right, x, y);
        }
    }

    //Print root to leaf all paaths

    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){

        if (root==null) {
            return;
        }

        path.add(root.data);

        if (root.left==null && root.right==null) {
            printPath(path);
        }
        else{
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }

        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int nodes[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<nodes.length;i++){
            root = insert(root,nodes[i]);
        }
        inOrder(root);
        System.out.println();
        
        // System.out.println(search(root, 4));

        // delete(root,5);
        // inOrder(root);

        // printInRange(root, 3, 10);

        printRoot2Leaf(root, new ArrayList<>());

    }
    
}
