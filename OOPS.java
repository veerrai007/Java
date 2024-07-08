// class Pen{
    
//     String color;
//     String type;

//     public void printColorType(){
//         System.out.println("Color:"+ this.color + "  and  Type:" + this.type);
//     }

//     Pen(){
//         System.out.println("This is a non-parameterised Constructor");
//     }
// }

// class Student {

//     String name;
//     int age;

//     public void printInfo(){
//         System.out.println(name+" is "+age+" years old.");
//     }

//         //parameterized Constructor

//     Student(String name, int age){

//         this.name=name;
//         this.age=age;
//     }

//       // Copy Constructors: we copy the properties of s1

//     Student(Student s1){
//         this.name=s1.name;
//         this.age=s1.age;
//     }
// }


// public class OOPS {
//     public static void main(String[] args) {

//         Pen pen1 = new Pen();
//         pen1.color = "Red";
//         pen1.type = "Gel";

//         Student s1 = new Student("Veer",21);
//         Student s2 = new Student(s1);

//         pen1.printColorType();
//         // s1.printInfo();
//         s2.printInfo();
        
//     } 
// }



//Polymorphism : Same name of Functions but different parameters,return type or number of perameters......................

// class Student {

//     String name;
//     int age;

//     public void printInfo(String name){
//         System.out.println(name);
//     }

//     public void printInfo(int age){
//         System.out.println(age);
//     }

//     public void printInfo(String name, int age){
//         System.out.println(name+" "+age);
//     }
// }

// public class OOPS {
//     public static void main(String[] args) {

//         Student s1 = new Student();

//         s1.name = "Veer";
//         s1.age = 21;
        
//         s1.printInfo(s1.name);
//         s1.printInfo(s1.age);
//         s1.printInfo(s1.name,s1.age);
//     } 
// }



//Inheritance : when a class inherit the properties of other class......................

// Four Types : Single Inheritance, Multilevel, Hierarical, Hybrid......................


// class Color{
//     String color;

//     public void printColor(){

//         System.out.println(this.color);
//     }
// }

// class Triangle extends Color{

//     public void area(int l,int h){
//         System.out.println((l*h)/2);
//     }

// }

// class Equelatetriangle extends Triangle{

//     Equelatetriangle( String clr){
//         this.color=clr;
//     }
// }

// public class OOPS{ 
//     public static void main(String[] args) {

//         Triangle s1 = new Triangle();
//         s1.color = "Red";
//         Equelatetriangle e1 = new Equelatetriangle("Blue");
//         // e1.color = "blue";
//         s1.printColor();
//         e1.printColor();
//         e1.area(6, 2);
        
//     }
// }


//.........................Abstraction..................................

// abstract class Animal {

//     Animal(){
//         System.out.println("Creating Animals");
//     }

//     abstract void walk();

//     public void eat(){
//         System.out.println("it can eat");
//     };
// }

// class Horse extends Animal{
    
//     public void walk(){
//         System.out.println("walk on four legs");
//     }

// }

// public class OOPS{
//     public static void main(String[] args) {

//         Horse h1 = new Horse();
//         h1.eat();
//         Animal a1 = new Animal();      //Cannot creat an object of abstract classs
//         a1.eat();
//     }
// }



//.............................Interface Abstraction.......................

// interface Animal {

//     int eyes = 2;
//     public void walk();
// }

// interface Herbivore{

//     void eat();
// }

// class Horse implements Animal, Herbivore{

    
//     public void walk(){
//         System.out.println("walk on four legs");
//     }

//     public void eye(){
//         System.out.println(eyes);
//     }

// }

// public class OOPS{
//     public static void main(String[] args) {

//         Horse h1 = new Horse();
//         h1.walk();
//         h1.eye();
//     }
// }



//   Static keyword...........................................

// class Student {
//     static String school;

//     public static void changeSchool(String name){
//         school = name;
//     }
// }

// public class OOPS{
//     public static void main(String[] args) {

//         Student.school = "ABC";
//         Student s1 = new Student();
//         System.out.println(s1.school);
//         s1.changeSchool("xyz");
//         System.out.println(s1.school);
        

//     }
// }