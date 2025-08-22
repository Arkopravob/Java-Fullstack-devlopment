package Arrays;

public class MultiplyEvenOdd {
    public static void main(String[] args) {
        int arr[] = {1,20,10,15,11,9,8};
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if( i % 2 == 1){
                arr[i] *= 2;
            }
            else {
                arr[i] += 10;
            }
            System.out.print(arr[i] + " ");
        }

    }
}
