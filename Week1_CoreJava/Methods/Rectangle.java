package Methods;

import java.util.Scanner;

public class Rectangle {
    public static int calculateArea(int len , int width){
        int area = len * width;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculateArea(a,b));
    }
}
