package Day1_Variable;

import java.util.Scanner;

public class SumOfeven_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        sum = n+m;
        if(sum % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
                 }
}




