package objectOriented;
 class Person{
     String name;
     int age;
     void input(String n  , int a){
         name = n;
         age = a;
     }
     void output(){
         System.out.println("name = " + name);
         System.out.println("age =  " + age);
     }
 }
public class Oops {
    /* predefined data types
    * int ,float, double, String, Boolean
    * object have state / properties  also have Behaviors / Method
    * classes :-->  A class can be defined as blueprint from which you can create an  individual object. Class doesn't consume any space
    * */
//     String name;
//     int age;
    public static void main(String[] args) {
//        Oops obj = new Oops();
//        obj.name = "Arko";
//        obj.age = 29;
//        System.out.println("name =  " + obj.name);
//        System.out.println("age =  " + obj.age);
        Person person1 = new Person();
        person1.input("arkopravo" , 23);
        person1.output();
    }
}
