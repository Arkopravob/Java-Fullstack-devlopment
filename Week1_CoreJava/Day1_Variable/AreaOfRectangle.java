package Day1_Variable;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double area , length , bredth;
        length =sc.nextDouble();
        bredth = sc.nextDouble();
        area = length * bredth;
        System.out.println(area);
    }
}
