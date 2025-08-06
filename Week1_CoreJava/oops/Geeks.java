package oops;
class Car{
    String model;
    int year;

    // Constructor to initialize the Car object
    Car(String model, int year){
        this.model = model;
        this.year = year;

    }
    void display(){
        System.out.println(model + " " + year);
    }
}
public class Geeks {
    public static void main(String[] args) {
        Car myCar = new Car("Bmw",2024);
        myCar.display();
    }
}
