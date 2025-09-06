package practice;

import java.util.Scanner;

public class Concept2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int u = sc.nextInt();
        int eq = ((v*v) - (u*u));
        double res = eq/295;
        System.out.println(res);

    }

}
