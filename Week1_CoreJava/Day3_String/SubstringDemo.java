package Day3_String;

import java.util.Scanner;

public class SubstringDemo {
    public static String substring(int f , int l, String str){
       String str1 = str.substring(f,l);
        return str1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();


        String res = substring(start,end,s);
        System.out.println(res);
    }
}
