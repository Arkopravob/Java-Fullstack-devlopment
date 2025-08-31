package Day3_operator;

public class StarTringle {
    public static void main(String[] args) {
        int n = 5;
        for(int line  = 0 ; line <=n ;line++){
            for(int aster = 1 ; aster <= line ;aster++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
