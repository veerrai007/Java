// class Linklist {

//     Node head;
//     private int size;

//     Linklist(){
//         this.size=0;
//     }

//     class Node{
//         String data;
//         Node next;

//         Node(String data){
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }

//     public void addFirst(String data){
//         Node newNode = new Node(data);
//             if(head==null){
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//     }

//     public void addLast(String data){
//         Node newNode = new Node(data);
//             if(head==null){
//                 head = newNode;
//                 return;
//             }
//             Node currNode = head;
//             while (currNode.next!=null) {
//                 currNode=currNode.next;                
//             }
//             currNode.next = newNode;
//     }

//     public void printList(){
//         if(head==null){
//             System.out.println("List is empty");
//             return;
//         }
//         Node currNode = head;
//         while (currNode!=null) {
//             System.out.print(currNode.data + "->");
//             currNode=currNode.next;                
//         }
//         System.out.println("Null");
//     }

//     public void deleFirst(){
//         if(head==null){
//             System.out.println("List is empty");
//             return;
//         }
//         size--;
//         head=head.next;
//     }

//     public void deleLast(){
//         if(head==null){
//             System.out.println("List is empty");
//             return;
//         } 
//         size--; 
//         if(head.next==null){
//             head=null;
//             return;
//         }
//         Node secondLast = head;
//         Node lastNode = head.next;
//         while (lastNode.next!=null) {
//             lastNode=lastNode.next;
//             secondLast=secondLast.next;
//         }
//         secondLast.next=null;
//     }

//     public int getSize(){
//         return size;
//     }

//     public void reverseItrate(){
//         if(head==null || head.next==null){
//             return;
//         }
//         Node prevNode = head;
//         Node currNode = head.next;
//         while (currNode!=null) {
//             Node nextNode = currNode.next;
//             currNode.next=prevNode;

//             //update vlaues
//             prevNode=currNode;
//             currNode=nextNode;   
//         }
//         head.next=null;
//         head=prevNode;
//     }

//     public Node reverseRecursive(Node head){
//         if(head==null || head.next==null){
//             return head;
//         }

//         Node newHead = reverseRecursive(head.next);
//         head.next.next = head;
//         head.next=null;

//         return newHead;
//     }


//     public static void main(String[] args) {

//         Linklist list = new Linklist();
//         list.addFirst("is");
//         list.addFirst("This");
//         list.printList();
//         list.addLast("a");
//         list.addLast("list");
//         list.printList();  
//         list.deleFirst();
//         list.printList();  
//         list.deleLast();
//         list.printList();  
//         System.out.println(list.getSize());

//         list.addFirst("This");
//         list.addLast("list");
//         list.reverseItrate();
//         list.printList();

//         list.head = list.reverseRecursive(list.head);
//         list.printList();
//     }
// }



//java inbuild package for linkedlist.................................................

// import java.util.LinkedList;

// public class Linklist {

//     public static void main(String[] args) {

//         LinkedList<String> list = new LinkedList<>();
//         list.addFirst("this");
//         list.addLast("is");
//         System.out.println(list);
//         list.addLast("a");
//         list.add("list");
//         System.out.println(list);
//         System.out.println(list.size());
//         list.remove();
//         list.remove(2);
//         System.out.println(list);
        
//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i)+" -> ");
//         }
//     }
// }



//Remove nth from end of list........................................................

// class Linklist {

//     Node head;

//     class Node{
//         String data;
//         Node next;

//         Node(String data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void addFirst(String data){
//         Node newNode = new Node(data);
//             if(head==null){
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//     }

//     public void printList(){
//         if(head==null){
//             System.out.println("List is empty");
//             return;
//         }
//         Node currNode = head;
//         while (currNode!=null) {
//             System.out.print(currNode.data + "->");
//             currNode=currNode.next;                
//         }
//         System.out.println("Null");
//     }



// public Node removeNthFromEnd(Node head,int n){

//     if(head.next==null){
//         return null;
//     }

//     int size = 0 ;
//     Node curr = head;
//     while (curr!=null) {
//         curr=curr.next;
//         size++;
//     }

//     if(n==size){
//         return head.next;
//     }

//     int idxToSearch = size-n;
//     Node prev = head;
//     int i = 1;
//     while (i<idxToSearch) {
//         prev=prev.next;
//         i++;
//     }
//     prev.next = prev.next.next;
//     return head;
// }

//     public static void main(String[] args) {
//         Linklist list = new Linklist();
//         list.addFirst("5");
//         list.addFirst("4");
//         list.addFirst("3");
//         list.addFirst("2");
//         list.addFirst("1");
//         list.removeNthFromEnd(list.head, 2);
//         list.printList();  
//     }
// }


//List is Palindrome or not.....................................................

// class pratice {

//     Node head;

//     class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }

//     public void addFirst(int data){
//         Node newNode = new Node(data);

//         if(head==null){
//             head=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }

//     public void printList(){
//         if (head==null) {
//             System.out.println("List is empty");
//             return;
//         }

//         Node currNode = head;
//         while (currNode!=null) {
//             System.out.print(currNode.data + "->");
//             currNode=currNode.next;
//         }
//         System.out.println("Null");
//     }
//         //Palindrome .................................................
//     public Node findMiddle(Node head){
//         Node slow = head;
//         Node fast = head;
//         while (fast.next!=null && fast.next.next!=null) {
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
//     }

//     public Node revrseList(Node head){
//         Node prev = null;
//         Node curr = head;
//         while (curr!=null) {
//             Node next = curr.next;
//             curr.next = prev;

//             prev=curr;
//             curr=next;
//         }

//         return prev;
//     }


//     public boolean isPalindrome(Node head){
//         if (head==null || head.next==null) {
//             return true;
//         }

//         Node middle = findMiddle(head);
//         Node secondHead = revrseList(middle.next);

//         Node firstHead = head;
//         while (secondHead!=null) {
//             if (firstHead.data!=secondHead.data) {
//                 return false;
//             }
//             firstHead=firstHead.next;
//             secondHead=secondHead.next;
//         }
//         return true;
//     }
//     public static void main(String[] args) {

//         pratice list = new pratice();
//         list.addFirst(3);
//         list.addFirst(2);
//         list.addFirst(1);
//         list.addFirst(2);
//         list.addFirst(2);
//         list.addFirst(3);
//         list.printList();
//         System.out.println(list.isPalindrome(list.head));


//     }
// }



//Detect cycle in List...................................

// public class Linklist {

//     public boolean hasCycle(Node head){
//         if (head==null) {
//             return false;
//         }

//         Node hare = head;
//         Node turtle = head;
//         while (hare!=null && hare.next!=null) {
//             turtle=turtle.next;
//             hare=hare.next.next;

//             if (hare==turtle) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
        
//     }
// }