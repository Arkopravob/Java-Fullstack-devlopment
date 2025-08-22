package Methods;

import java.util.Scanner;

public class FindProduct {

    public static void main(String[] args) {
        final int MOD = 1000000007; // Modulo value

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Read size of array

        long product = 1; // Use long to avoid overflow

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            product = (product * num) % MOD;
        }

        System.out.println(product);


    }
}


