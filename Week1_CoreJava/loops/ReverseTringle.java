package loops;

public class ReverseTringle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) { // outer row decrement
            for (int j = 1; j <= i; j++) { // inner column increment
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
