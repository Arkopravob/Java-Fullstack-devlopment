package functionLearning;

public class FunctionDemo2 {
    public static  int findMax(int x, int y){
        if(x>y){
            return x;

        }
        else{
            return y;
        }
    }
    public static void main(String[] args) {
        int a = 34;
        int b = 36;
        int res = findMax(a,b);
        System.out.println(res);
    }
}
