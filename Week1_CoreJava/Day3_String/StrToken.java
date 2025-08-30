package Day3_String;
import java.util.StringTokenizer;
public class StrToken {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("hello World"," ");
        while(st.hasMoreTokens()){

            System.out.println(st.nextToken());
        }
    }
}
