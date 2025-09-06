package Arrays;

public class Array_2d {
    public static void main(String[] args) {
//        int [][] arr = new int [3][4] ;
        int arr[][] = {{3,8,9,0},{6,3,9,2},{5,9,0,1}};
        for(int i =  0 ;  i < arr.length ; i++){
            for( int j = 0 ;  j < arr[0].length ; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}
