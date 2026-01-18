package algorithm;

public class BinarySearch {
    public static int search(int a[], int key){
        int l = 0 ;
        int r = a.length-1;

        while(l <= r){
            int mid = (r+l)/2;
            if(a[mid] ==key){
                return mid;
            } else if (a[mid] < key) {
                l = mid + 1;

            } else  {
                r = mid -1;

            }

        }
        return -1;


    }
    public static void main(String[] args) {
        int a[] = {25,57,19,21,40};
        int n = a.length;
//        int key = 40;


        int result = search(a,40);
        if(result == - 1)
        System.out.println("element not present in an array");
        else{
            System.out.println("element present at index " + result );
        }
    }
}
