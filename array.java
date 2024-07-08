// import java.util.*;

// public class array {
//     public static void main(String[] args) {
//         int[] marks = new int[5];
//         marks[0]  = 4;
//         marks[1]  = 6;
//         marks[2]  = 9;
//         for(int i=0;i<=2;i++){
//             System.out.println(marks[i]);
//         }
//     }   
// }


//second syntax of array.................................


// public class array {
//     public static void main(String[] args) {
//         int marks[] = {4,6,9,11,55,8};
//         for(int i=0;i<=marks.length;i++){
//             System.out.println(marks[i]);
//         }
//     }   
// }


//...take size and values from user...............................


// public class array {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();

//         int[] marks = new int[size];

//         for(int i=0;i<size;i++){
//             marks[i]=sc.nextInt();
//         }

//         for(int i=0;i<size;i++){
//             System.out.println(marks[i]);
//         }
//     }   
// }



//find x number in array.........................................

// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter x");
//         int x = sc.nextInt();

//         int marks[] = {4,6,9,11,55,8};
//         for(int i=0;i<=marks.length;i++){
//             if(marks[i]==x){
//                 System.out.println("x find at index :"+i);
//             }
//         }
//     }   
// }


//........2D Arrays..............................................

// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows  = sc.nextInt();
//         int colm  = sc.nextInt();

//         int[][] numbers = new int[rows][colm];

//         for (int i=0;i<rows;i++){
//             for(int j=0;j<colm;j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }

//         for (int i=0;i<rows;i++){
//             for(int j=0;j<colm;j++){
//                 System.out.print(numbers[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//................................................................

// public class array {
    
//     public static int[] twoNum(int arr[], int target){

//         int[] newArr = new int[2];

//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]+arr[i+1]==target){
//                 newArr[0]=arr[i];
//                 newArr[1]=arr[i+1];
//             }
//         }
//         return newArr;
//     }
    
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         int[] result = twoNum(arr, 7);
//         for(int i=0;i<result.length;i++){
//             System.out.println(result[i]);
//         }
//     }
// }