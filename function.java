// import java.util.*;

// public class function {

//     public static void printName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         printName(name);   
//     }
// }


//......................................................


// public class function {

//     public static void addnumber(int a,int b ){
//         System.out.println(a+b);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         addnumber(a,b);   
//     }
    
// }

//......................................................Or

// public class function {

//     public static int addnumber(int a,int b ){
//         int sum  = a+b;
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum=addnumber(a,b);  
//         System.out.println(sum);
         
//     }
    
// }


//............................Factorial of n.........................

// public class function {

//     public static void fact(int n){
//         int Factorial  = 1;
//         for(int i=n;i>=1;i--){
//             Factorial=Factorial*i;
//         }
//         System.out.println(Factorial);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         fact(n);  
//     } 
// }


//avrage of three numbers...................................................

// public class function {

//     public static void avg(int a, int b,int c){
//         int avrage = (a+b+c)/3;
//         System.out.println(avrage);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         avg(a,b,c);
//     }
// }


//sum of odd numbers 1 to n .................................................

// public class function {

//     public static void sum(int n){
//         int sum = 0;
//         for(int i=1;i<=n;i++){
//             if(i%2!=0){
//                 sum=sum+i;
//             }
//         }
//         System.out.println(sum);
//     }

//     public static void main(String[] args) {
//         Scanner sc  = new Scanner(System.in);
//         int n =  sc.nextInt();
//         sum(n);

//     }
// }


//..greater number of two numbers.........................................

// public class function {

//     public static void greater(int a,int b){
//         if(a>b){
//             System.out.println(a +" is greater then "+ b);
//         }

//         else{
//             System.out.println(b+" is greater then "+ a );
//         }
//     } 

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a  = sc.nextInt();
//         int b = sc.nextInt();
//         greater(a,b);
//     }
// }


//find a to the power x..........................................

// public class function {

//     public static int power(int a,int x){
//         int pow = 1;
//        for (int i=1;i<=x;i++){
//         pow = pow * a;
//     }
//     return pow;
//     }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a  = sc.nextInt();
//         int x = sc.nextInt();
//         System.out.println(power(a,x));
//     }
// }


//.........................................................................

// public class function {
//    public static void main(String args[]) {
//        int positive = 0, negative = 0, zeros = 0;
//        System.out.println("Press 1 to continue & 0 to stop");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();


//        while(input == 1) {
//            System.out.println("Enter your number : ");
//            int number = sc.nextInt();
//            if(number > 0) {
//                positive++;
//            } else if(number < 0) {
//                negative++;
//            } else {
//                zeros++;
//            }


//            System.out.println("Press 1 to continue & 0 to stop");
//            input = sc.nextInt();
//        }


//        System.out.println("Positives : "+ positive);
//        System.out.println("Negatives : "+ negative);
//        System.out.println("Zeros : "+ zeros);
//    }   
// }



 
