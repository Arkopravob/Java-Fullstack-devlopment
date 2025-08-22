package Day1_Variable;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("before swap numbers are a is : " + a + " and " +" b is : " + b);
        int c = a;
        a = b;
        b = c;

        System.out.println("after swap numbers are: " + " a is: " + a  + " and  b is: " + b);
    }
}
