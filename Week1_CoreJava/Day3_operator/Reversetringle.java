package Day3_operator;

public class Reversetringle {
    public static void main(String[] args) {
        int n = 5;
        for(int line = 5 ; line >=1 ;line--){
            for(int aster = 1 ; aster <=line ; aster++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
