package practice;

import java.util.Scanner;

class Calculator{
    static double findAverage(int num1 , int num2 , int num3){
         double average = ((num1 +num2 +num3)/3);
         return Math.round(average * 100.0) / 100.0;
        }
    }
public class Tester {
    public static void main(String[] args) {
         Calculator calc = new Calculator();
         double result = calc.findAverage(11,20,18);
        System.out.println(result);

    }
}
