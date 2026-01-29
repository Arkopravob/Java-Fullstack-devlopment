class User {
    int age;
    String name;
    int salary;

    User(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
}

public class MemoryDemo {
    public static void main(String[] args) {
        User u1 = new User(25, "John", 5000);
        User u2 = new User(25, "John", 5000);

        System.out.println(u1 == u2);
    }
}
