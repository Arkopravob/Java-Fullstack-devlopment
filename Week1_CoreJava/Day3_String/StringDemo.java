package Day3_String;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("hi i am " + str);

        //length of string
        System.out.println(str.length());
        //return character at index
        System.out.println(str.charAt(2));
    }
}
