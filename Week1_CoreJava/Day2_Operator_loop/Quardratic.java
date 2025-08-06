package Day2_Operator_loop;

import java.util.Scanner;

public class Quardratic {
//    Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.
//    Implement a program to solve a quadratic equation.
//
//    Find the discriminant value using the formula given below.

//            discriminant = b2 - 4ac
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = (b*b) - (4*(a*c));
    if(d == 0){
        double x = -b / (2 * a);
        System.out.println("the root is :" +x);
    }
    else if(d > 0){
       double x1 = (-b + Math.sqrt(d)) / (2*a);
        double x2 = (-b - Math.sqrt(d)) / (2*a);
        System.out.println("the sqrt of :" + x1);
        System.out.println("the sqrt of :" + x2);
    }
    else{
        System.out.println("The equation has no real root");
    }
}
}
