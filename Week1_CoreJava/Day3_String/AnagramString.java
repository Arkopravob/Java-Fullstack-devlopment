package Day3_String;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static boolean checkAnagram(String a , String b){
        if(a.length() != b.length()){
            return false;
        }
        char arrA[] = a.toCharArray();
        char arrB[] = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        int indexA = 0 ;
        int indexB = 0;
        int len = arrA.length;
        while(indexA< len && indexB <len){
            if(arrA[indexA] != arrB[indexB]){
                return false;
            }
            indexA++;
            indexB++;
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean result = checkAnagram(a,b);
        System.out.println(result);
    }
}
