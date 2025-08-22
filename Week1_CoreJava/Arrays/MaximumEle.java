package Arrays;

public class MaximumEle {
    public static void main(String[] args) {
        int arr[] = {19,10,20,10,199};
        int max = arr[0];
        for(int i = -0 ; i < arr.length ;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("the max element: " + max);
    }
}