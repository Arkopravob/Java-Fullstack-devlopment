package Day3_operator;

import java.util.Scanner;

public class TernaryDemo {
    public static void main(String[] args) {
        System.out.println("enter your age:");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        String status = age >= 19 ? "going club":"not allowed";
        System.out.println(status);
    }
}
