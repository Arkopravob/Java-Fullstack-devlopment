package loops;

public class sum {
    public static void main(String[] args) {
        int sum = 0;
        int n = 123;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}