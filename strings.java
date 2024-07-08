// public class strings {
//     public static void main(String[] args) {
//         String name = "Veer";
//         String lastname = "Singh";
//         String fullname = name +" "+ lastname;
//         System.out.println(name.length());
//         System.out.println(fullname);
        
//         for (int i=0;i<fullname.length();i++){
//             System.out.println(fullname.charAt(i));
//         }

//         String sentance = "I am a Student";
//         String sub = sentance.substring(2,sentance.length());
//         System.out.println(sub);

//     } 
// }


//String Builder...................................................

// public class strings {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Veer");
//         System.out.println(sb.charAt(1));

//         sb.setCharAt(3,'l');
//         System.out.println(sb);

//         sb.insert(0,'S');
//         System.out.println(sb);

//         sb.delete(0, 1);
//         System.out.println(sb);

//         sb.append("Singh");
//         System.out.println(sb);

//     } 
// }


//Reverse a string.................................................

// public class strings {
//    public static void main(String args[]) {
//      StringBuilder sb = new StringBuilder("HelloWorld");
    
//      for(int i=0; i<sb.length()/2; i++) {
//        int front = i;
//        int back = sb.length() - i - 1;


//        char frontChar = sb.charAt(front);
//        char backChar = sb.charAt(back);


//        sb.setCharAt(front, backChar);
//        sb.setCharAt(back, frontChar);
//      }


//      System.out.println(sb);
//    }
// }


