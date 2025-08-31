package Day3_operator;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         if(n >= 100){
             System.out.println("BigNumber");
         }
         else{
             System.out.println("Number");
         }
    }
}
