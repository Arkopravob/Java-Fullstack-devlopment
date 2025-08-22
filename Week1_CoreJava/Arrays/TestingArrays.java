package Arrays;

import java.util.Scanner;

public class TestingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        //indexing
//        System.out.println(arr[1]);
        //input
        for(int i = 0; i < arr.length ; i++){
            int x =sc.nextInt();
            arr[i] = x;
        }
        for(int i = 0 ; i < arr.length ;i++){
            //double print
            System.out.print(2 * arr[i] + " ");
        }
    }
}
