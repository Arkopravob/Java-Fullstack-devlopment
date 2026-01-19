package variable_datatype_demo;

import java.util.Scanner;

/**
 * This class implements a simple program that
 * will compute the amount of interest that is
 * earned on $17,000 invested at an interest
 * rate of 0.07 for one year. The interest and
 * the value of the investment after one year are
 * printed to standard output.
 * */

public class Interest {
    public static void main(String[] args) {

        //taking input from users
        Scanner sc  = new Scanner(System.in);
        int cap = sc.nextInt();
        float interest = 0.07f;
        int time = 1;
        double return_interest  = cap*(1+ interest * time);
        double amount =  cap + return_interest;
        System.out.println("the value he will earned after one year is: " + amount);
    }
}
