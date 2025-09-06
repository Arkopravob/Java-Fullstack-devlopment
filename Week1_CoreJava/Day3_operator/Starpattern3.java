package Day3_operator;

public class Starpattern3 {
    public static void main(String[] args) {
        int n = 4;
        for (int line = 1 ; line <= n ;  line ++){
            for(int aster = 1 ;  aster < line ; aster++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
