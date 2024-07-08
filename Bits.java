// import java.util.*;


//Get Bit : use to check whether the bit of a number was zero or one on the given position. n=0101=5

// public class Bits{
//     public static void main(String[] args) {
//         int n = 5;          
//         int pos = 2;
//         int bitMask = 1<<pos;

//         if((bitMask & n) == 0){
//             System.out.println("bit is zero");
//         }
//         else{
//             System.out.println("bit is one");
//         }
//     }
// }



//Set Bit : set one to the given position in a number and get a new number. n=0101=5

// public class Bits{
//     public static void main(String[] args) {
//         int n = 5;          
//         int pos = 1;
//         int bitMask = 1<<pos;

//         int newnumber  = bitMask | n;
 
//         System.out.println(newnumber);
//     }
// }



//Clear Bit : set zero on the given position in a number and get a new number. n=0101=5

// public class Bits{

//     public static void main(String[] args) {
//         int n = 5;          
//         int pos = 2;
//         int bitMask = 1<<pos;
//         int notBitMask = ~(bitMask);

//         int newnumber  =notBitMask & n;
//         System.out.println(newnumber);
//     }
// }



//Update Bit : set one or zero on the given position.

// import java.util.Scanner;

// public class Bits{

//     public static void main(String[] args) {

//         Scanner sc  = new Scanner(System.in);
//         int opr = sc.nextInt();

//         int n = 5;          
//         int pos = 2;
//         int bitMask = 1<<pos;
//         if(opr == 1){
//             int newnumber  = bitMask | n;
//                 System.out.println(newnumber);
//         }

//         else{
//             int notBitMask = ~(bitMask);
//             int newnumber  =notBitMask & n;
//             System.out.println(newnumber);
//         }
//     }
// }

