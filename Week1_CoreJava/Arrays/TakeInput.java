package Arrays;

import java.util.Scanner;

public class TakeInput {
    public static int [][]takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows: ");
        int rows = sc.nextInt();
        System.out.println("enter the columns : ");
        int cols = sc.nextInt();

        int A[][] = new int[rows][cols];
        for(int i = 0 ; i <rows ; i++ ){
            for(int j = 0 ; j < cols ; j++){
                System.out.println("enter the element A[" + i + "][" +j +"]");
                A[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return A;
    }
    public static void printArray(int A[][]){
        int n = A.length;
        int m = A[0].length;
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j <m ; j++ ){
                System.out.print(A[i][j] + " " );
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
//        int A[][] = takeInput();
//        int n = A.length;
//        int m = A[0].length-1;


//        for(int i = 0 ; i <n; i++){
//            for(int j = 0  ; j <m ;j++){
//                System.out.print(A[i][j] + " ");
//            }
//            System.out.println();
//        }
        int Arr[][]= takeInput();
        printArray(Arr);

    }
}
