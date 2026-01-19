package Methods;

public class Cheker {
    public  static  int maximumNum(int a, int b , int c){
        if((a<b) && (b>c)){
            System.out.println(b);
        } else if ((b<c) && (c>a)) {
            System.out.println(c);

        }
        else{
            System.out.println(a);
        }
        return 1;
    }

    public static void main(String[] args) {
         int a = 5;
         int b = 45;
         int c = 34;
        int res = (maximumNum(a,b,c));
    }
}
