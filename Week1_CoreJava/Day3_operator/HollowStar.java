package Day3_operator;

public class HollowStar {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        for(int i = 1 ;  i <= n ; i++){
            for(int j = 1 ;  j <= m ; j++){
                if(i == n || i == 1 || j== m || j == 1){
                    System.out.print("*");
                }
                else{
                    System.out.println(" ");
                }

                System.out.println();
            }
        }
    }
}
