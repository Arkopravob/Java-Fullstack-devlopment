package Day3_operator;

import java.util.Scanner;

public class SwtichDemo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
