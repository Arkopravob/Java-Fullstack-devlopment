class  Pokemon{
    String name;
    int level ;

    //constructor
    Pokemon(){
        level = 1;
    }

    void attack(){
        System.out.println(name + "woo attack");
    }
}

public class Oops1 {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.name = "pikachu";
        p1.level = 10;


        Pokemon p2 = new Pokemon();
        p2.name = "Evee";
        p2.level = 20;

        p2.attack();
    }
}
