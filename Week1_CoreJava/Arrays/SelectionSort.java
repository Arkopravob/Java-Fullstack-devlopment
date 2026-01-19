package Arrays;

public class SelectionSort {
    public static void findSmalest(int []arr,int n){

        for(int i = 0; i <n-1 ; i++){
            int minIdx = i ;
            for(int j = i ; j < n ; j++){
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        for(int k = 0 ; k <n ; k++){
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args) {
        int []arr = {7,2,10,5,19,1};
        int n = arr.length;
        findSmalest(arr , n);

    }
}
