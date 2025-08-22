package Methods;
import java.util.Scanner;
public class CountDivisor {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                long l = sc.nextLong();
                long r = sc.nextLong();
                long k = sc.nextLong();

                long count = (r / k) - ((l - 1) / k);
                System.out.println(count);
            }
        }
