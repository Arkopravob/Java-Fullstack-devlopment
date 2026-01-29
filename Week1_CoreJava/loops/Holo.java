package loops;

public class Holo {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) { // outer row increment
            for (int j = 1; j <= n - i; j++) { // inner column increment
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // inner column increment
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
