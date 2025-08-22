package Day3_String;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev = "";
        for (int i = s.length()-1; i >=0; i--) {
           rev = rev + s.charAt(i);
        }
        if((s.toLowerCase().equals(rev.toLowerCase()))||(s.toUpperCase().equals(rev.toUpperCase()))){
            System.out.println("yes");
        }
        else {
            System.out.println("Not");
        }
    }
}

