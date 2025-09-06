package practice;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        int number2 = 340;

        if(number >= number2){
            System.out.println("its bigger");
        }
        else{
            System.out.println("oops ! entered number is smaller");
        }
    }
}
