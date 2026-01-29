package Arrays;
/*
Problem Statement: Given an array of N integers, count the inversion of the array (using selection-sort).

* */
public class InversionFind {
    public static int getInversions(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++){
            int minIdx = i;
            for(int j = i + 1 ; i < n ; i++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            int temp  = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            count = minIdx - i ;
    }
        return count;
    }
    public static void main(String[] args) {
        //given array is-
        int []arr = {13,46,24,52,20,9};
        int n = arr.length;
        getInversions(arr , n);
    }

}
