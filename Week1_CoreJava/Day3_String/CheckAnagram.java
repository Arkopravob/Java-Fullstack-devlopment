package Day3_String;
import java.util.Scanner;
public class CheckAnagram {
    public static boolean isAnagram(String a , String b){
        if(a.length()!= b.length()){
            return false;
        }
        int len = a.length();
        int freq[] = new int[26];
        int indexA = 0 ;
        int indexB = 0;
        while (indexA < len && indexB < len){
            char charA = a.charAt(indexA);
            int freqIndexA = charA - 97;
            freq[freqIndexA] +=1;
            char charB = b.charAt(indexB);
            int freqIndexB = charB -97;
            freq[freqIndexB] -=1;
            indexA++;
            indexB++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }
}
