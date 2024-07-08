// import java.util.*;

// public class Binarytree {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data=data;
//             this.left=null;
//             this.right=null;
//         } 
//     }

//     static class BinaryTree {

//         static int idx = -1;
//         public static Node buildtree(int nodes[]){

//             idx++;
//             if(nodes[idx]==-1){
//                 return null;
//             }

//             Node curNode = new Node(nodes[idx]);
//             curNode.left = buildtree(nodes);
//             curNode.right = buildtree(nodes);

//             return curNode;
//         }
//     }

//     public static void preOrder(Node root){

//         if (root==null) {
//             return;
//         }
//         System.out.print(root.data+" ");
//         preOrder(root.left);
//         preOrder(root.right);
//     }

//     public static void inOrder(Node root){
//         if (root==null) {
//             return;
//         }
//         inOrder(root.left);
//         System.out.print(root.data+" ");
//         inOrder(root.right);
//     }

//     public static void postOrder(Node root){
//         if (root==null) {
//             return;
//         }
//         postOrder(root.left);
//         postOrder(root.right);
//         System.out.println(root.data+" ");
//     }

//     public static void levelOrder(Node root){

//         if (root==null) {
//             return;
//         }

//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         q.add(null);

//         while (!q.isEmpty()) {
//             Node curNode = q.remove();
//             if (curNode==null) {
//                 System.out.println();
//                 if (q.isEmpty()) {
//                     break;
//                 }
//                 else{
//                     q.add(null);
//                 }
//             }
//             else{
//                 System.out.print(curNode.data+" ");

//                 if (curNode.left!=null) {
//                     q.add(curNode.left);
//                 }
//                 if (curNode.right!=null) {
//                     q.add(curNode.right);
//                 }
//             }
//         } 
//     }

//     public static int countNodes(Node root){

//         if (root==null) {
//             return 0;
//         }
//         int leftNodes = countNodes(root.left);
//         int rightNodes = countNodes(root.right);
//         return leftNodes+rightNodes+1;
//     }

//     //count sum of nodes data
//     public static int countSum(Node root){

//         if (root==null) {
//             return 0;
//         }
//         int leftSum = countSum(root.left);
//         int rightSum = countSum(root.right);
//         return leftSum+rightSum+root.data;
//     }

//     public static int height(Node root){

//         if (root==null) {
//             return 0;
//         }
//         int leftHeight = height(root.left);
//         int rightHeight = height(root.right);

//         int myHeight = Math.max(leftHeight, rightHeight)+1;
//         return myHeight;
//     }

//     public static int diameter(Node root){

//         if (root==null) {
//             return 0;
//         }
//         int dia1 = diameter(root.left);
//         int dia2 = diameter(root.right);
//         int dia3 = height(root.left)+height(root.right)+1;

//         return Math.max( Math.max(dia1, dia2), dia3);
//     }

//     //Second method to calculate diameter for better time complaxity ->

//     static class TreeInfo {

//         int dia;
//         int ht;
//         TreeInfo(int dia,int ht){
//             this.dia=dia;
//             this.ht=ht;
//         }
//     }

//     public static TreeInfo diameter2(Node root){

//         if (root==null) {
//             return new TreeInfo(0, 0);
//         }
        
//         TreeInfo left = diameter2(root.left);
//         TreeInfo right = diameter2(root.right);

//         int myHeight = Math.max(left.ht, right.ht)+1;

//         int dia1 = left.dia;
//         int dia2 = right.dia;
//         int dia3 = left.ht+right.ht+1;

//         int myDia = Math.max(Math.max(dia1, dia2), dia3);
        
//         TreeInfo myInfo = new TreeInfo(myDia, myHeight);
//         return myInfo;
//     }



    

//     public static void main(String[] args) {
//         int nodes[] = {2,3,5,-1,-1,7,-1,-1,9,-1,6,-1,-1};

//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildtree(nodes);

//         System.out.println(root.data);
//         preOrder(root);
//         inOrder(root);
//         postOrder(root);
//         levelOrder(root);
//         System.out.println(countNodes(root));
//         System.out.println(countSum(root));
//         System.err.println(height(root));
//         System.out.println(diameter(root));
//         System.out.println(diameter2(root).dia);
//     }
// }