package objectOriented;
class Dog {
    int size;
    String breed;
    String name;

    void bark() {  //method creation
        System.out.println("rauf rauf!");
    }
}
public class DogTestDrive {   // this is a tester class
    public static void main(String[] args) {
        Dog d = new Dog(); // make dog as a object
        d.size = 4;
        d.breed = "white";
        d.name = "labrador";
        d.bark();

    }
}
