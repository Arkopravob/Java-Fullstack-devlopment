package Day3_operator;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while( x > 0 ){
            System.out.println(x);
            x--;
        }
    }
}
