package loop;

import java.util.Scanner;
//infinity loop example
public class whileLoop_example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n !=0){
            System.out.println("now coding time");
            n++;
        }
    }
}
