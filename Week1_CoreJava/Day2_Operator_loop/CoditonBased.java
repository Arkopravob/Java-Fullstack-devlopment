package Day2_Operator_loop;

import java.util.Scanner;

public class CoditonBased {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 == num2){
            int sum = num1 + num2 ;
            System.out.println(sum);
        }
        else{
           int sum = num1 + num2;
           int total = sum *2;
            System.out.println(total);

        }
    }
}
