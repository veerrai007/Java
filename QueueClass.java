//Queue using Array..........................

// public class QueueClass {

//     static class Queue{
//         static int arr[];
//         static int size;
//         static int rear=-1;

//         Queue(int n){
//             arr=new int[n];
//             this.size=n;

//         }


//         public static Boolean isEmpty(){
//             return rear==-1;
//         }

//         public static void add(int data){
//             if (rear==size-1) {
//                 System.out.println("Queue is full");
//                 return;
//             }
//             rear++;
//             arr[rear]=data;
//         }

//         public static int remove(){
//             if (isEmpty()) {
//                 System.out.println("Array is empty");
//                 return -1;
//             }
//             int front = arr[0];
//             for(int i=0;i<rear;i++){
//                 arr[i]=arr[i+1];
//             }
//             rear--;
//             return front;
//         }

//         public static int peek(){
//             if (isEmpty()) {
//                 System.out.println("Array is Empty");
//                 return-1;
//             }
//             return arr[0];
//         }
//     }


//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
        
//     }
    
// }



//Circular Queue....................................................

// public class QueueClass {

//     static class Queue{
//         static int arr[];
//         static int size;
//         static int rear=-1;
//         static int front=-1;

//         Queue(int n){
//             arr=new int[n];
//             this.size=n;
//         }


//         public static Boolean isEmpty(){
//             return rear==-1 && front==-1;
//         }

//         public static Boolean isFUll(){
//             return (rear+1)%size==front;
//         }

//         public static void add(int data){
//             if (isFUll()) {
//                 System.out.println("Queue is full");
//                 return;
//             }
//                 //first element add
//             if (front==-1) {
//                 front=0;
//             }
//             rear=(rear+1)%size;
//             arr[rear]=data;
//         }

//         public static int remove(){
//             if (isEmpty()) {
//                 System.out.println("Array is empty");
//                 return -1;
//             }
//             int result = arr[front];
//                 //in case of Single element
//             if (rear==front) {
//                 rear=front=-1;
//             }
//             else{
//                 front=(front+1)%size;
//             }
//             rear--;
//             return result;
//         }

//         public static int peek(){
//             if (isEmpty()) {
//                 System.out.println("Array is Empty");
//                 return-1;
//             }
//             return arr[front];
//         }
//     }


//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         System.out.println(q.remove());
//         q.add(6);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
        
//     }
    
// }


//Queue Using Linkedlist.....................................................

// public class QueueClass{

//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             next=null;
//         }
//     }

//     static class Queue{
//         static Node head = null;
//         static Node tail = null;

//         public static Boolean isEmpty(){
//             return head==null && tail==null;
//         }
//             //Add element
//         public static void add(int data){
//             Node newNode = new Node(data);

//             //First element add
//             if(tail==null){
//                 tail=head=newNode;
//             }

//             tail.next=newNode;
//             tail=newNode;
//         }
//             //remove element
//         public static int remove(){
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int front = head.data;
//                 //for single element
//             if (head==tail) {
//                 tail=null;
//             }
//             head=head.next;
//             return front;
//         }

//         public static int peek(){
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             return head.data;
//         }
        
//     }
//     public static void main(String[] args) {

//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
        
//     }
// }


//............................................................

// import java.util.*;

// public class QueueClass {

//     public static void main(String[] args) {
//             //using Linkdelist
//         Queue <Integer> q = new LinkedList<>();
//             //using Array
//         Queue <Integer> q2 = new ArrayDeque<>();
        
            
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.err.println(q.peek());
//             q.remove();
//         }
//     }
// }


//Queue using two stacks................................................
// import java.util.*;

// public class QueueClass {

//     static class Queue{
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         public static Boolean isEmpty(){
//             return s1.isEmpty();
//         }

//         public static void add(int data){
//             while (!s1.isEmpty()) {
//                 s2.push(s1.pop());
//             }

//             s1.push(data);

//             while (!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }
//         }

//         public static int remove(){
//             if (s1.isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return-1;
//             }
//             return s1.pop();
//         }

//         public static int peek(){
//             if (s1.isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return-1;
//             }
//             return s1.peek();
//         }

//     }

//     public static void main(String[] args){

//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }
// }
