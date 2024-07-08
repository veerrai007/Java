//solid ractangle.............................................

// public class Patterns{
//     public static void main(String[] args) {
//         int n = 5;
//         int m = 10;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//Hollow ractangle............................................

// public class Patterns{
//     public static void main(String[] args){
//         int n = 5;
//         int m = 10;  
    
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if(i==1||i==n||j==1||j==m){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//         System.out.println();
//         }
//     }
// }


//half Pyramid.................................................

// public class Patterns{
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//inverted half pyramid........................................

// public class Patterns{
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//180` inverted half pyramid....................................

// public class Patterns{
//     public static void main(String[] args) {
//         int n = 5;
    
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//half pyramid with number....................................

// public class Patterns{
//     public static void main(String[] args) {
//         int n = 5;
    
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


//inverted half pyramid with number............................

// public class Patterns{
//     public static void main(String[] args) {
//         int n = 5;
    
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//................................................................

// public class Patterns{
//     public static void main(String[] args) {
//         int n = 5;
//         int number = 1;
    
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }

//...............................................................

// public class Patterns{
//     public static void main(String[] args) {
//         int n = 5;
    
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){

//                 int sum = i+j;

//                 if(sum%2==0){
//                     System.out.print("1"+" ");
//                 }
//                 else{
//                     System.out.print("0"+" ");
//                 }                
//             }
//             System.out.println();
//         }
//     }
// }


//butterfly pattren................................................

public class Patterns {
    public static void main(String[] args) {
        int n = 5;

        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");  
            }
            int space= 2 * (n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");  
            }
            int space= 2 * (n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//solid Rhombus.....................................................

// public class Patterns{
//     public static void main(String[] args) {
//         int n = 5;
    
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//Number pyramid....................................................

// public class Patterns{
//     public static void main(String[] args) {
//         int n = 5;
    
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//palindromic pattern................................................

// public class Patterns{
//     public static void main(String[] args) {
//         int n = 5;
    
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

//diamond pattern....................................................

// public class Patterns{
//     public static void main(String[] args) {
//         int n = 4;
    
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }            
//             System.out.println();
//         }
//         for(int i=n-1;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }            
//             System.out.println();
//         }
//     }
// }





