//print 5 to 1.........................................................

// public class recursion{

//     public static void printnum(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         printnum(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printnum(n);
//     }
// }


//print sum of n natural numbers.........................................

// public class recursion{

//     public static void print-sum(int i,int n,int sum){

//         if(i==n){
//             sum+=i;
//             System.out.println(sum);
//             return;
//         }

//         sum+=i;
//         print-sum(i+1,n,sum);
//     }
//     public static void main(String[] args) {

//         print-sum(1,5,0);  
//     }
// }


//factorial of n.........................................................

// public class recursion{

//     public static void fact(int i,int n,int sum){

//         if(i==n){
//             sum*=i;
//             System.out.println(sum);
//             return;
//         }

//         sum*=i;
//         fact(i+1,n,sum);
//     }
//     public static void main(String[] args) {

//         fact(1,5,1);  
//     }
// }

//.......................OR..........................

// public class recursion{

//     public static int fact(int n){

//         if(n==1 || n==0){
//             return 1;
//         }

//         int factorial_nm1 = fact(n-1);
//         int factorial_n = n * factorial_nm1;
//         return factorial_n;


//     }
//     public static void main(String[] args) {
//         int n = 5;
//         int ans = fact(n);
//         System.out.println(ans);
//     }
// }


//Fibbonacci series...............................................

// public class recursion{

//     public static void printfib(int a,int b, int n){

//         if(n==0){
//             return;
//         }

//         int c = a+b;
//         System.out.println(c);
//         printfib(b, c, n-1);
//     }
        

//     public static void main(String[] args) {

//         int a = 0;
//         int b = 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 7;
//         printfib(a, b, n-2);

//     }
// }


//Calculate X to the power N..................................

// public class recursion {

//     public static int powr(int x,int n){
//         if(x==0){
//             return 0;
//         }
//         if(n==0){
//             return 1;
//         }

//         int xPowernm1 = powr(x, n-1);
//         int power_of_x = x * xPowernm1;
//         return power_of_x;
//     }
//     public static void main(String[] args){

//         int x = 5;
//         int n = 3;
//         int ans = powr(x, n);
//         System.out.println(ans);

//     }
// }


//...................OR..........................

// public class recursion {

//     public static int powr(int x,int n){
//         if(x==0){
//             return 0;
//         }
//         if(n==0){
//             return 1;
//         }

//         if(x%2==0){
//             return powr(x, n/2)*powr(x, n/2);
//         }

//         else{
//             return powr(x, n/2)*powr(x, n/2) * x;
//         }
//     }
//     public static void main(String[] args){

//         int x = 5;
//         int n = 3;
//         int ans = powr(x, n);
//         System.out.println(ans);

//     }
// }


//Reverse a String....................................

// public class recursion {

//     public static void printRev(String str,int idx){

//         if(idx==0){
//             System.out.print(str.charAt(idx));
//             return;
//         }

//         System.out.print(str.charAt(idx));
//         printRev(str, idx-1);

//     }

//     public static void main(String[] args) {

//         String str = "abcd";
//         printRev(str,str.length()-1);
        
//     }
// }



//Find index of first and last accurance of an element..................

// public class recursion{

//     public static int first = -1;
//     public static int last = -1;

//     public static void findOccr(String str,int idx,char element){

//         if(idx==str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }

//         char currChar = str.charAt(idx);

//         if(currChar==element){
//             if(first==-1){
//                 first=idx;
//             }
//             else{
//                 last=idx;
//             }
//         }

//         findOccr(str, idx+1, element);


//     }
//     public static void main(String[] args) {

//         String str = "dahgajyrakann";
//         findOccr(str, 0, 'a');
        
//     }
// }



//Check that an array is strictly increasing or not...........................

// public class recursion{

    
//     public static boolean isSort(int arr[],int idx){
        
//         if(idx==arr.length-1){
//             return true;
//         }


//         if(arr[idx]<arr[idx+1]){
//             return isSort(arr, idx+1);
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args){

//         int arr[] = {4,6,6,7,9};
//         System.out.println(isSort(arr,0));
//     }
// }



//Move all X of string at last...................................

// public class recursion{

//     public static void moveAllx(String str, int count,int idx,String newString){

//         if(idx==str.length()-1){
//             for(int i=0;i<count;i++){
//                 newString+='x';
//             }
//             System.out.println(newString);
//             return;
//         }

//         char currChar = str.charAt(idx);

//         if(currChar=='x'){
//             count+=1;
//             moveAllx(str, count, idx+1, newString);
//         }
//         else{
//             newString+=currChar;
//             moveAllx(str, count, idx+1, newString);
//         }

//     }
//     public static void main(String[] args){

//         String str = "axfgxnxjk";
//         moveAllx(str, 0, 0, "");


//     }
// }



//Print permutation of a String..............................

// public class recursion {


//     public static void printPermutation(String str, int idx, String perm) {
//         if(str.length() == 0) {
//             System.out.println(perm);
//             return;
//         }
       
//         for(int i=0; i<str.length(); i++) {
//             char currChar = str.charAt(i);
//             String newStr = str.substring(0, i) + str.substring(i+1);
//             printPermutation(newStr, idx+1, perm+currChar);
//         }
//     }
//     public static void main(String args[]) {
//         String str = "abc";
//         printPermutation(str, 0, "");
//     }
//  }
