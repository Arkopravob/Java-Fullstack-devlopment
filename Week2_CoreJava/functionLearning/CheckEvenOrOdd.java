package functionLearning;

public class CheckEvenOrOdd {
    public static int numberChecker(int n){
        if(n % 2 == 0){
            System.out.println("its even");
        }else {
            System.out.println("its odd");
        }
        return n;
    }
    public static void main(String[] args) {
        numberChecker(6);
    }
}
